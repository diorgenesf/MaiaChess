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
public class Torre {

    private ArrayList<String> Possibilidades = new ArrayList();
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
                //Se pode mover casas na Vertical para frente, e se pode capturar uma peça
                while ((Tab[Linha + 1][Coluna].equals("-Vazia-") || Tab[Linha + 1][Coluna].startsWith("P")) && (Linha < 7)) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna));
                    if (Tab[Linha + 1][Coluna].startsWith("P")) {
                        break;
                    }
                    Linha++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            //Voltando as variaveis aos valores iniciais
            Linha = i;
            Coluna = j;
            //------------//

            try {
                //Se pode mover casas na Horizontal Direita, e se pode capturar uma peça
                while ((Tab[Linha][Coluna + 1].equals("-Vazia-") || Tab[Linha][Coluna + 1].startsWith("P")) && (Coluna < 7)) {
                    Possibilidades.add("" + (Linha) + "" + (Coluna + 1));
                    if (Tab[Linha][Coluna + 1].startsWith("P")) {
                        break;
                    }
                    Coluna++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            //Voltando as variaveis aos valores iniciais
            Linha = i;
            Coluna = j;
            //------------//

            try {
                //Se pode mover casas na vertical para Trás, e se pode capturar uma peça
                while ((Tab[Linha - 1][Coluna].equals("-Vazia-") || Tab[Linha - 1][Coluna].startsWith("P")) && (Linha > 0)) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna));
                    if (Tab[Linha - 1][Coluna].startsWith("P")) {
                        break;
                    }
                    Linha--;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            //Voltando as variaveis aos valores iniciais
            Linha = i;
            Coluna = j;
            //------------//

            try {
                //Se pode mover casas na Horizontal Esquerda, e se pode capturar uma peça
                while ((Tab[Linha][Coluna - 1].equals("-Vazia-") || Tab[Linha][Coluna - 1].startsWith("P")) && (Coluna > 0)) {
                    Possibilidades.add("" + Linha + "" + (Coluna - 1));
                    if (Tab[Linha][Coluna - 1].startsWith("P")) {
                        break;
                    }
                    Coluna--;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }//senão for branca
        else {
            //Caso seja uma posição invalida
            try {
                //Se pode mover casas na vertical para frente, e se pode capturar uma peça
                while ((Tab[Linha - 1][Coluna].equals("-Vazia-") || Tab[Linha - 1][Coluna].startsWith("B")) && (Linha > 0)) {
                    Possibilidades.add("" + (Linha - 1) + "" + (Coluna));
                    if (Tab[Linha - 1][Coluna].startsWith("B")) {
                        break;
                    }
                    Linha--;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            //Voltando as variaveis aos valores iniciais
            Linha = i;
            Coluna = j;
            //------------//

            try {
                //Se pode mover casas na Horizontal Direira, e se pode capturar uma peça
                while ((Tab[Linha][Coluna - 1].equals("-Vazia-") || Tab[Linha][Coluna - 1].startsWith("B")) && (Coluna > 0)) {
                    Possibilidades.add("" + Linha + "" + (Coluna - 1));
                    if (Tab[Linha][Coluna - 1].startsWith("B")) {
                        break;
                    }
                    Coluna--;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            //Voltando as variaveis aos valores iniciais
            Linha = i;
            Coluna = j;
            //------------//

            try {
                //Se pode mover casas na Vertical para trás, e se pode capturar uma peça
                while ((Tab[Linha + 1][Coluna].equals("-Vazia-") || Tab[Linha + 1][Coluna].startsWith("B")) && (Linha < 7)) {
                    Possibilidades.add("" + (Linha + 1) + "" + (Coluna));
                    if (Tab[Linha + 1][Coluna].startsWith("B")) {
                        break;
                    }
                    Linha++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            //Voltando as variaveis aos valores iniciais
            Linha = i;
            Coluna = j;
            //------------//

            try {
                //Se pode mover casas na Horizontal esquerda, e se pode capturar uma peça
                while ((Tab[Linha][Coluna + 1].equals("-Vazia-") || Tab[Linha][Coluna + 1].startsWith("B")) && (Coluna < 7)) {
                    Possibilidades.add("" + (Linha) + "" + (Coluna + 1));
                    if (Tab[Linha][Coluna + 1].startsWith("B")) {
                        break;
                    }
                    Coluna++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
    }

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
