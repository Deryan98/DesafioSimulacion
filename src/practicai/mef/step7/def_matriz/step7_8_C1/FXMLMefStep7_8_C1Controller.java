/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai.mef.step7.def_matriz.step7_8_C1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author didiercruz
 */
public class FXMLMefStep7_8_C1Controller implements Initializable {

    @FXML
    private Button button;
    @FXML
    private StackPane parentContainer;
    @FXML
    private AnchorPane anchorRoot;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadStep7_9_C2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/mef/step7/def_matriz/step7_9_C2/FXMLMefStep7_9_C2.fxml"));
      Scene scene = button.getScene();
      
      root.translateXProperty().set(-scene.getHeight());
      parentContainer.getChildren().add(root);
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
      timeline.getKeyFrames().add(kf);
      timeline.setOnFinished(event1->{
          parentContainer.getChildren().remove(anchorRoot);
      });
      timeline.play();
    }
    
}
