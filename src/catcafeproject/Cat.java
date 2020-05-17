/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author raygh
 */
public class Cat {
    
    private String catName;
    private String catSpecies;
    private ArrayList<Dietary> catDiet;
    private String lastTimeFeed;
    private ListIterator<Dietary> dietListItr = null;
    
    //Get
    public String getCatName(){
        return catName;
    }
    
    public String getCatSpecies(){
        return catSpecies;
    }
    
    public ArrayList getCatDiet(){
        return catDiet;
    }
    
    public String getLastTimeFed(){
        return lastTimeFeed;
    }
    //Set
    public void setCatName(String theCatName){
        this.catName = theCatName;
    }
    
    public void setCatspecies(String theCatSpecies){
        this.catSpecies = theCatSpecies;
    }
    
    public void setCatDiet(Dietary theCatDiet){
        catDiet.add(theCatDiet);
    }
    //List Iterator
     public void printFeedingSchedule(){
        dietListItr = catDiet.listIterator();
            while (dietListItr.hasNext()){
                System.out.println(dietListItr.next().getDietData());
            }
    }
     
     
    //Constructor
    public Cat(){
    }

    public Cat(String a , String b , String c){
        this.catName = a;
        this.catSpecies = b;
        this.lastTimeFeed = c;
        catDiet = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return "Name: "+catName+", Type: "+catSpecies+", Last time fed: "+lastTimeFeed;            
    }
}
