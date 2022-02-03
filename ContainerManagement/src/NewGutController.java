import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;

public class NewGutController {

    //Variablem für den Seitenwechsel
    private Stage stage;
    private Scene scene;
    private Parent root;

    // public NewGutController(MainSceneController mainSceneController) {
    // }

    //Zur Seite Frischware erschaffen 
    @FXML
    void createFrischware(ActionEvent event) throws IOException {

        System.out.println("Frischware erstellen");
        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/Frischware.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();   
        System.out.println("Frischware erstellen");

    }

    //Zur Seite Gefahrengut erschaffen 
    @FXML
    void createGefahrengut(ActionEvent event) throws IOException {

        System.out.println("Gefahrengut erstellen");
        root = FXMLLoader.load(getClass().getResource("view/Gefahrengut.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Zur Seite Normalgut erschaffen 
    @FXML
    void createNormalGut(ActionEvent event) throws IOException {

        System.out.println("Normales Gut erstellen");
        root = FXMLLoader.load(getClass().getResource("view/Normal.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Zur Seite Tiere erschaffen 
    @FXML
    void createTiere(ActionEvent event) throws IOException {

        System.out.println("Tier erstellen");
        root = FXMLLoader.load(getClass().getResource("view/Tier.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Zur Seite Wertgegenstände erschaffen 
    @FXML
    void createWertgegenstaende(ActionEvent event) throws IOException {

        System.out.println("Wertgegenstand erstellen");
        root = FXMLLoader.load(getClass().getResource("view/Wertgegenstand.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //Eine Seite zurück gehen
    @FXML
    void zurueckAufMain(ActionEvent event) throws IOException {

        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        //Debugging
        System.out.println("Zurück auf Hauptseite");

    }

}