package finalproject_kevintrujillo;


/**
* Created by: Kevin Trujillo
* This code generates a program designed to ask the user java related questions
* It has four questions total and it will tell the user how many questions were wrong
* This program uses javafx and every question is set on a different scene. Answering
* the questions creates a new Scene with the following questions.
 */
import java.awt.Color;
  import javafx.application.Application;
  import javafx.geometry.*;
  import javafx.scene.Scene;
import javafx.scene.control.Button;
  import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

  
public class FinalProject_KevinTrujillo extends Application {
    // Parameters that help set up the GUI
    public boolean status = true;
    public boolean question1 = true;
    public boolean question2 = true;
    public boolean question3 = true;
    public boolean question4 = true;
    public TextField results = new TextField();
    public TextField username1 = new TextField();
    String a;
    public int relocatey = 120;
    public int leaderboardcount;
    public int count = 1;
 public void start(Stage primaryStage) {
     // FirstPane. This will be the front page of the GUI. will prompt the user for an username and start the game
   Pane pane11 = new Pane();
   ImageView background = new ImageView("http://i.imgur.com/stV6xNL.jpg");
    Button one = new Button("Play");
    Button two = new Button("Non-scored Mode");
    one.relocate(190,240);
    two.relocate(190,270);
    GridPane pane = new GridPane();
    Label usernamel = new Label("Username:");
    usernamel.relocate(190,180);
    usernamel.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
    usernamel.setStyle("-fx-text-fill: white;");
    username1.relocate(190,210);
 pane11.getChildren().add(background);
pane11.getChildren().add(usernamel);
pane11.getChildren().add(username1);
pane11.getChildren().add(one);
pane11.getChildren().add(two);
   Scene scene = new Scene(pane11,500,500);
    primaryStage.setTitle("Java Knowledge Test");
 
    
    // second scene. It will ask the question "Can you use 'this' on Static methods?
    Pane pane2 = new Pane();
    Scene scene2 = new Scene(pane2,500,500);
    ImageView background1 = new ImageView("http://i.imgur.com/ezhEZtB.jpg");
    Button yes1 = new Button("Yes");
    Button no1 = new Button("No");
    yes1.relocate(150,190);
    no1.relocate(350,190);
    Label q1 = new Label("Can you use 'this' on Static methods?");
    q1.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 30));
    q1.setStyle("-fx-text-fill: white;");
    q1.relocate(20,150);
    pane2.getChildren().add(background1);
    pane2.getChildren().add(yes1);
    pane2.getChildren().add(no1);
    pane2.getChildren().add(q1);
   
 
          
    // third scene. It will ask the second question
    Pane pane3 = new Pane();
    Scene scene3 = new Scene(pane3,500,500);
    Button yes2 = new Button("True");
    Button no2 = new Button("False");
    yes2.relocate(130,200);
    no2.relocate(330,200);
    Label q2 = new Label("Classes need static void main");
    Label q22 = new Label("or a constructor to compile properly");
    q2.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 26));
    q22.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 26));
    q2.relocate(50,130);
    q22.relocate(50,160);
    q2.setStyle("-fx-text-fill: white;");
    q22.setStyle("-fx-text-fill: white;");
    ImageView background2 = new ImageView("http://i.imgur.com/ezhEZtB.jpg");
    pane3.getChildren().add(background2);
    pane3.getChildren().add(q2);
    pane3.getChildren().add(q22);
    pane3.getChildren().add(yes2);
    pane3.getChildren().add(no2);

   //fourth scene. This will present an image and ask a question
   Pane pane4 = new Pane();
   Scene scene4 = new Scene(pane4,500,500);
   Button yes3 = new Button("Statement1");
   Button yn3 = new Button("Statement2");
   Button no3 = new Button("nothing/compile error");
   yes3.relocate(75,450);
   yn3.relocate(175,450);
   no3.relocate(275,450);
   Label q3 = new Label("What does this code print?");
   q3.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 30));
   q3.setStyle("-fx-text-fill: white;");
   q3.relocate(85,25);
   ImageView code = new ImageView("http://i.imgur.com/7kIQQ6E.png");
   code.relocate(100,60);
   ImageView background5 = new ImageView("http://i.imgur.com/ezhEZtB.jpg");
   code.setFitHeight(380);
   code.setFitWidth(260);
   pane4.getChildren().add(background5);
   pane4.getChildren().add(q3);
   pane4.getChildren().add(yes3);
   pane4.getChildren().add(yn3);
   pane4.getChildren().add(no3);
   pane4.getChildren().add(code);
   
   
   //scene 5. Last question.
  Pane pane5 = new Pane();
  Scene scene5 = new Scene(pane5,500,500);
  Button yes4 = new Button("primitive type");
  Button no4 = new Button("derived type");
  Label q4 = new Label("Strings are..");
  ImageView background3 = new ImageView("http://i.imgur.com/ezhEZtB.jpg");
  q4.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 30));
  q4.setStyle("-fx-text-fill: white;");
  q4.relocate(150,150);
  yes4.relocate(120,190);
  no4.relocate(275,190);
  pane5.getChildren().add(background3);
  pane5.getChildren().add(q4);
  pane5.getChildren().add(yes4);
  pane5.getChildren().add(no4);


  // results scene. This is the results scene and button "back" sends you to the start.
  Pane pane6 = new Pane();
  Button startover = new Button("Start over");
  startover.relocate(0,474);
  Button cakeisalie = new Button("CLICK FOR FREE CAKE!");
  cakeisalie.relocate(330,474);
  ImageView background4 = new ImageView("http://i.imgur.com/GUnYjUN.jpg");
  Scene scene6 = new Scene(pane6,500,500);
  pane6.getChildren().add(background4);
  pane6.getChildren().add(startover);
  pane6.getChildren().add(cakeisalie);
 
   //buttons 
   // These are the buttons from the first scene
    one.setOnAction(e -> primaryStage.setScene(scene2));
    two.setOnAction(e -> {
    status = false; 
    primaryStage.setScene(scene2);
});
    // These are the buttons from the second scene
    yes1.setOnAction(e ->{
        question1 = false;
        primaryStage.setScene(scene3);
            });
    no1.setOnAction(e -> primaryStage.setScene(scene3));
    // These are the buttons from the third scene
    yes2.setOnAction(e -> primaryStage.setScene(scene4));
    no2.setOnAction( e -> {
        question2 = false;
        primaryStage.setScene(scene4);
            });
    // These are the buttons from the fourth scene
    yes3.setOnAction( e -> {
        question3 = false;
        primaryStage.setScene(scene5);
            });
    yn3.setOnAction( e -> primaryStage.setScene(scene5));
    no3.setOnAction( e -> {
        question4 = false;
        primaryStage.setScene(scene5);
            });
    /* These are the buttons from the  fifth scene
    * As we can see both of these buttons create a new object player and then use toString
    * to create a new label and add it to the last scene
    * If there are more than 12 users, it wll not keep creating more strings.
    */
      no4.setOnAction(e -> {
       {
           if (leaderboardcount < 12){
          question4 = false;
          String a = playerResult();
          Label answer = new Label(count + ". " + a);
          answer.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
          answer.setStyle("-fx-text-fill: white;");
          answer.relocate(80,relocatey);
          pane6.getChildren().add(answer);
       }
          primaryStage.setScene(scene6);
      }
  });
  yes4.setOnAction(e -> {
      if (leaderboardcount < 12){
          String a = playerResult();
          Label answer = new Label(count + ". " + a);
          answer.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC,20));
          answer.setStyle("-fx-text-fill: white;");
          answer.relocate(80,relocatey);
          pane6.getChildren().add(answer);
      }
          primaryStage.setScene(scene6);
  });
  // Resets all booleans and increases the counts for the leaderboard. 
   startover.setOnAction(e -> {
       status = true;
       question1 = true;
       question2 = true;
       question3 = true;
       question4 = true;
       relocatey = relocatey + 20;
       leaderboardcount++;
       count++;
       cakeisalie.setVisible(true);
       cakeisalie.setText("Okay for real this time...");
       primaryStage.setScene(scene);    
             
   });
   // Just extra for fun
    cakeisalie.setOnAction(e -> cakeisalie.setVisible(false));

    primaryStage.setScene(scene);
    primaryStage.show();
    
 }
 // Probably the most important method. It creates the object based on the questions and then converts it to string.
 public String playerResult() {
     if (status == true){
     Player player = new Player(username1.getText(),question1,question2,question3,question4);
     return player.toString();
     }
     else {
         easyPlayer player2 = new easyPlayer(username1.getText());
         return player2.toString() + getIQ(10,"!");
     }
 }
 // Not the most useful method, but it makes payerResult() look cleaner
  public String getIQ(int number,String sign) {
        String iq = "'s IQ is over 9";
        while (number < 13) {
            iq += "0";
           number++; 
        }
        return iq + sign;
    }
// it runs the program
    public static void main(String[] args) {
      Application.launch(args);
    }
    

}

    