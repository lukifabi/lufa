/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian
 */
public class Warrior extends Figure{

    private boolean run;
    private Thread thread;
    
    @Override
    public void draw() {
        g2d.setColor(Color.red);
        currentPosition.setLocation(currentPosition.x+2, currentPosition.y+2);
        g2d.fillOval(currentPosition.x, currentPosition.y, 40, 30);
        System.out.println(currentPosition);
        g2d.setBackground(Color.yellow);

    }

    @Override
    public void go() {
        thread = new Thread();
        thread.start();
        run = true;
    }

    @Override
    public void stop() {
       run = false;
    }
    
    @Override
    public void run()
    {
        while(run)
        {
            draw();
            try
            {
                thread.sleep(1300);
            }catch(InterruptedException ie)
            {
                Logger.getLogger(Warrior.class.getName()).log(Level.SEVERE, null, ie);
            }
        }
    }
}
