/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class TestandoTudo {
        int Linha = 2, Coluna = 6;
        String Peca = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
        System.err.println(Peca);
        String Cor = Tabuleiro[Linha][Coluna].substring(0, 1);
        if (Jogador) { //peças brancas
            switch (Peca) {
                case "Peao":
                    if (Cor.equals("B")) {
                        if (Cheque) { //se o rei estiver em cheque
                            System.out.println("Está em cheque");
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Peao) {
                                    Peao P = new Peao();
                                    P = (Peao) PecaFuga.get(i); //casting
                                    if (P.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10)); //Seleciona  a peça
                            Select.CorPecaSelecionada = "B";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("B")) { //Captura
                            System.out.println("Capturar Branca");
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoB[Select.indice].getPossibilidades();
                                    PeaoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreB[Select.indice].getPossibilidades();
                                    TorreB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloB[Select.indice].getPossibilidades();
                                    CavaloB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoB[Select.indice].getPossibilidades();
                                    BispoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaB.getPossibilidades();
                                    RainhaB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiB.getPossibilidades();
                                    ReiB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Torre":
                    if (Cor.equals("B")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Torre) {
                                    Torre T = new Torre();
                                    T = (Torre) PecaFuga.get(i); //casting
                                    if (T.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "B";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("B")) { //Captura
                            System.out.println("Capturar Branca");
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    PeaoB[Select.indice].Imprimir();
                                    Mov = PeaoB[Select.indice].getPossibilidades();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            MoverPeca(Linha, Coluna, jButton26);
                                            PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreB[Select.indice].getPossibilidades();
                                    TorreB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloB[Select.indice].getPossibilidades();
                                    CavaloB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoB[Select.indice].getPossibilidades();
                                    BispoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaB.getPossibilidades();
                                    RainhaB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiB.getPossibilidades();
                                    ReiB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Cavalo":
                    if (Cor.equals("B")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Cavalo) {
                                    Cavalo C = new Cavalo();
                                    C = (Cavalo) PecaFuga.get(i); //casting
                                    if (C.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "B";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("B")) { //Captura
                            System.out.println("Capturar Branca");
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoB[Select.indice].getPossibilidades();
                                    PeaoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreB[Select.indice].getPossibilidades();
                                    TorreB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloB[Select.indice].getPossibilidades();
                                    CavaloB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoB[Select.indice].getPossibilidades();
                                    BispoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaB.getPossibilidades();
                                    RainhaB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiB.getPossibilidades();
                                    ReiB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Bispo":
                    if (Cor.equals("B")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Bispo) {
                                    Bispo B = new Bispo();
                                    B = (Bispo) PecaFuga.get(i); //casting
                                    if (B.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "B";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("B")) { //Captura
                            System.out.println("Capturar Branca");
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoB[Select.indice].getPossibilidades();
                                    PeaoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreB[Select.indice].getPossibilidades();
                                    TorreB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloB[Select.indice].getPossibilidades();
                                    CavaloB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoB[Select.indice].getPossibilidades();
                                    BispoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaB.getPossibilidades();
                                    RainhaB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiB.getPossibilidades();
                                    ReiB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Rainha":
                    System.err.println("Veio na rainha");
                    if (Cor.equals("B")) {
                        System.err.println("Veio na rainha Branca");
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Rainha) {
                                    Rainha R = new Rainha();
                                    R = (Rainha) PecaFuga.get(i); //casting
                                    if (R.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "B";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("B")) { //Captura
                            System.out.println("Capturar Branca");
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoB[Select.indice].getPossibilidades();
                                    PeaoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreB[Select.indice].getPossibilidades();
                                    TorreB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);

                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloB[Select.indice].getPossibilidades();
                                    CavaloB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoB[Select.indice].getPossibilidades();
                                    BispoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaB.getPossibilidades();
                                    RainhaB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiB.getPossibilidades();
                                    ReiB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Rei":
                    if (Cor.equals("B")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Rei) {
                                    Rei rei = new Rei();
                                    rei = (Rei) PecaFuga.get(i); //casting
                                    if (rei.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "B";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("B")) { //Captura
                            System.out.println("Capturar Branca");
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoB[Select.indice].getPossibilidades();
                                    PeaoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreB[Select.indice].getPossibilidades();
                                    TorreB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloB[Select.indice].getPossibilidades();
                                    CavaloB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoB[Select.indice].getPossibilidades();
                                    BispoB[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaB.getPossibilidades();
                                    RainhaB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiB.getPossibilidades();
                                    ReiB.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiB.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Vazia":
                    System.err.println("Casa Vazia");
                    if (Select.Status) {
                        ArrayList<String> Mov = new ArrayList();
                        switch (Select.PecaSelecionada) {  //verificar peça selecionada
                            case "Peao":
                                Mov = PeaoB[Select.indice].getPossibilidades();
                                PeaoB[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        PeaoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Torre":
                                Mov = TorreB[Select.indice].getPossibilidades();
                                TorreB[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        TorreB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Cavalo":
                                Mov = CavaloB[Select.indice].getPossibilidades();
                                CavaloB[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        CavaloB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Bispo":
                                Mov = BispoB[Select.indice].getPossibilidades();
                                BispoB[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        BispoB[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Rainha":
                                Mov = RainhaB.getPossibilidades();
                                RainhaB.Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        RainhaB.setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Rei":
                                Mov = ReiB.getPossibilidades();
                                ReiB.Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        ReiB.setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        } else { //peças pretas
            switch (Peca) {
                case "Peao":
                    if (Cor.equals("P")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Peao) {
                                    Peao P = new Peao();
                                    P = (Peao) PecaFuga.get(i); //casting
                                    if (P.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "P";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("P")) { //Captura
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoP[Select.indice].getPossibilidades();
                                    PeaoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreP[Select.indice].getPossibilidades();
                                    TorreP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloP[Select.indice].getPossibilidades();
                                    CavaloP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoP[Select.indice].getPossibilidades();
                                    BispoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaP.getPossibilidades();
                                    RainhaP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiP.getPossibilidades();
                                    ReiP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Torre":
                    if (Cor.equals("P")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Torre) {
                                    Torre T = new Torre();
                                    T = (Torre) PecaFuga.get(i); //casting
                                    if (T.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "P";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("P")) { //Captura
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoP[Select.indice].getPossibilidades();
                                    PeaoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreP[Select.indice].getPossibilidades();
                                    TorreP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloP[Select.indice].getPossibilidades();
                                    CavaloP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoP[Select.indice].getPossibilidades();
                                    BispoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaP.getPossibilidades();
                                    RainhaP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiP.getPossibilidades();
                                    ReiP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Cavalo":
                    if (Cor.equals("P")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Cavalo) {
                                    Cavalo C = new Cavalo();
                                    C = (Cavalo) PecaFuga.get(i); //casting
                                    if (C.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "P";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("P")) { //Captura
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoP[Select.indice].getPossibilidades();
                                    PeaoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreP[Select.indice].getPossibilidades();
                                    TorreP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloP[Select.indice].getPossibilidades();
                                    CavaloP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoP[Select.indice].getPossibilidades();
                                    BispoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaP.getPossibilidades();
                                    RainhaP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiP.getPossibilidades();
                                    ReiP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Bispo":
                    if (Cor.equals("P")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Bispo) {
                                    Bispo B = new Bispo();
                                    B = (Bispo) PecaFuga.get(i); //casting
                                    if (B.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "P";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("P")) { //Captura
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoP[Select.indice].getPossibilidades();
                                    PeaoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreP[Select.indice].getPossibilidades();
                                    TorreP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloP[Select.indice].getPossibilidades();
                                    CavaloP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoP[Select.indice].getPossibilidades();
                                    BispoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaP.getPossibilidades();
                                    RainhaP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiP.getPossibilidades();
                                    ReiP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Rainha":
                    if (Cor.equals("P")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Rainha) {
                                    Rainha R = new Rainha();
                                    R = (Rainha) PecaFuga.get(i); //casting
                                    if (R.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "P";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;

                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("P")) { //Captura
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoP[Select.indice].getPossibilidades();
                                    PeaoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreP[Select.indice].getPossibilidades();
                                    TorreP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloP[Select.indice].getPossibilidades();
                                    CavaloP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoP[Select.indice].getPossibilidades();
                                    BispoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaP.getPossibilidades();
                                    RainhaP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiP.getPossibilidades();
                                    ReiP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Rei":
                    if (Cor.equals("P")) {
                        if (Cheque) { //se o rei estiver em cheque
                            for (int i = 0; i < PecaFuga.size(); i++) { //verificar se tem uma peca de fuga
                                //verificar qual é peça que tem no objeto
                                if (PecaFuga.get(i) instanceof Rei) {
                                    Rei rei = new Rei();
                                    rei = (Rei) PecaFuga.get(i); //casting
                                    if (rei.getPosicao().equals(Linha + "" + Coluna)) {
                                        jButton26.setBackground(new Color(61, 239, 235, 10)); // seleciona a peça
                                    }

                                }
                            }
                        } else if (Select.Status && (Select.PosicaoPecaSelecionada.equals(Linha + "" + Coluna))) { //Desmarcar a peça selecionada
                            jButton26.setBackground(new Color(0, 0, 0, 0));
                            Select.Status = false;
                        } else if (!Select.Status) {
                            jButton26.setBackground(new Color(61, 239, 235, 10));
                            Select.CorPecaSelecionada = "P";
                            Select.PecaSelecionada = Tabuleiro[Linha][Coluna].substring(1, Tabuleiro[Linha][Coluna].length() - 1);
                            Select.PosicaoPecaSelecionada = Linha + "" + Coluna;
                            Select.indice = Integer.parseInt(Tabuleiro[Linha][Coluna].substring(Tabuleiro[Linha][Coluna].length() - 1));
                            Select.Status = true;
                        }
                    } else {
                        if (Select.Status && Select.CorPecaSelecionada.equals("P")) { //Captura
                            ArrayList<String> Mov = new ArrayList();
                            switch (Select.PecaSelecionada) {  //verificar peça selecionada
                                case "Peao":
                                    Mov = PeaoP[Select.indice].getPossibilidades();
                                    PeaoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Torre":
                                    Mov = TorreP[Select.indice].getPossibilidades();
                                    TorreP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Cavalo":
                                    Mov = CavaloP[Select.indice].getPossibilidades();
                                    CavaloP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Bispo":
                                    Mov = BispoP[Select.indice].getPossibilidades();
                                    BispoP[Select.indice].Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rainha":
                                    Mov = RainhaP.getPossibilidades();
                                    RainhaP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            RainhaP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                                case "Rei":
                                    Mov = ReiP.getPossibilidades();
                                    ReiP.Imprimir();
                                    for (int i = 0; i < Mov.size(); i++) {
                                        if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                            ReiP.setPosicao("" + Linha + "" + Coluna);
                                            MoverPeca(Linha, Coluna, jButton26);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case "Vazia":
                    System.err.println("Casa Vazia");
                    if (Select.Status) {
                        ArrayList<String> Mov = new ArrayList();
                        switch (Select.PecaSelecionada) {  //verificar peça selecionada
                            case "Peao":
                                Mov = PeaoP[Select.indice].getPossibilidades();
                                PeaoP[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        PeaoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);

                                    }
                                }
                                break;
                            case "Torre":
                                Mov = TorreP[Select.indice].getPossibilidades();
                                TorreP[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        TorreP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Cavalo":
                                Mov = CavaloP[Select.indice].getPossibilidades();
                                CavaloP[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        CavaloP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Bispo":
                                Mov = BispoP[Select.indice].getPossibilidades();
                                BispoP[Select.indice].Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        BispoP[Select.indice].setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Rainha":
                                Mov = RainhaP.getPossibilidades();
                                RainhaP.Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        RainhaP.setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                            case "Rei":
                                Mov = ReiP.getPossibilidades();
                                ReiP.Imprimir();
                                for (int i = 0; i < Mov.size(); i++) {
                                    if (Mov.get(i).equals(Linha + "" + Coluna)) {
                                        ReiP.setPosicao("" + Linha + "" + Coluna);
                                        MoverPeca(Linha, Coluna, jButton26);
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
}
