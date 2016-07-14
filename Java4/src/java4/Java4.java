/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author rmill_000
 */
public class Java4 extends Application  {
    
    Stage window;
   
    Button btn1 = new Button();
    Button btn2 = new Button();
    Button btn3 = new Button();
    Button btn4 = new Button();
    Button btn5 = new Button();
    Button btn6 = new Button();
    Button btn7 = new Button();
    Button btn8 = new Button();
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX box");
      
        TextField nameInput = new TextField();
        Button button = new Button("Click Me");
        button.setOnAction(e -> {
            isInt(nameInput, nameInput.getText());
        });
        
        VBox layout = new VBox();        
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);
        
        
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
        
    }
    public void closeProgram(){
        Boolean answer = ConfirmBox.display("confirm Close", "Continue options");
        if(answer)
            window.close();
    }
    
    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is " + age);
            return true;
        }catch(NumberFormatException e){
          System.out.println("Error " + message + " is not a number");
          return  false;
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
