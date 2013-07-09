/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Warrior;
import java.util.ArrayList;
import Model.Figure;
/**
 *
 * @author Fabian
 */
public class Controller {
    
    public static void main(String[] args) {
       ArrayList<Figure> figures = new ArrayList<>();
        Warrior w = new Warrior();
        w.setName("Hans Peter");
        w.setPrecision(5);
        w.setStamina(100);
        w.setStrength(70);
        w.setAgility(30);
        w.setPrecision(60);
        figures.add(w);
        
        for(Figure fi : figures)
        {
            System.out.println(fi.getName()+" "+fi.getIntelligence());
        }
    }
}
