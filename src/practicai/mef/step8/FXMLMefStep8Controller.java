/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai.mef.step8;

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
public class FXMLMefStep8Controller implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private Button button;
    @FXML
    private Button btn_aplicando_dirichlet;
    @FXML
    private Button btn_matriz_k_global;
    @FXML
    private Button btn_x_y_b_global;
    @FXML
    private Button btn_dirichlet_neumann;
    @FXML
    private Pane pnl_matriz_k_global;
    @FXML
    private Pane pnl_aplicando_dirichlet;
    @FXML
    private Pane pnl_matriz_x_y_b;
    @FXML
    private Pane pnl_dirichlet_neumann;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadGoodByeScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/goodbye/FXMLGoodBye.fxml"));
      Scene scene = button.getScene();
      
      root.translateYProperty().set(scene.getHeight());
      
      StackPane parentContainer = (StackPane) scene.getRoot();
      parentContainer.getChildren().add(root);
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
      timeline.getKeyFrames().add(kf);
      timeline.setOnFinished(event1->{
          parentContainer.getChildren().remove(container);
      });
      timeline.play();
    }

    @FXML
    private void handleActionButton(ActionEvent event) {
        if(event.getSource() == btn_aplicando_dirichlet)
            pnl_aplicando_dirichlet.toFront();
        else if(event.getSource() == btn_matriz_k_global)
            pnl_matriz_k_global.toFront();
        else if(event.getSource() == btn_x_y_b_global)
            pnl_matriz_x_y_b.toFront();
        else if(event.getSource() == btn_dirichlet_neumann)
            pnl_dirichlet_neumann.toFront();
    }

    @FXML
    private void loadAssemblyScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/mef/step7/assembly/FXMLMefStep7_Assembly.fxml"));
      Scene scene = button.getScene();
      
      root.translateYProperty().set(-scene.getHeight());
      
      StackPane parentContainer = (StackPane) scene.getRoot();
      parentContainer.getChildren().add(root);
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
      timeline.getKeyFrames().add(kf);
      timeline.setOnFinished(event1->{
          parentContainer.getChildren().remove(container);
      });
      timeline.play();
    }
    
}
