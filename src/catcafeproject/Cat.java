/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raygh
 */
public class Cat {
    private String catName;
    private String catSpecies;
    private ArrayList catDiet;
    private Date lastTimeFeed;
    
    public String getCatName(){
        return catName;
    }
    
    public void setCatName(String theCatName){
        this.catName = theCatName;
    }
    
    public String getCatSpecies(){
        return catSpecies;
    }
    
    public void setCatspecies(String theCatSpecies){
        this.catSpecies = theCatSpecies;
    }
}
