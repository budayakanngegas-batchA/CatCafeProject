/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.util.ArrayList;

/**
 *
 * @author raygh
 */
public class Cat {

    private String catName = "Cat";
    private String catSpecies = "Feline";
    private ArrayList<Dietary> catDiet;
    private String catLastTimeFeed;

    //Get
    public String getCatName() {
        return catName;
    }

    public String getCatSpecies() {
        return catSpecies;
    }

    public ArrayList getCatDiet() {
        return catDiet;
    }

    public String getLastTimeFed() {
        return catLastTimeFeed;
    }

    //Set
    public void setCatName(String name) {
        catName = name;
    }

    public void setCatSpecies(String species) {
        catSpecies = species;
    }

    public void setCatDiet(Dietary diet) {
        catDiet.add(diet);
    }

    //Constructor
    public Cat() {
    }

    public Cat(String name, String species, String lastTimeFeed) {
        catName = name;
        catSpecies = species;
        catLastTimeFeed = lastTimeFeed;
        catDiet = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Name: " + catName + ", Type: " + catSpecies + ", Last time fed: " + catLastTimeFeed;
    }
}
