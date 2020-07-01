/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai.mef.step7.assembly.global_matrix_k;

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author didiercruz
 */
public class FXMLGlobalMatrixKController implements Initializable {

    @FXML
    private Button btn_matrix_C;
    @FXML
    private Button btn_matrix_K;
    @FXML
    private Button btn_matrix_L;
    @FXML
    private Button btn_matrix_G;
    @FXML
    private Button btn_matrix_X;
    @FXML
    private Button btn_matrix_b;
    @FXML
    private Pane pnl_matrix_C;
    @FXML
    private Pane pnl_matrix_K;
    @FXML
    private Pane pnl_matrix_L;
    @FXML
    private Pane pnl_matrix_G;
    @FXML
    private Pane pnl_matrix_X;
    @FXML
    private Pane pnl_matrix_b;
    @FXML
    private Label titulo;
    @FXML
    private AnchorPane container;
    @FXML
    private Button button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hanbleActionButton(ActionEvent event) {
        if(event.getSource() == btn_matrix_C)
            pnl_matrix_C.toFront();
        else if(event.getSource() == btn_matrix_K)
            pnl_matrix_K.toFront();
        else if(event.getSource() == btn_matrix_L)
            pnl_matrix_L.toFront();
        else if(event.getSource() == btn_matrix_G)
            pnl_matrix_G.toFront();
        else if(event.getSource() == btn_matrix_X)
            pnl_matrix_X.toFront();
        else if(event.getSource() == btn_matrix_b)
            pnl_matrix_b.toFront();
    }

    @FXML
    private void loadStep8Screen(ActionEvent event) throws IOException {
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
    }
    
}
