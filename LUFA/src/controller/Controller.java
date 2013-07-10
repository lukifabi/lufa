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
    
    public void start(String warriorName, Graphics2D g2d)
    {
        for(int i = 0; i < figures.size();i++)
        {
            System.out.println("Running");
            if(figures.get(i).getName().equals(warriorName))
            {
                Figure figure = figures.get(i);
                figure.setG2d(g2d);
                figure.go();
            }
        }
    }
}
