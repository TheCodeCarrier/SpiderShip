/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spidership;

import java.util.logging.Level;
import java.util.logging.Logger;
import static spidership.Move.xact;
import static spidership.Move.yact;
import static spidership.Move.enmxact;
import static spidership.Move.enmyact;
import static spidership.Move.enmxspeed;
import static spidership.Move.enmyspeed;

/**
 *
 * @author SummonerArthur
 */
public class EnemyMove implements Runnable{
    int life=475;

    @Override
    public void run() {try{
        System.out.print("");
        while(true){
            enmxact=Spidership.screen.enm.getLocation().x;
            enmyact=Spidership.screen.enm.getLocation().y;
            
                
            Spidership.screen.enm.setLocation(enmxact+enmxspeed,enmyact+enmyspeed);
            
            if(Spidership.enemy.life<0){
                    Spidership.screen.enm.setLocation(9999,9999);
                    }
           if(Spidership.settings.gamestate){ 
        if(xact<enmxact+100){
            switch(Spidership.settings.spyderspeed){
                case 1:enmxspeed=-2;break;
                case 2:enmxspeed=-4;break;
                case 3:enmxspeed=-6;break;
                case 4:enmxspeed=-8;break;}
            }
        if(xact>enmxact+136){
                switch(Spidership.settings.spyderspeed){
                case 1:enmxspeed=+2;break;
                case 2:enmxspeed=+4;break;
                case 3:enmxspeed=+6;break;
                case 4:enmxspeed=+8;break;}
            }
        if(xact>enmxact+100&&xact<enmxact+136){
        enmxspeed=0;
        
        }
        if(yact>enmyact-32&&yact<enmyact+300&&xact>enmxact-32&&xact<enmxact+268){
        enmxspeed=0;
            if(Spidership.settings.gamestate){
                EnemyMoveset.tackle();
            }
        }}
        Thread.sleep(30);
        
        }
    } catch (InterruptedException ex) {
                    Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
      
        
} 
}
    

