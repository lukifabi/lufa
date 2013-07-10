/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics2D;
import model.Warrior;
import java.util.ArrayList;
import model.Figure;
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
        Warrior w = new Warrior();
        w.setName("Hans Peter");
        w.setDescription("This is a warrior");
        figures.add(w);
    }
    
    public void start(String warriorName, Graphics2D g2d)
    {
        for(int i = 0; i < figures.size();i++)
        {
            if(figures.get(i).getName().equals(warriorName))
            {
                Figure figure = figures.get(i);
                figure.setG2d(g2d);
                figure.go();
            }
        }
    }
}
