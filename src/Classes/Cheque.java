/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

public class Cheque {

    ArrayList<Object> Ameaca = new ArrayList(); // Vetor com varios vetores dentro

    public boolean VerificarCheque(Peao P[], Torre T[], Cavalo C[], Bispo B[], Rainha R, String posicaoRei) {
        System.out.println("======================> Veio ver se tem cheque");
        boolean Cheque = false;
        //---------Verificar se tem peão ameaçando o rei-------------
        for (int y = 0; y < P.length; y++) {  // percorre o vetor de peões
            ArrayList<String> Peao = new ArrayList(); // lista para receber as possibilidades dos peoes
            Peao = P[y].getPossibilidades();
            for (int z = 0; z < Peao.size(); z++) {
                if (posicaoRei.equals(Peao.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                    //Ameaca.add(P[y].getPosicao()); Tava armazenando as posições da ameaça

                    Ameaca.add(P[y]);
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
                    //Ameaca.add(T[y].getPosicao());

                    Ameaca.add(T[y]);
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
                    //Ameaca.add(C[y].getPosicao());

                    Ameaca.add(C[y]);
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
                    //Ameaca.add(B[y].getPosicao());

                    Ameaca.add(B[y]);
                    Cheque = true;
                }
            }
        }

        //---------Verificar se tem Rainha ameaçando o rei-------------
        ArrayList<String> Rainha = new ArrayList(); // lista para receber as possibilidades dos peoes
        Rainha = R.getPossibilidades();

        for (int z = 0; z < Rainha.size(); z++) {
            if (posicaoRei.equals(Rainha.get(z))) { // verificar se a posição do rei é uma possibilidade de alguma peça
                //Ameaca.add(R.getPosicao());

                Ameaca.add(R);
                Cheque = true;
            }
        }
        return Cheque;
    }

    public ArrayList EscapeRei(Peao PeaoB[], Peao PeaoP[], Torre TorreB[], Torre TorreP[],
            Cavalo CavaloB[], Cavalo CavaloP[], Bispo BispoB[], Bispo BispoP[],
            Rainha RainhaB, Rainha RainhaP, String Tabuleiro[][], String Cor) {

        ArrayList<Object> PecaFuga = new ArrayList();

        for (int i = 0; i < Ameaca.size(); i++) {
            //Verificar se a ameaça vem de um peão
            if (Ameaca.get(i) instanceof Peao) {
                Peao P = new Peao();
                P = (Peao) Ameaca.get(i); //casting de objeto para o tipo especifico

                int Linha = Integer.parseInt(P.getPosicao().substring(0, 1)); //pega o primeiro caracter(Linha)
                int Coluna = Integer.parseInt(P.getPosicao().substring(1));  //pega o segundo caracter(Coluna)

                ArrayList<String> Mov = new ArrayList();
                Mov = P.getPossibilidades(); //pega os movimentos da peça que ameaça o rei

                if (Cor.equals("Branca")) {
                    P.Movimento(Linha, Coluna, Tabuleiro, "Preta"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(P.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoB.length; y++) {
                            MovPeao = PeaoB[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoB[y]);
                                    //PecaFuga.add(PeaoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreB.length; y++) {
                            MovTorre = TorreB[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreB[y]);
                                    //PecaFuga.add(TorreB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloB.length; y++) {
                            MovCavalo = CavaloB[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloB[y]);
                                    //PecaFuga.add(CavaloB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoB.length; y++) {
                            MovBispo = BispoB[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoB[y]);
                                    //PecaFuga.add(BispoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaB.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaB);
                                //PecaFuga.add(RainhaB.getPosicao());
                            }
                        }
                    }
                } else {
                    P.Movimento(Linha, Coluna, Tabuleiro, "Branca"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(P.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoP.length; y++) {
                            MovPeao = PeaoP[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoP[y]);
                                    //PecaFuga.add(PeaoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreP.length; y++) {
                            MovTorre = TorreP[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreP[y]);
                                    //PecaFuga.add(TorreP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloP.length; y++) {
                            MovCavalo = CavaloP[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloP[y]);
                                    //PecaFuga.add(CavaloP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoP.length; y++) {
                            MovBispo = BispoP[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoP[y]);
                                    //PecaFuga.add(BispoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaP.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaP);
                                //PecaFuga.add(RainhaP.getPosicao());
                            }
                        }
                    }
                }
            }

            //Verificar se a ameaça vem de uma Torre
            if (Ameaca.get(i) instanceof Torre) {
                Torre T = new Torre();
                T = (Torre) Ameaca.get(i); //casting de objeto para o tipo especifico

                int Linha = Integer.parseInt(T.getPosicao().substring(0, 1)); //pega o primeiro caracter(Linha)
                int Coluna = Integer.parseInt(T.getPosicao().substring(1));  //pega o segundo caracter(Coluna)

                ArrayList<String> Mov = new ArrayList();
                Mov = T.getPossibilidades(); //pega os movimentos da peça que ameaça o rei

                if (Cor.equals("Branca")) {
                    T.Movimento(Linha, Coluna, Tabuleiro, "Preta"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(T.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoB.length; y++) {
                            MovPeao = PeaoB[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoB[y]); 
                                    //PecaFuga.add(PeaoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreB.length; y++) {
                            MovTorre = TorreB[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreB[y]);
                                    //PecaFuga.add(TorreB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloB.length; y++) {
                            MovCavalo = CavaloB[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloB[y]);
                                    //PecaFuga.add(CavaloB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoB.length; y++) {
                            MovBispo = BispoB[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoB[y]);
                                    //PecaFuga.add(BispoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaB.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaB);
                                //PecaFuga.add(RainhaB.getPosicao());
                            }
                        }
                    }
                } else {
                    T.Movimento(Linha, Coluna, Tabuleiro, "Branca"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(T.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoP.length; y++) {
                            MovPeao = PeaoP[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoP[y]);
                                    //PecaFuga.add(PeaoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreP.length; y++) {
                            MovTorre = TorreP[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreP[y]);
                                    //PecaFuga.add(TorreP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloP.length; y++) {
                            MovCavalo = CavaloP[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloP[y]);
                                    //PecaFuga.add(CavaloP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoP.length; y++) {
                            MovBispo = BispoP[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoP[y]);
                                    //PecaFuga.add(BispoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaP.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaP);
                                //PecaFuga.add(RainhaP.getPosicao());
                            }
                        }
                    }
                }
            }

            //Verificar se a ameaça vem de uma Cavalo
            if (Ameaca.get(i) instanceof Cavalo) {
                Cavalo C = new Cavalo();
                C = (Cavalo) Ameaca.get(i); //casting de objeto para o tipo especifico

                int Linha = Integer.parseInt(C.getPosicao().substring(0, 1)); //pega o primeiro caracter(Linha)
                int Coluna = Integer.parseInt(C.getPosicao().substring(1));  //pega o segundo caracter(Coluna)

                ArrayList<String> Mov = new ArrayList();
                Mov = C.getPossibilidades(); //pega os movimentos da peça que ameaça o rei

                if (Cor.equals("Branca")) {
                    C.Movimento(Linha, Coluna, Tabuleiro, "Preta"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(C.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoB.length; y++) {
                            MovPeao = PeaoB[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoB[y]); 
                                    //PecaFuga.add(PeaoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreB.length; y++) {
                            MovTorre = TorreB[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreB[y]);
                                    //PecaFuga.add(TorreB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloB.length; y++) {
                            MovCavalo = CavaloB[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloB[y]);
                                    //PecaFuga.add(CavaloB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoB.length; y++) {
                            MovBispo = BispoB[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoB[y]);
                                    //PecaFuga.add(BispoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaB.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaB);
                                //PecaFuga.add(RainhaB.getPosicao());
                            }
                        }
                    }
                } else {
                    C.Movimento(Linha, Coluna, Tabuleiro, "Branca"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(C.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoP.length; y++) {
                            MovPeao = PeaoP[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoP[y]);
                                    //PecaFuga.add(PeaoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreP.length; y++) {
                            MovTorre = TorreP[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreP[y]);
                                    //PecaFuga.add(TorreP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloP.length; y++) {
                            MovCavalo = CavaloP[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloP[y]);
                                    //PecaFuga.add(CavaloP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoP.length; y++) {
                            MovBispo = BispoP[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoP[y]);
                                    //PecaFuga.add(BispoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaP.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaP);
                                //PecaFuga.add(RainhaP.getPosicao());
                            }
                        }
                    }
                }
            }

            //Verificar se a ameaça vem de uma Bispo
            if (Ameaca.get(i) instanceof Bispo) {
                Bispo B = new Bispo();
                B = (Bispo) Ameaca.get(i); //casting de objeto para o tipo especifico

                int Linha = Integer.parseInt(B.getPosicao().substring(0, 1)); //pega o primeiro caracter(Linha)
                int Coluna = Integer.parseInt(B.getPosicao().substring(1));  //pega o segundo caracter(Coluna)

                ArrayList<String> Mov = new ArrayList();
                Mov = B.getPossibilidades(); //pega os movimentos da peça que ameaça o rei

                if (Cor.equals("Branca")) {
                    B.Movimento(Linha, Coluna, Tabuleiro, "Preta"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(B.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoB.length; y++) {
                            MovPeao = PeaoB[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoB[y]); 
                                    //PecaFuga.add(PeaoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreB.length; y++) {
                            MovTorre = TorreB[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreB[y]);
                                   // PecaFuga.add(TorreB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloB.length; y++) {
                            MovCavalo = CavaloB[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloB[y]);
                                    //PecaFuga.add(CavaloB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoB.length; y++) {
                            MovBispo = BispoB[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoB[y]);
                                    //PecaFuga.add(BispoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaB.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaB);
                                //PecaFuga.add(RainhaB.getPosicao());
                            }
                        }
                    }
                } else {
                    B.Movimento(Linha, Coluna, Tabuleiro, "Branca"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(B.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoP.length; y++) {
                            MovPeao = PeaoP[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoP[y]);
                                    //PecaFuga.add(PeaoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreP.length; y++) {
                            MovTorre = TorreP[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreP[y]);
                                    //PecaFuga.add(TorreP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloP.length; y++) {
                            MovCavalo = CavaloP[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloP[y]);
                                    //PecaFuga.add(CavaloP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoP.length; y++) {
                            MovBispo = BispoP[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoP[y]);
                                    //PecaFuga.add(BispoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaP.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                               PecaFuga.add(RainhaP);
                               //PecaFuga.add(RainhaP.getPosicao());
                            }
                        }
                    }
                }
            }

            //Verificar se a ameaça vem de uma Rainha
            if (Ameaca.get(i) instanceof Rainha) {
                Rainha R = new Rainha();
                R = (Rainha) Ameaca.get(i); //casting de objeto para o tipo especifico

                int Linha = Integer.parseInt(R.getPosicao().substring(0, 1)); //pega o primeiro caracter(Linha)
                int Coluna = Integer.parseInt(R.getPosicao().substring(1));  //pega o segundo caracter(Coluna)

                ArrayList<String> Mov = new ArrayList();
                Mov = R.getPossibilidades(); //pega os movimentos da peça que ameaça o rei

                if (Cor.equals("Branca")) {
                    R.Movimento(Linha, Coluna, Tabuleiro, "Preta"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(R.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoB.length; y++) {
                            MovPeao = PeaoB[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoB[y]);
                                    //PecaFuga.add(PeaoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreB.length; y++) {
                            MovTorre = TorreB[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreB[y]);
                                   // PecaFuga.add(TorreB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloB.length; y++) {
                            MovCavalo = CavaloB[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloB[y]);
                                    //PecaFuga.add(CavaloB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoB.length; y++) {
                            MovBispo = BispoB[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoB[y]);
                                    //PecaFuga.add(BispoB[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaB.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                //PecaFuga.add(RainhaB);
                                PecaFuga.add(RainhaB.getPosicao());
                            }
                        }
                    }
                } else {
                    R.Movimento(Linha, Coluna, Tabuleiro, "Branca"); //pega os movimentos do peao que ameaça o rei
                    Mov.add(R.getPosicao()); //adiciona a posição da peça, por que ela pode ser capturada para livrar o rei

                    //--------------Verificar se tem uma peça para livrar o rei do cheque (peao)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovPeao = new ArrayList(); // lista para receber as possibilidades dos peoes
                        for (int y = 0; y < PeaoP.length; y++) {
                            MovPeao = PeaoP[y].getPossibilidades();//Pega os movimetos dos peoes
                            for (int z = 0; z < MovPeao.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovPeao.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(PeaoP[y]);
                                    //PecaFuga.add(PeaoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Torre)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovTorre = new ArrayList(); // lista para receber as possibilidades das torres
                        for (int y = 0; y < TorreP.length; y++) {
                            MovTorre = TorreP[y].getPossibilidades();//Pega os movimetos das torres
                            for (int z = 0; z < MovTorre.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovTorre.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(TorreP[y]);
                                    //PecaFuga.add(TorreP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Cavalo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovCavalo = new ArrayList(); // lista para receber as possibilidades dos cavalos
                        for (int y = 0; y < CavaloP.length; y++) {
                            MovCavalo = CavaloP[y].getPossibilidades();//Pega os movimetos dos cavalor
                            for (int z = 0; z < MovCavalo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovCavalo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(CavaloP[y]);
                                    //PecaFuga.add(CavaloP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Bispo)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovBispo = new ArrayList(); // lista para receber as possibilidades dos bispo
                        for (int y = 0; y < BispoP.length; y++) {
                            MovBispo = BispoP[y].getPossibilidades();//Pega os movimetos dos bispo
                            for (int z = 0; z < MovBispo.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                                if (Mov.get(x).equals(MovBispo.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                    PecaFuga.add(BispoP[y]);
                                    //PecaFuga.add(BispoP[y].getPosicao());
                                }
                            }
                        }
                    }
                    //--------------Verificar se tem uma peça para livrar o rei do cheque (Rainha)
                    for (int x = 0; x < Mov.size(); x++) {
                        ArrayList<String> MovRainha = new ArrayList(); // lista para receber as possibilidades da rainha

                        MovRainha = RainhaP.getPossibilidades();//Pega os movimetos da rainha
                        for (int z = 0; z < MovRainha.size(); z++) { //Pecorre o o array de movimentos para efetuar as comparaçoes
                            if (Mov.get(x).equals(MovRainha.get(z))) { //Verificar se tem um peça para entrar na frente do rei
                                PecaFuga.add(RainhaP);
                                //PecaFuga.add(RainhaP.getPosicao());
                            }
                        }
                    }
                }
            }

            //se foit amnfglanbdfgbad anjg
        }
        return PecaFuga;
    }
}
