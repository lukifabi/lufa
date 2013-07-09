/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public abstract class Figure implements Runnable {
    
    private String name;
    private String description;
    private int strength;
    private int intelligence;
    private int agility;
    private int precision;
    private int stamina;
    private int experience;
    private int money;
    protected Point currentPosition;
    protected double xDir;
    protected double yDir;
    protected double k;
    protected Graphics2D g2d;
    
    private ArrayList<Item> items;
    private ArrayList<Ability> abilities;    
    
    public abstract void draw();
    public abstract void go();
    public abstract void stop();

    public Graphics2D getG2d() {
        return g2d;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setxDir(double xDir) {
        this.xDir = xDir;
    }

    public void setyDir(double yDir) {
        this.yDir = yDir;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setG2d(Graphics2D g2d) {
        this.g2d = g2d;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public double getxDir() {
        return xDir;
    }

    public double getyDir() {
        return yDir;
    }

    public double getK() {
        return k;
    }
    
    
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
