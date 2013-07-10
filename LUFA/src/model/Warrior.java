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

    private boolean run = true;
    private Thread thread;
    private String direction;
    
    @Override
    public void draw() {
        g2d.setColor(Color.red);
        switch(direction)
        {
            case "RIGHT":
                    currentPosition.setLocation(currentPosition.x+3,currentPosition.y);
                    g2d.fillOval(currentPosition.x, currentPosition.y, 10, 15);
                break;
            case "LEFT":
                    currentPosition.setLocation(currentPosition.x-3,currentPosition.y);
                    g2d.fillOval(currentPosition.x, currentPosition.y, 10, 15);
                break;
            case "UP":
                    currentPosition.setLocation(currentPosition.x,currentPosition.y-3);
                    g2d.fillOval(currentPosition.x, currentPosition.y, 10, 15);
                break;
            case "DOWN":
                    currentPosition.setLocation(currentPosition.x,currentPosition.y+3);
                    g2d.fillOval(currentPosition.x, currentPosition.y, 10, 15);
                break;
        }
    }

    @Override
    public void go(String dir) {
        System.out.println("go");
        thread = new Thread(this);
        thread.start();
        run = true;
        direction = dir;
    }

    @Override
    public void stop() {
       run = false;
    }
    
    @Override
    public void run()
    {
        System.out.println("okay");
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
