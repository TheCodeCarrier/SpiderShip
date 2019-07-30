/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spidership;

import java.util.logging.Level;
import java.util.logging.Logger;
import static spidership.Screen.player;

/**
 *
 * @author SummonerArthur
 */
public class Move implements Runnable{
    
    static boolean up=false, down=false, left=false, right=false;
    public static int xact=350,yact=420,xspeed=0,yspeed=0;
    static int enmxact=220,enmyact=-20,enmxspeed=0,enmyspeed=0;
    int life=475;
    
    @Override
    public void run() {try{
        while(true){
            xact=Spidership.screen.player.getLocation().x;
            yact=Spidership.screen.player.getLocation().y;
            Spidership.screen.player.setLocation(xact+xspeed,yact+yspeed);
            
            if(xact>570){xact=570;Spidership.screen.player.setLocation(xact,yact);}
            if(yact>440){yact=440;Spidership.screen.player.setLocation(xact,yact);}
            if(xact<98){xact=98;Spidership.screen.player.setLocation(xact,yact);}
            if(yact<16){yact=16;Spidership.screen.player.setLocation(xact,yact);}
            
            if(xact>enmxact-32&&xact<enmxact+268){
                if(yact>enmyact-32&&yact<enmyact+208){
                    
                life=life-12;
                System.out.println("vai tomando: "+life);
                Spidership.screen.lifeBar.setSize(23, life);
                if(life<0){System.out.println("gameover");}
            }
        }
                Thread.sleep(30);
                
            }
            } catch (InterruptedException ex) {
                    Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }
    
}
