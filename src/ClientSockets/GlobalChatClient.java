package ClientSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.DefaultListModel;

public class GlobalChatClient extends Thread {
    // parte que controla a recepcao de mensagens do cliente
    private Socket conexao;
    private String Msg;
    private javax.swing.JTextArea CampoTexto;
    private javax.swing.JList UsuariosOnline;
    private DefaultListModel model;
    
    // construtor que recebe o socket do clPiente
    public GlobalChatClient(Socket socket, javax.swing.JTextArea cpt,javax.swing.JList usuarios) {
        this.model = new DefaultListModel();
        this.UsuariosOnline = usuarios;
        usuarios.setModel(model);
        this.CampoTexto = cpt;
        this.conexao = socket;
    }
    
    public static void main(String args[])
    {
        try {
            //Instancia do atributo conexao do tipo Socket, conecta a IP do Servidor, Porta
            Socket socket = new Socket("127.0.0.1", 5555);
            //Instancia do atributo saida, obtem os objetos que permitem controlar o fluxo de comunicacao
            PrintStream saida = new PrintStream(socket.getOutputStream());
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            
            //System.out.print("Digite seu nome: ");
            //String meuNome = teclado.readLine();
            //envia o nome digitado para o servidor
            //saida.println(meuNome.toUpperCase());
            //instancia a thread para ip e porta conectados e depois inicia ela
            //Thread thread = new GlobalChatClient(socket);
            //thread.start();
            
            //Cria a variavel this.Msg responsavel por enviar a mensagem para o servidor
            String msg;
            while (true)
            {
                // cria linha para digitacao da mensagem e a armazena na variavel this.Msg
                System.out.print("Mensagem > ");
                msg = teclado.readLine();
                // envia a mensagem para o servidor
                saida.println(msg);
            }
        } catch (IOException e) {
            System.out.println("Falha na Conexao... .. ." + " IOException: " + e);
        }
    }
    // execu��o da thread
    public void run()
    {
        //saida.println(this.Nick);
        try {
            //recebe mensagens de outro cliente atraves do servidor
            BufferedReader entrada = new BufferedReader(new InputStreamReader(this.conexao.getInputStream()));
            //cria variavel de mensagem
            while (true)
            {
                // pega o que o servidor enviou
                this.Msg = entrada.readLine();
                //se a mensagem contiver dados, passa pelo if, caso contrario cai no break e encerra a conexao
                if (this.Msg == "<exit>") {
                    System.out.println("Conexao encerrada!");
                    System.exit(0);
                }
                //System.out.println();
                //imprime a mensagem recebida
                //System.out.println(this.Msg);
                //System.out.println("Mensagem: "+Msg);
                String tag = "<users:";
                if(Msg.length()>tag.length() && Msg.substring(0, tag.length()).equals("<users:"))
                {
                    String[] users = Msg.substring(tag.length(), Msg.length()-1).split(" ");
                    this.model.removeAllElements();
                    for (String user : users) {
                        this.model.addElement(user);
                    }
                }
                else
                {
                    this.CampoTexto.setText(this.CampoTexto.getText()+Msg+"\n");
                    CampoTexto.setLocation(CampoTexto.getLineCount()-1, 0);
                    CampoTexto.setCaretPosition(CampoTexto.getDocument().getLength());
                }
                //cria uma linha visual para resposta
                //System.out.print("Responder > ");
            }
        } catch (IOException e) {
            // caso ocorra alguma excecao de E/S, mostra qual foi.
            System.out.println("Ocorreu uma Falha... .. ." + " IOException: " + e);
        }
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }
}
