/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spidership;

import java.util.logging.Level;
import java.util.logging.Logger;
import static spidership.Move.enmyact;
import static spidership.Move.enmxact;
import static spidership.Move.xact;
import static spidership.Move.yact;




/**
 *
 * @author SummonerArthur
 */
public class Shoot implements Runnable{
    boolean shooton=false, didntshoot=false;
    static int shootx,shooty;

    @Override
    public void run() {while(true){try{
    shootx=xact;
    shooty=yact;
    Spidership.screen.projectile.setLocation(shootx,shooty);
    if(shooton){
        shootx = xact;
        do{if(Spidership.settings.gamestate){
            shooty=shooty-8;
            Spidership.screen.projectile.setLocation(shootx+12,shooty+12);
        
            if(shootx>enmxact&&shootx<enmxact+288){
                if(shooty>enmyact&&shooty<enmyact+240){
                    Spidership.enemy.life=Spidership.enemy.life-5;
                    Spidership.screen.enlifeBar.setSize(23, Spidership.enemy.life-5);
                    shooty=14;
                }}
        }
            Thread.sleep(30);
        }
        
        
        while(shooty>16);
//        shooty<enmyact+224&&shootx>enmxact-16&&shootx<enmxact+274||
        
        
    }
    
    }   catch (InterruptedException ex) {
            Logger.getLogger(Shoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    }
    
    
}
