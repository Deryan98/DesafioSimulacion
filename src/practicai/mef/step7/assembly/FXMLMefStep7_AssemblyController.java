/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai.mef.step7.assembly;

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
public class FXMLMefStep7_AssemblyController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Button btnElement1;
    @FXML
    private Button btnElement2;
    @FXML
    private Pane pnl_element1;
    @FXML
    private Pane pnl_element2;
    @FXML
    private StackPane parentContainer;
    @FXML
    private AnchorPane anchorRoot;
    @FXML
    private Button btnElement3;
    @FXML
    private Button btnElement4;
    @FXML
    private Button btnElement5;
    @FXML
    private Button btnElement6;
    @FXML
    private Pane pnl_element3;
    @FXML
    private Pane pnl_element4;
    @FXML
    private Pane pnl_element5;
    @FXML
    private Pane pnl_element6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private void loadStep8Screen(ActionEvent event) throws IOException {
        /*
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/mef/step8/FXMLMefStep8.fxml"));
      Scene scene = button.getScene();
      
      root.translateYProperty().set(-scene.getWidth());
      
      StackPane parentContainer = (StackPane) scene.getRoot();
      parentContainer.getChildren().add(root);
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(0.1), kv);
      timeline.getKeyFrames().add(kf);
      timeline.setOnFinished(event1->{
          parentContainer.getChildren().remove(container);
      });
      timeline.play();
      */
      
      Parent root = FXMLLoader.load(getClass().getResource("/practicai/mef/step7/assembly/global_matrix_k/FXMLGlobalMatrixK.fxml"));
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

    @FXML
    private void handleActionButton(ActionEvent event) {
        if(event.getSource() == btnElement1)
            pnl_element1.toFront();
        else if(event.getSource() == btnElement2)
            pnl_element2.toFront();
        else if(event.getSource() == btnElement3)
            pnl_element3.toFront();
        else if(event.getSource() == btnElement4)
            pnl_element4.toFront();
        else if(event.getSource() == btnElement5)
            pnl_element5.toFront();
        else if(event.getSource() == btnElement6)
            pnl_element6.toFront();
    }
    
}
