/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics2D;
import java.awt.Point;
import model.Warrior;
import java.util.ArrayList;
import model.Figure;
import model.Hunter;
/**
 *
 * @author Fabian
 */
public class Controller {
    
    ArrayList<Figure> figures = new ArrayList<>();

    public ArrayList<Figure> getFigures() {
        return figures;
    }
    
    public void addFigures()
    {
        Warrior w = null;
        w = new Warrior();
        w.setName("HansPeter");
        w.setDescription("This is a warrior");
        w.setAgility(3);
        w.setMoney(300);
        w.setPrecision(4);
        w.setStamina(44);
        w.setExperience(45);
        w.setCurrentPosition(new Point(100, 100));
        figures.add(w);
    }
    
    public void start(String warriorName, Graphics2D g2d, String direction)
    {
        for(Figure f : figures)
        {
            if(f.getName().equals(warriorName))
            {
                f.setG2d(g2d);
                f.go(direction);
            }
        }
    }
    
    public void stop(String name)
    {
        for(Figure f : figures)
        {
            if(f.getName().equals(name))
            {
                f.stop();
            }
        }
    }
    
    public void update(String name)
    {
        for(Figure f : figures)
        {
            if(f.getName().equals(name))
            {
                f.update();
            }
        }
    }
}
