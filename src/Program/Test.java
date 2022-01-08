package Program;


import java.util.Calendar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Test extends Application {


    Calendar rightNow = Calendar.getInstance();
    int h = rightNow.get(Calendar.HOUR_OF_DAY);
    FrameStart rundd = new FrameStart();

         @Override
        public void start (Stage primaryStage) throws Exception {
            if (h > 7 && h <= 18) {
                Parent root = FXMLLoader.load(getClass().getResource("sampleday.fxml"));
                primaryStage.setTitle("Simple Weather");
                primaryStage.setScene(new Scene(root, 1280, 720));
                primaryStage.setResizable(false);
                primaryStage.show();
            }
            else if (h > 18 || h < 8) {
                Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                primaryStage.setTitle("Simple Weather");
                primaryStage.setScene(new Scene(root, 1280, 720));
                primaryStage.setResizable(false);
                primaryStage.show();
            } else {

            }
        }


    public static void main(String[] args) {
        launch(args);
    }
}
