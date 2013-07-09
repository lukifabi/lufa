/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Figure {
    
    private String name;
    private String description;
    private int strength;
    private int intelligence;
    private int agility;
    private int precision;
    private int stamina;
    private int experience;
    private int money;
    
    private ArrayList<Item> items;
    private ArrayList<Ability> abilities;    
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getPrecision() {
        return precision;
    }

    public int getStamina() {
        return stamina;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public int getExperience() {
        return experience;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    
    
    
}
