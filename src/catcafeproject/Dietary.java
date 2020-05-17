/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

/**
 *
 * @author raygh
 */
public class Dietary {
    private String catFoodName;
    private String feedingTime;
    
     // get
    public String getCatFoodName() {
        return catFoodName;
    }
    public String getFeedingTime() {
        return feedingTime;
    }
    public String getDietData() {
        return "[food name: "+catFoodName+", feeding time: "+feedingTime+"]";
    }

    // set
    public void setCatFoodName(String catFoodName) {
        this.catFoodName = catFoodName;
    }
    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }
    
     // constructor
    public Dietary(){
    }

    public Dietary(String a , String b){
        this.catFoodName = a;
        this.feedingTime = b;
    }
}
