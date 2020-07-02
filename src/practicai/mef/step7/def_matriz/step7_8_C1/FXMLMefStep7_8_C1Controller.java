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
import javafx.scene.layout.Pane;
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
    private AnchorPane container;
    @FXML
    private Button btnMatrixC;
    @FXML
    private Button btnMatrixK;
    @FXML
    private Button btnMatrixf;
    @FXML
    private Button btnMatrixL;
    @FXML
    private Button btnMatrixG;
    @FXML
    private Button btnMatrixg;
    @FXML
    private Pane pnl_matrix_C;
    @FXML
    private Button btnPage1;
    @FXML
    private Button btnPage2;
    @FXML
    private Button btnPage3;
    @FXML
    private Button btnPage4;
    @FXML
    private Pane pnl_page1;
    @FXML
    private Pane pnl_page2;
    @FXML
    private Pane pnl_page3;
    @FXML
    private Pane pnl_page4;
    @FXML
    private Pane pnl_matrix_K;
    @FXML
    private Pane pnl_matrix_f;
    @FXML
    private Button PageBtn1;
    @FXML
    private Button PageBtn2;
    @FXML
    private Pane pnlPage1;
    @FXML
    private Pane pnlPage2;
    @FXML
    private Pane pnl_matrix_L;
    @FXML
    private Pane pnl_matrix_G;
    @FXML
    private Pane pnl_matrix_g;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadStep7_9_C2(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/practicai/mef/step7/assembly/FXMLMefStep7_Assembly.fxml"));
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
        if(event.getSource() == btnMatrixC)
            pnl_matrix_C.toFront();
        else if(event.getSource() == btnMatrixK)
            pnl_matrix_K.toFront();
        else if(event.getSource() == btnMatrixf)
            pnl_matrix_f.toFront();
        else if(event.getSource() == btnMatrixL)
            pnl_matrix_L.toFront();
        else if(event.getSource() == btnMatrixG)
            pnl_matrix_G.toFront();
        else if(event.getSource() == btnMatrixg)
            pnl_matrix_g.toFront();
    }

    @FXML
    private void handleActionPage(ActionEvent event) {
        if(event.getSource() == btnPage1)
            pnl_page1.toFront();
        else if(event.getSource() == btnPage2)
            pnl_page2.toFront();
        else if(event.getSource() == btnPage3)
            pnl_page3.toFront();
        else if(event.getSource() == btnPage4)
            pnl_page4.toFront();
    }

    @FXML
    private void handleActionPage2(ActionEvent event) {
        if(event.getSource() == PageBtn1)
            pnlPage1.toFront();
        else if(event.getSource() == PageBtn2)
            pnlPage2.toFront();
    }
    
}
