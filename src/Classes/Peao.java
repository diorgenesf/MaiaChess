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
public class Peao {

    private ArrayList<String> Possibilidades = new ArrayList();
    private String posicao;
    private String Nome;
    private String Cor;

    public void Movimento(int i, int j, String Tab[][], String Cor) {
        //Se a peça for branca
        Possibilidades.removeAll(Possibilidades);
        if (Cor.equals("Branca")) {
            //Caso seja uma posição invalida
            try {
                //Primeiro movimento do peão
                if (i == 1) {
                    //Se pode mover duas casa para frente
                    if (Tab[i + 2][j].equals("-Vazia-")) {
                        Possibilidades.add("" + (i + 2) + "" + (j));
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                //Se pode mover uma casa para frente
                if (Tab[i + 1][j].equals("-Vazia-")) {
                    Possibilidades.add("" + (i + 1) + "" + (j));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                //Se pode capturar na diagonal esquerda
                if (Tab[i + 1][j - 1].startsWith("P")) {
                    Possibilidades.add("" + (i + 1) + "" + (j - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                //Se pode capturar na diagonal direita
                if (Tab[i + 1][j + 1].startsWith("P")) {
                    Possibilidades.add("" + (i + 1) + "" + (j + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }//senão for branca
        else {
            //Caso seja uma posição invalida
            try {
                //Primeiro movimento do peão
                if (i == 6) {
                    //Se pode mover duas casa para frente
                    if (Tab[i - 2][j].equals("-Vazia-")) {
                        Possibilidades.add("" + (i - 2) + "" + (j));
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                //Se pode mover uma casa para frente
                if (Tab[i - 1][j].equals("-Vazia-")) {
                    Possibilidades.add("" + (i - 1) + "" + (j));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                //Se pode capturar na diagonal esquerda
                if (Tab[i - 1][j + 1].startsWith("B")) {
                    Possibilidades.add("" + (i - 1) + "" + (j + 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                //Se pode capturar na diagonal direita
                if (Tab[i - 1][j - 1].startsWith("B")) {
                    Possibilidades.add("" + (i - 1) + "" + (j - 1));
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
    }

    public void Imprimir() {
        for (int i=0;i<Possibilidades.size();i++) {
            System.out.println(Possibilidades.get(i));
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
