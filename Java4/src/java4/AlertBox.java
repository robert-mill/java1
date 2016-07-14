package java4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.stage.*;
/**
 *
 * @author rmill_000
 */
public class AlertBox {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);
        
        Label label = new Label();
        label.setText(message);
        
        Button closeButton = new Button("Close Window");
        closeButton.setOnAction( e -> window.close() );
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
    }
}
