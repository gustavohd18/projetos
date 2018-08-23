/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author maivo
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[]= new Lutador[6]; 
        l[0] = new Lutador("eria","franca",31,1.75f,68.9f,11,2,1);
        l[1]=new Lutador("pusscript","brasil",29,1.65f,57.9f,14,2,3);
        l[2] = new Lutador("gustavo","eua",23,1.72f,80.9f,12,3,4);
        l[3] = new Lutador("julia","angola",23,1.72f,81.6f,17,1,8);
        l[4] = new Lutador("pedro","brasil",28,1.79f,119.3f,12,3,4);
        l[5] = new Lutador("matheus","eua",28,1.82f,105.7f,12,3,4);
        
        Luta uec01 = new  Luta();
        uec01.marcarLuta(l[1], l[0]);
        uec01.lutar();
        Luta uec02 = new Luta();
        uec02.marcarLuta(l[2],l[3]);
        uec02.lutar();
    }
    
}
