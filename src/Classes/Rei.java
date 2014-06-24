/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Rei {

    private ArrayList<String> Possibilidades = new ArrayList();
    private ArrayList<String> Ameaca = new ArrayList(); // peças que ameaça o rei com cheque
    private String posicao;
    private String Nome;
    private String Cor;

    public void Movimento(int i, int j, String Tab[][], String Cor) {
        Possibilidades.removeAll(Possibilidades);
        int Linha = i, Coluna = j; //Atribuida as variaveis para poderem serem modificadas

        //Se a peça for branca
        if (Cor.equals("Branca")) {
            //Caso seja uma posição invalida
            try {
                //Se pode mover para frente, e se pode capturar uma peça
                if (Tab[Linha + 1][Coluna].equals("-Vazia-") || Tab[Linha + 1][Coluna].startsWith("P")) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para frente-direita, e se pode capturar uma peça
                if (Tab[Linha + 1][Coluna + 1].equals("-Vazia-") || Tab[Linha + 1][Coluna + 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para direita, e se pode capturar uma peça
                if (Tab[Linha][Coluna + 1].equals("-Vazia-") || Tab[Linha][Coluna + 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha) + "" + (Coluna + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para Trás-direita, e se pode capturar uma peça
                if (Tab[Linha - 1][Coluna + 1].equals("-Vazia-") || Tab[Linha - 1][Coluna + 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para Trás, e se pode capturar uma peça
                if (Tab[Linha - 1][Coluna].equals("-Vazia-") || Tab[Linha - 1][Coluna].startsWith("P")) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para Trás-esquerda, e se pode capturar uma peça
                if (Tab[Linha - 1][Coluna - 1].equals("-Vazia-") || Tab[Linha - 1][Coluna - 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para esquerda, e se pode capturar uma peça
                if (Tab[Linha][Coluna - 1].equals("-Vazia-") || Tab[Linha][Coluna - 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha) + "" + (Coluna - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para frente-esquerda, e se pode capturar uma peça
                if (Tab[Linha + 1][Coluna - 1].equals("-Vazia-") || Tab[Linha + 1][Coluna - 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

        }//senão for branca
        else {
            //Caso seja uma posição invalida
            try {
                //Se pode mover para frente, e se pode capturar uma peça
                if (Tab[Linha - 1][Coluna].equals("-Vazia-") || Tab[Linha + 1][Coluna].startsWith("P")) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para frente-direita, e se pode capturar uma peça
                if (Tab[Linha - 1][Coluna - 1].equals("-Vazia-") || Tab[Linha - 1][Coluna - 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para direita, e se pode capturar uma peça
                if (Tab[Linha][Coluna - 1].equals("-Vazia-") || Tab[Linha][Coluna - 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha) + "" + (Coluna - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para Trás-direita, e se pode capturar uma peça
                if (Tab[Linha + 1][Coluna - 1].equals("-Vazia-") || Tab[Linha + 1][Coluna - 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para Trás, e se pode capturar uma peça
                if (Tab[Linha + 1][Coluna].equals("-Vazia-") || Tab[Linha + 1][Coluna].startsWith("P")) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para Trás-esquerda, e se pode capturar uma peça
                if (Tab[Linha + 1][Coluna + 1].equals("-Vazia-") || Tab[Linha + 1][Coluna + 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para esquerda, e se pode capturar uma peça
                if (Tab[Linha][Coluna + 1].equals("-Vazia-") || Tab[Linha][Coluna + 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha) + "" + (Coluna + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                //Se pode mover para frente-esquerda, e se pode capturar uma peça
                if (Tab[Linha - 1][Coluna + 1].equals("-Vazia-") || Tab[Linha - 1][Coluna + 1].startsWith("P")) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
    }

    //Diminui os movimentos do rei, caso possa ficar em cheque
    public void PossibilidadesRei(Peao P[], Torre T[], Cavalo C[], Bispo B[], Rainha R) {

        //---------Verificar se tem peão ameaçando o rei-------------
        for (int x = 0; x < Possibilidades.size(); x++) { //percorre as possibilidades do rei
            for (int y = 0; y < P.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Peao = new ArrayList(); // lista para receber as possibilidades dos peoes
                Peao = P[y].getPossibilidades();
                for (int z = 0; z < Peao.size(); z++) {
                    if (Possibilidades.get(x).equals(Peao.get(z))) { // verificar se tem alguma possibilidade do peao igual a do rei
                        Possibilidades.remove(x);
                    }
                }
            }
        }

        //---------Verificar se tem torre ameaçando o rei-------------
        for (int x = 0; x < Possibilidades.size(); x++) { //percorre as possibilidades do rei
            for (int y = 0; y < T.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Torre = new ArrayList(); // lista para receber as possibilidades dos peoes
                Torre = T[y].getPossibilidades();
                for (int z = 0; z < Torre.size(); z++) {
                    if (Possibilidades.get(x).equals(Torre.get(z))) { // verificar se tem alguma possibilidade do peao igual a do rei
                        Possibilidades.remove(x);
                    }
                }
            }
        }

        //---------Verificar se tem Cavalo ameaçando o rei-------------
        for (int x = 0; x < Possibilidades.size(); x++) { //percorre as possibilidades do rei
            for (int y = 0; y < C.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Cavalo = new ArrayList(); // lista para receber as possibilidades dos peoes
                Cavalo = C[y].getPossibilidades();
                for (int z = 0; z < Cavalo.size(); z++) {
                    if (Possibilidades.get(x).equals(Cavalo.get(z))) { // verificar se tem alguma possibilidade do peao igual a do rei
                        Possibilidades.remove(x);
                    }
                }
            }
        }

        //---------Verificar se tem Bispo ameaçando o rei-------------
        for (int x = 0; x < Possibilidades.size(); x++) { //percorre as possibilidades do rei
            for (int y = 0; y < B.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Bispo = new ArrayList(); // lista para receber as possibilidades dos peoes
                Bispo = B[y].getPossibilidades();
                for (int z = 0; z < Bispo.size(); z++) {
                    if (Possibilidades.get(x).equals(Bispo.get(z))) { // verificar se tem alguma possibilidade do peao igual a do rei
                        Possibilidades.remove(x);
                    }
                }
            }
        }

        //---------Verificar se tem Rainha ameaçando o rei-------------
        ArrayList<String> Rainha = new ArrayList(); // lista para receber as possibilidades dos peoes
        Rainha = R.getPossibilidades();

        for (int x = 0; x < Possibilidades.size(); x++) { //percorre as possibilidades do rei
            for (int z = 0; z < Rainha.size(); z++) {
                if (Possibilidades.get(x).equals(Rainha.get(z))) { // verificar se tem alguma possibilidade do peao igual a do rei
                    Possibilidades.remove(x);
                }
            }
        }
    }
 /*   
    public boolean VerificarCheque(Peao P[], Torre T[], Cavalo C[], Bispo B[], Rainha R, String posicaoRei) {
        boolean Cheque = false;
        //---------Verificar se tem peão ameaçando o rei-------------
            for (int y = 0; y < P.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Peao = new ArrayList(); // lista para receber as possibilidades dos peoes
                Peao = P[y].getPossibilidades();
                for (int z = 0; z < Peao.size(); z++) {
                    if (posicaoRei.equals(Peao.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                        //Ameaca.add(P[y].getPosicao()); Tava armazenando as posições da ameaça
                        
                        Cheque = true;
                    }
                }
            }

        //---------Verificar se tem torre ameaçando o rei-------------
        
            for (int y = 0; y < T.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Torre = new ArrayList(); // lista para receber as possibilidades dos peoes
                Torre = T[y].getPossibilidades();
                for (int z = 0; z < Torre.size(); z++) {
                    if (posicaoRei.equals(Torre.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                        Ameaca.add(T[y].getPosicao());
                        Cheque = true;
                    }
                }
            }

        //---------Verificar se tem Cavalo ameaçando o rei-------------
            for (int y = 0; y < C.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Cavalo = new ArrayList(); // lista para receber as possibilidades dos peoes
                Cavalo = C[y].getPossibilidades();
                for (int z = 0; z < Cavalo.size(); z++) {
                    if (posicaoRei.equals(Cavalo.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                        Ameaca.add(C[y].getPosicao());
                        Cheque = true;
                    }
                }
            }

        //---------Verificar se tem Bispo ameaçando o rei-------------
            for (int y = 0; y < B.length; y++) {  // percorre o vetor de peões
                ArrayList<String> Bispo = new ArrayList(); // lista para receber as possibilidades dos peoes
                Bispo = B[y].getPossibilidades();
                for (int z = 0; z < Bispo.size(); z++) {
                    if (posicaoRei.equals(Bispo.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                        Ameaca.add(B[y].getPosicao());
                        Cheque = true;
                    }
                }
            }

        //---------Verificar se tem Rainha ameaçando o rei-------------
        ArrayList<String> Rainha = new ArrayList(); // lista para receber as possibilidades dos peoes
        Rainha = R.getPossibilidades();

            for (int z = 0; z < Rainha.size(); z++) {
                if (posicaoRei.equals(Rainha.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                    Ameaca.add(R.getPosicao());
                    Cheque = true;
                }
            }
            return Cheque;
    }
    
    public Object EscapeRei(Peao P[], Torre T[], Cavalo C[], Bispo B[], Rainha R,String Tabuleiro[][]){
        ArrayList<Object> PecaFuga = new ArrayList();
        for(int i=0; i < Ameaca.size(); i++){
            int Linha = Integer.parseInt(Ameaca.get(i).substring(0,1));
            int Coluna = Integer.parseInt(Ameaca.get(i).substring(1));
            
            String Peca = Tabuleiro[Linha][Coluna]; //pega o nome da peça
            
            //Verificar se a ameaça vem de um peão
            if(Peca.substring(0, 4).equals("BPeao")){
                for (int x=0; x < P.length; x++) { // busca qual é o peao
                    if (P[x].getPosicao().equals(""+Linha+""+Coluna)) {
                        P[x].Movimento(Linha, Coluna, Tabuleiro, Nome); //pega os movimentos do peao que ameaça o rei
                        
                        ArrayList<String> Mov = new ArrayList(); 
                        Mov = P[x].getPossibilidades(); //pega os movimentos da peça que ameaça o rei
                        
                        //--------------Verificar se tem uma peça para livrar o rei do cheque
                        
                        for(int y=0; y < Mov.size(); y++){
                            ArrayList<String> Peao = new ArrayList(); // lista para receber as possibilidades dos peoes
                            Peao = P[y].getPossibilidades();
                            for(int z = 0; z < Peao.size(); z++ ){
                                if(Mov.get(x).equals(Peao.get(z))){
                                    PecaFuga.add()
                                }
                            }
                        }
                        
                    }
                }
            }else if(Peca.substring(0, 4).equals("PPeao")){
                for (int x=0; x < P.length; x++) {
                    if (P[x].getPosicao().equals(""+Linha+""+Coluna)) {
                        P[x].Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(P[x]);
                    }
                }
            }else if(Peca.substring(0, 5).equals("BTorre")){
                for (int x=0; x < T.length; x++) {
                    if (T[x].getPosicao().equals(""+Linha+""+Coluna)) {
                        T[x].Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(T[x]);
                    }
                }
            }else if(Peca.substring(0, 5).equals("PTorre")){
                for (int x=0; x < T.length; x++) {
                    if (T[x].getPosicao().equals(""+Linha+""+Coluna)) {
                        T[x].Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(T[x]);
                    }
                }
            }else if(Peca.substring(0, 6).equals("BCavalo")){
                for (int x=0; x < B.length; x++) {
                    if (B[x].getPosicao().equals(""+Linha+""+Coluna)) {
                        B[x].Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(B[x]);
                    }
                }
            }else if(Peca.substring(0, 6).equals("PCavalo")){
                for (int x=0; x < B.length; x++) {
                    if (B[x].getPosicao().equals(""+Linha+""+Coluna)) {
                        B[x].Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(B[x]);
                    }
                }
            }else if(Peca.substring(0, 6).equals("BRainha")){
                    if (R.getPosicao().equals(""+Linha+""+Coluna)) {
                        R.Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(R);
                    }
            }else if(Peca.substring(0, 6).equals("PRainha")){
                if (R.getPosicao().equals(""+Linha+""+Coluna)) {
                        R.Movimento(Linha, Coluna, Tabuleiro, Nome);
                        PecaFuga.add(R);
                    }
            }
        }
        return PecaFuga;
    }
    
    public void PecaFuga(Object PecaFuga){
        for(){
            
        }
    }
*/
    public void Imprimir() {
        for (String Possibilidade : Possibilidades) {
            System.out.println(Possibilidade);
        }
    }

    public ArrayList<String> getPossibilidades() {
        return Possibilidades;
    }

    public void setPossibilidades(ArrayList<String> Possibilidades) {
        this.Possibilidades = Possibilidades;
    }

    public ArrayList<String> getAmeaca() {
        return Ameaca;
    }

    public void setAmeaca(ArrayList<String> Ameaca) {
        this.Ameaca = Ameaca;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
    
}
