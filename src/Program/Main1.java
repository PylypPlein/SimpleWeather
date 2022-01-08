package Program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main1 extends Application {

    FrameStart runds = new FrameStart();


        @Override
        public void start (Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Simple Weather");
            primaryStage.setScene(new Scene(root, 1280, 720));
            primaryStage.setResizable(false);
            primaryStage.show();
        }


    public static void main(String[] args){launch(args);}
}