//Für JavaFX benöigt
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Für Node
import javafx.scene.*;

public class MainSceneController{

    public Stage stage;
    public Scene scene;
    public Parent root;

    //Controller
 /*   NewFrischwareController nfwc;
    NewGefahrengutController nggc;
    NewGutController ngc;
    NewNormalGutController nngc;
    NewTierController ntc;
    NewWertgegenstandController nwgsc;
    NewVerschiffungController nvc;
*/
  /*  public MainSceneController(){
        setNfwc(new NewFrischwareController(this));
        setNggc(new NewGefahrengutController(this));
        setNgc(new NewGutController(this));
        setNngc(new NewNormalGutController(this));
        setNtc(new NewTierController(this));
        setNwgsc(new NewWertgegenstandController(this));
        setNvc(new NewVerschiffungController(this));
    }
*/
    @FXML
    void newAusgabe(ActionEvent event) throws IOException {

        System.out.println("Etwas Ausgeben");
        //um die jeweilige FXML-Datei zu laden
        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        //ursprung des events an node casten
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Scene wird als fxml geladen
        scene = new Scene(root);
        //Stage bekommt die Scene
        stage.setScene(scene);
        //Stage wird angezeigt
        stage.show();

    }

    @FXML
    void newGut(ActionEvent event) throws IOException {
        
        System.out.println("Neues Gut");
        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();      
    }

    //Zweiter Button
    @FXML
    void newVerschiffen(ActionEvent event) throws IOException {

        System.out.println("Neue Verschiffung");
        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/VerschiffungChoiceBox.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    /**
     * 
     * SETTER UND GETTER
     */

  /*  public NewFrischwareController getNfwc() {
        return nfwc;
    }
    public void setNfwc(NewFrischwareController nfwc) {
        this.nfwc = nfwc;
    }
    public NewGutController getNgc() {
        return ngc;
    }
    public void setNgc(NewGutController ngc) {
        this.ngc = ngc;
    }
    public NewGefahrengutController getNggc() {
        return nggc;
    }
    public void setNggc(NewGefahrengutController nggc) {
        this.nggc = nggc;
    }
    public NewNormalGutController getNngc() {
        return nngc;
    }
    public void setNngc(NewNormalGutController nngc) {
        this.nngc = nngc;
    }
    public NewTierController getNtc() {
        return ntc;
    }
    public void setNtc(NewTierController ntc) {
        this.ntc = ntc;
    }
    public NewWertgegenstandController getNwgsc() {
        return nwgsc;
    }
    public void setNwgsc(NewWertgegenstandController nwgsc) {
        this.nwgsc = nwgsc;
    }
    public NewVerschiffungController getNvc() {
        return nvc;
    }
    public void setNvc(NewVerschiffungController nvc) {
        this.nvc = nvc;
    }
*/
}