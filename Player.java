/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kevintrujillo;

/**
 * Created by: Kevin Trujillo
 * This player class creates a player with the answers as parameters.
 */
public class Player {
    
    private String name;
    private boolean one;
    private boolean two;
    private boolean three;
    private boolean four;
    
    //The constructor. takes the string (username) and the status of the four answers
    // If user gives no username or longer than 15, it will create default "User"
    
    public Player(String name, boolean one, boolean two, boolean three, boolean four) {
        this.one = one;
        if (name.equals("") || name.length() > 15){
            this.name = "User";
        } else {
             this.name = name;
        }
        this.two = two;
        this.three = three;
        this.four = four;
               
    }
    // returns name
    public String getName() {
        return this.name;
    }
    // returns status of first question
    public boolean getOne() {
        return this.one;
    }
    // returns status of second question
    public boolean getTwo() {
        return this.two;
    }
    // returns status of third question
    public boolean getThree() {
        return this.three;
    }
    //returns status of fourth question
    public boolean getFour() {
        return this.four;
    }
    //returns a string (number) of amount of questions the user got incorrect
    public String Calculate() {
        int calc = 0;
        if (this.one == false){
            calc++;
        }
        if (this.two == false) {
            calc++;
        }
        if (this.three == false) {
            calc++;
            
        }
        if (this.four == false) {
            calc++;
        }
        String a = Integer.toString(calc);
        return a;
    }
    //uses Caculate method and returns string + amount of incorrect answers
    @Override
    public String toString() {
       String a =  this.Calculate();
       
      return this.name + " had " + a + " incorrect answers";
     
    }
}
