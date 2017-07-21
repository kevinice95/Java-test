/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kevintrujillo;

/**
* Created by: Kevin Trujillo
* This class only records the string from User
 */

public class easyPlayer {
   private String name;
    // creates a new user. if username is null or longer than 15, it will make it user
    public easyPlayer(String name){ 
        if (name.equals("") || name.length() > 15){
         this.name = "User";
        }
        else {
        this.name = name;
        }
    }
    // returns name
    public String getName() {
        return this.name;
    }
    // just returns the name of easyPlayer  
    @Override
    public String toString() {
        return this.name;
    }
    
}
