package model.Gueter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

import controller.GueterController;
import controller.MainController;
import javafx.scene.Parent;
import javafx.scene.*;

public class NewGefahrengutController {
    
    //Controllervariablen
    MainController mc;
    GueterController gc;

    //Variablen für den Seitenwechsel
    private Stage stage;
    private Scene scene;
    private Parent root;
   
    //FXML-Variablen für GUI
    @FXML
    private TextField tfInhalt;
    @FXML
    private TextField tfSicherheitslevel;

    
    

    // public NewGefahrengutController(MainSceneController mainSceneController) {
    // }

    /**
     * 
     * 
     * Gleicher Fehler, wie in NewFrischwareController.java
     * Ausführlicher in NewFrischwareController.java
     * 
     * 
     */
    
    @FXML
    void GefahrengutFertig(ActionEvent event) throws IOException {

        //TextField zu String konvertieren
        String sicherheitslevel = tfSicherheitslevel.getText();
        String inhalt = tfInhalt.getText();

        //mc.getGc().addNewGefahrengut(sicherheitslevel, inhalt);
        mc.getGc().addNewGefahrengut(sicherheitslevel, inhalt);

        //Debugging
        System.out.println("Gefahrengut fertig");


        //Nach der fertigen Eingabe zurück auf die Startseite
        root = FXMLLoader.load(getClass().getResource("view/MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //Debugging
        System.out.println("Zurück auf die Startseite");

    }

    //Um eine Seite zurück zu gehen
    @FXML
    void zurueck(ActionEvent event) throws IOException {

        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //Debugging
        System.out.println("Zurück auf vorherige Seite");

    }
}