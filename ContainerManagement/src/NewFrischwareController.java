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



public class NewFrischwareController {

    //Controllervariablen
    MainController mc;
    GueterController gc;

    //Variablen für den Seitenwechsel
    private Stage stage;
    private Scene scene;
    private Parent root;

    //FXML-Variablen für GUI
    @FXML
    private TextField tfGewicht;
    @FXML
    private TextField tfHaltbarkeit;
    @FXML
    private TextField tfInhalt;

    // public NewFrischwareController(MainSceneController mainSceneController) {
    // }


    /**
     * 
     * 
     * FEHLER!! 
     * PROBLEM NOCH NICHT GEFUNDEN
     * java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
     * Caused by: java.lang.reflect.InvocationTargetException
     * Caused by: java.lang.NullPointerException
     * @throws IOException
     * 
     */
    @FXML
    void FrischwareFertig(ActionEvent event) throws IOException {

        //TextField zu String konvertieren
        String gewicht = tfGewicht.getText();
        String inhalt = tfInhalt.getText();
        String haltbarkeit = tfHaltbarkeit.getText();

        //mc.getGc().addNewFrischware(gewicht, inhalt, haltbarkeit);
        mc.getGc().addNewFrischware(gewicht, inhalt, haltbarkeit);

        //Debugging
        System.out.println("Frischware fertig");

        //Nach der fertigen Eingabe zurück auf die Startseite
        root = FXMLLoader.load(getClass().getResource("view/MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //Debugging
        System.out.println("Zurück auf die Startseite");
      
    }


    //Funktion um eine Folie zurück zu gehen
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

    /**
     * 
     * GETTER UND SETTER   
     */
    
    public MainController getMc() {
        return mc;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
}