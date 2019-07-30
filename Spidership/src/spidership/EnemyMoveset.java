/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spidership;

import java.util.logging.Level;
import java.util.logging.Logger;
import static spidership.Move.enmxact;
import static spidership.Move.enmyact;
import static spidership.Move.enmxspeed;
import static spidership.Move.enmyspeed;
import static spidership.Move.xact;

/**
 *
 * @author SummonerArthur
 */
public class EnemyMoveset implements Runnable {
    static int shootx=99999,shooty=0;
    
    boolean usingmove=false;
    @Override
    public void run() {try{
        while(true){
            shootx=enmxact;
            shooty=enmyact;
            Spidership.screen.enmAtk.setLocation(shootx,shooty);
                Thread.sleep(30);
        //if(xact>enmxact+100&&xact<enmxact+136){
            shootx = enmxact;
            shootx=shootx+150;
            shooty=shooty+150;
            do{if(Spidership.settings.gamestate){
                shooty=shooty+8;
            Spidership.screen.enmAtk.setLocation(shootx,shooty);}
            Thread.sleep(30);
            if(shootx<xact+64&&shootx>xact-32){
                if(shooty>Spidership.move.yact-32&&shooty<Spidership.move.yact+32){
                    Spidership.move.life=Spidership.move.life-20;
                    Spidership.screen.lifeBar.setSize(23, Spidership.move.life-20);
                    shooty=14;
                }}
            
            }
            while(shooty<472);
        //}
        }
    }
    catch (InterruptedException ex) {
            Logger.getLogger(EnemyMove.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void tackle() {try{
        do{enmxact=Spidership.screen.enm.getLocation().x;
           enmyact=Spidership.screen.enm.getLocation().y;
           enmyspeed=+8;
        Spidership.screen.enm.setLocation(enmxact+enmxspeed,enmyact+enmyspeed);
        Thread.sleep(30);
        }while(enmyact<80);
        
        do{enmxact=Spidership.screen.enm.getLocation().x;
            enmyact=Spidership.screen.enm.getLocation().y;
            enmyspeed=-10;
        Spidership.screen.enm.setLocation(enmxact+enmxspeed,enmyact+enmyspeed);
        Thread.sleep(30);
        }while(enmyact>-20);
        
        enmyspeed=0;
        
    }
    catch (InterruptedException ex) {
            Logger.getLogger(EnemyMove.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
} 
}
