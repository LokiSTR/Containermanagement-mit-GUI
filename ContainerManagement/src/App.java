import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
import controller.MainController;

public class App extends Application {
    
    public static Stage mainStage;
    public static AnchorPane rootLayout;

    static NewVerschiffungController nvc;
    
    public static void main(String[] args) throws IOException {
        new MainController();
        //new NewVerschiffungController();
        //funktioniert nciht, java.lang.reflect.InvocationTargetException und nullpointer bei App.nvc
        //nvc.loadDataTextfield();

        launch(args);
    }
 
    public void start(Stage mainStage) throws Exception {

        
        Parent root = FXMLLoader.load(getClass().getResource("view/MainScene.fxml"));
        Scene mainScene = new Scene(root);
        mainStage.setScene(mainScene);
        mainStage.show();
        
    }
       
    //Getter     
    public Stage getMainStage() {
        return mainStage;
    }
    public NewVerschiffungController getNvc() {
        return nvc;
    }
}