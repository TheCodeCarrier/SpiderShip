/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spidership;


/**
 *
 * @author SummonerArthur
 */
public class Spidership {

    /**
     * @param args the command line arguments
     */
    public static GameSetting settings;
    public static Screen screen;
    public static Move move;
    public static EnemyMove enemy;
    public static Shoot shoot;
    public static EnemyMoveset enemymoveset;
    public static DebbuggingTool dbt;
    
    public static Thread thr0;
    public static Thread thr1;
    public static Thread thr2;
    public static Thread thr3;
    public static Thread thr4;
    
    public static void main(String[] args) {
        // TODO code application logic here
        settings=new GameSetting();
        
        screen=new Screen();
        screen.setVisible(true);
        
        move=new Move();
        thr1=new Thread(move);
        thr1.start();
        
        enemy=new EnemyMove();
        thr2=new Thread(enemy);
        thr2.start();
        
        shoot=new Shoot();
        thr3=new Thread(shoot);
        thr3.start();
        
        enemymoveset=new EnemyMoveset();
        thr4=new Thread(enemymoveset);
        thr4.start();
        
        
    }
    
}
