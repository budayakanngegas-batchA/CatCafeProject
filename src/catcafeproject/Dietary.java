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
public class Dietary {
    private String catFoodName;
    private ArrayList feedingTime;
    
     // get
    public String getCatFoodName() {
        return catFoodName;
    }
    public ArrayList getFeedingTime() {
        return feedingTime;
    }

    // set
    public void setCatFoodName(String catFoodName) {
        this.catFoodName = catFoodName;
    }
    public void setFeedingTime(ArrayList feedingTime) {
        this.feedingTime = feedingTime;
    }
    
     // constructor
    public Dietary(){
    }

    public Dietary(String a , ArrayList b){
        this.catFoodName = a;
        this.feedingTime = b;
    }
}
