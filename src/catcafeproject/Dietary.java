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
    private String dietName;
    private String dietTime;
    
     // get
    public String getDietName() {
        return dietName;
    }
    public String getDietTime() {
        return dietTime;
    }
    public String getDietData() {
        return "[food name: "+dietName+", feeding time: "+dietTime+"]";
    }

    // set
    public void setDietName(String name) {
        dietName = name;
    }
    public void setDietTime(String time) {
        dietTime = time;
    }
   
    
     // constructor
    public Dietary(){
    }

    public Dietary(String name , String time){
        dietName = name;
        dietTime = time;
    }
}
