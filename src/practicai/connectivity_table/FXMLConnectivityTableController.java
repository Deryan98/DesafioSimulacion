/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai.connectivity_table;

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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author didiercruz
 */
public class FXMLConnectivityTableController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private AnchorPane container;
    @FXML
    private Button btn_elements1to3;
    @FXML
    private Button btn_elements4to6;
    @FXML
    private Pane pnl_elements4to6;
    @FXML
    private Pane pnl_elements_1to3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadModelScreen(ActionEvent event) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("/practicai/model/FXMLModel.fxml"));
      Scene scene = button.getScene();
      
      root.translateXProperty().set(scene.getWidth());
      
      StackPane parentContainer = (StackPane) scene.getRoot();
      parentContainer.getChildren().add(root);
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
      timeline.getKeyFrames().add(kf);
      timeline.setOnFinished(event1->{
          parentContainer.getChildren().remove(container);
      });
      timeline.play();
    }

    @FXML
    private void handleActionButton(ActionEvent event) {
        if(event.getSource() == btn_elements1to3)
            pnl_elements_1to3.toFront();
        else if(event.getSource() == btn_elements4to6)
            pnl_elements4to6.toFront();
    }

    @FXML
    private void loadMeshScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/mesh/FXMLMesh.fxml"));
      Scene scene = button.getScene();
      
      root.translateXProperty().set(-scene.getWidth());
      
      StackPane parentContainer = (StackPane) scene.getRoot();
      parentContainer.getChildren().add(root);
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
      timeline.getKeyFrames().add(kf);
      timeline.setOnFinished(event1->{
          parentContainer.getChildren().remove(container);
      });
      timeline.play();
    }
    
}
