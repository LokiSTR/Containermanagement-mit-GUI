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

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
// import controller.GueterController;
import controller.MainController;
import javafx.scene.Parent;
import javafx.scene.*;

public class NewVerschiffungController{

    public NewVerschiffungController(){
        //setMc(mc); 
        // aus Parameter: MainController mc
    //   InvocationTargetException, LoadException und noch ein Nullpointer bei this.mc, bzw. dem RoutenController
        //loadDataTextfield();
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
    // ArrayList<Route> tempList = new ArrayList<>();

    ObservableList<Route> templist =  FXCollections.observableArrayList();

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
        templist.clear();
        Route a = mc.getRc().getRouten().get(0);
        Route b = mc.getRc().getRouten().get(1);
        Route c = mc.getRc().getRouten().get(2);
        Route d = mc.getRc().getRouten().get(3);
        Route e = mc.getRc().getRouten().get(4);

        templist.addAll(a,b,c,d,e);
        

        choiceBoxRouten.getItems().addAll(templist);

        //Debugging
        System.out.println("ChoiceBoxen geladen");
    }



    /**
     * 
     * GETTER UND SETTER   
     */
    
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    
    public NewVerschiffungController getNvc() {
        return nvc;
    }
    public void setNvc(NewVerschiffungController nvc) {
        this.nvc = nvc;
    }
}
