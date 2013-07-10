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
    
    /*
     * This method enables the Warrior to move
     */
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

    //Start a new Thread - Runnable Mode
    @Override
    public void go(String dir) {

        thread = new Thread(this);
                System.out.println("Thread created "+thread.getName());
        thread.start();
        run = true;
        direction = dir;
    }

    //Stops a thread - Dead
    @Override
    public void stop() {
        System.out.println("Thread destroyed "+thread.getName());
       run = false;
    }
    
    //Executes the thread - Running mode
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
