/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author maivo
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria()==l2.getCategoria()&&l1!=l2){
            this.aprovada=true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("####desafiado##");
            this.desafiado.apresentar();
            System.out.println("####desafiante####");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("empatou");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                  break;  
                case 1:
                    System.out.println("vitoria do "+this.desafiado.getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                  break;
                case 2:
                    System.out.println("vitoria do "+this.desafiante.getNome());
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                  break;
            }
            
        }else{
            System.out.println("a luta nao pode acontecer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
