/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai.mef.step1;

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
public class FXMLMefStep1Controller implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private Button button;
    @FXML
    private Pane pnl_step1;
    @FXML
    private Pane pnl_step2;
    @FXML
    private Pane pnl_step3;
    @FXML
    private Pane pnl_step4;
    @FXML
    private Button btn_step1;
    @FXML
    private Button btn_step2;
    @FXML
    private Button btn_step3;
    @FXML
    private Button btn_step4;
    @FXML
    private Pane pnl_step5;
    @FXML
    private Pane pnl_step6;
    @FXML
    private Pane pnl_matrixD;
    @FXML
    private Button btn_step5;
    @FXML
    private Button buttonD;
    @FXML
    private Button buttonF;
    @FXML
    private Button btn_step6;
    @FXML
    private Pane pnl_matrixF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadMefStep2Screen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/mef/step7/def_matriz/step7_8_C1/FXMLMefStep7_8_C1.fxml"));
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

    @FXML
    private void handleActionButton(ActionEvent event) {
        if(event.getSource() == btn_step1)
            pnl_step1.toFront();
        else if(event.getSource() == btn_step2)
            pnl_step2.toFront();
        else if(event.getSource() == btn_step3)
            pnl_step3.toFront();
        else if(event.getSource() == btn_step4)
            pnl_step4.toFront();
        else if(event.getSource() == btn_step5)
            pnl_step5.toFront();
        else if(event.getSource() == btn_step6)
            pnl_step6.toFront();
    }

    @FXML
    private void handleActionButton2(ActionEvent event) {
        if(event.getSource() == buttonD)
            pnl_matrixD.toFront();
        else if(event.getSource() == buttonF)
            pnl_matrixF.toFront();
    }
    
}
