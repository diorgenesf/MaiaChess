package ServerSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class GlobalChatServer extends Thread {
    private static Map<String, PrintStream> MAP_CLIENTES;
    private Socket conexao;
    private String nomeCliente;
    private static List<String> ListNicks = new ArrayList<String>();

    public GlobalChatServer(Socket socket) {
        this.conexao = socket;
    }

    public void armazena(String newName) {
        
        for (int i = 0; i < ListNicks.size(); i++) {
            if (ListNicks.get(i).equals(newName))
                return;
        }
        ListNicks.add(newName);
    }

    public void remove(String oldName) {
        for (int i = 0; i < ListNicks.size(); i++) {
            if (ListNicks.get(i).equals(oldName))
                ListNicks.remove(oldName);
        }
    }

    public static void main(String args[]) {
        MAP_CLIENTES = new HashMap<String, PrintStream>();
        try {
            ServerSocket server = new ServerSocket(5555);
            System.out.println("GlobalChat rodando na porta 5555");
            while (true) {
                Socket conexao = server.accept();
                Thread t = new GlobalChatServer(conexao);
                t.start();
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }

    public void run() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(this.conexao.getInputStream()));
            PrintStream saida = new PrintStream(this.conexao.getOutputStream());
            this.nomeCliente = entrada.readLine();
            
            armazena(this.nomeCliente);
            //mostra o nome do cliente conectado ao servidor
            System.out.println(this.nomeCliente + " : Conectado ao Servidor!");

            if (this.nomeCliente == null) {
                return;
            }
            //adiciona os dados de saida do cliente no objeto MAP_CLIENTES
            //A chave sera o nome e valor o printstream
            MAP_CLIENTES.put(this.nomeCliente, saida);
            
            //envia lista para todos assim que qualquer cliente se conecta
            sendListToAll();

            String[] msg = entrada.readLine().split(":");
            while (!msg[0].equals("<exit-u>")) {
                System.out.println("Message: "+msg[0]);
                send(saida, ": ", msg);
                msg = entrada.readLine().split(":");
            }
            System.out.println(this.nomeCliente + " saiu do bate-papo!");
            String[] out = {" do bate-papo!"};
            send(saida, " saiu", out);
            remove(this.nomeCliente);

            MAP_CLIENTES.remove(this.nomeCliente);

            this.conexao.close();
        } catch (IOException e) {
            System.out.println("Falha na Conexao... .. ." + " IOException: " + e);
        }
    }

    /**
     * Se o array da msg tiver tamanho igual a 1, entao envia para todos
     * Se o tamanho for 2, envia apenas para o cliente escolhido
     */
    public void send(PrintStream saida, String acao, String[] msg) {
        out:
        for (Map.Entry<String, PrintStream> cliente : MAP_CLIENTES.entrySet()) {
            PrintStream chat = cliente.getValue();
            if (msg.length == 1) {
                chat.println(this.nomeCliente + acao + msg[0]);
            } else {
                chat.println(this.nomeCliente + acao + msg[0]);
                break out;
            }
        }
    }
    
    public void sendListToAll() {
        for (Map.Entry<String, PrintStream> cliente : MAP_CLIENTES.entrySet()) {
            String aux = "";
            for (String s : ListNicks) {
                aux += s + " ";
            }
            System.out.println("SendListToAll: "+aux);
            PrintStream chat = cliente.getValue();
            chat.println("<users:" + aux + ">");
            chat.flush();
        }
    }
}