import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Transport.Route;

import java.io.IOException;
// import java.net.URL;
// import java.util.ResourceBundle;
import java.util.ArrayList;

// import javafx.collections.FXCollections;
// import javafx.collections.ObservableList;
// import controller.GueterController;
import controller.MainController;
import javafx.scene.Parent;
import javafx.scene.*;

public class NewVerschiffungController{

    public NewVerschiffungController(){
        setNvc(nvc);
    }
    
    //Controllervariablen
    MainController mc;
    NewVerschiffungController nvc;

    //Variablen für den Seitenwechsel
    private Stage stage;
    private Scene scene;
    private Parent root;

    //FXML-Variablen für die Checkboxen
    @FXML
    private TextField ausgabeRoute;
    @FXML
    private TextField ausgabeSchiff;
    @FXML
    private ChoiceBox<Route> choiceBoxRouten;
    @FXML
    private ChoiceBox<String> choiceBoxSchiffe;

    //Variable zum checken der Liste i guess?
    ArrayList<Route> tempList = new ArrayList<>();

    // Array templist = FXCollections.observableArrayList();


    // public NewVerschiffungController(MainSceneController mainSceneController){
    // }

    @FXML
    void VerschiffungFertig(ActionEvent event) throws IOException {

    }

    //Um eine Seite zurück zu gehen
    @FXML
    void zurueck(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("view/MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //Debugging
        System.out.println("Zurück auf vorherige Seite");
    }

    public void loadDataTextfield(){
        // templist.clear();
        Route a = mc.getRc().getRouten().get(0);
        // String x = "Bananen";
        // String y = "Bananen";
        Route b = mc.getRc().getRouten().get(1);
        Route c = mc.getRc().getRouten().get(2);
        Route d = mc.getRc().getRouten().get(3);
        Route e = mc.getRc().getRouten().get(4);

        // templist.addAll(a,b,c,d,e);
        tempList.add(a);
        tempList.add(b);
        tempList.add(c);
        tempList.add(d);
        tempList.add(e);

        choiceBoxRouten.getItems().addAll(tempList);

        System.out.println("DEbugging process yk im saiyn");
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
    public NewVerschiffungController getNvc() {
        return nvc;
    }
    public void setNvc(NewVerschiffungController nvc) {
        this.nvc = nvc;
    }
}
