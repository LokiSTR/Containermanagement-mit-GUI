import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;

public class NewVerschiffungErrorController {

    //Variablen für den Seitenwechsel
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void errorComplete(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("view/Verschiffung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //Debugging
        System.out.println("Error Complete");
    }

}