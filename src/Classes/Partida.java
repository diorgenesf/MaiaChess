/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import Tela.TelaJogo;

/**
 *
 * @author Diorgenes
 */
public class Partida extends Thread {
    private String nick1;
    private String nick2;
    private int count;

    @Override
    public void run() {
        //Instancia Jogo
        
        /*
            A Thread funcionará enquanto o jogo não for finalizar, por isso,
            o jogo não é Thread.
        
            Se a função Jogar retornar 1 tem um jogador, se retornar 2 iniciar thread t.start;
            se não ocupada
        */
        new TelaJogo().setVisible(true);
    }
    
    public Partida()
    {
        this.nick1=null;
        this.nick2=null;
        this.count=0;
    }
    
    public synchronized int Jogar(String nick)
    {
        if(isSetNick1())
        {
            if(isSetNick2())
            {
                return this.count;
            }
            else
            {
                if(this.count==2)
                {
                    this.nick2 = nick;
                    this.count++;
                }
                return this.count;
            }
        }
        else
        {
            this.nick1 = nick;
            this.count++;
            return this.count;
        }
    }
    
    public boolean isSetNick1()
    {
        if(nick1==null)return false;
        else return true;
    }
    
    public boolean isSetNick2()
    {
        if(nick2==null)return false;
        else return true;
    }
    
}
