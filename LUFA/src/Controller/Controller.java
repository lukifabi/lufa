/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Warrior;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Controller {
     ArrayList<Character> characters;
     
     public Controller(){
         characters = new ArrayList<>();
     }
    public static void main(String[] args) {
       
        Warrior w = new Warrior();
        w.setName("Hans Peter");
        w.setPrecision(5);
        w.setStamina(100);
        w.setStrength(70);
        w.setAgility(30);
        w.setPrecision(60);
        characters.add(w);
        
    }
}
