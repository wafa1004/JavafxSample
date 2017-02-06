package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.scene.paint.Color.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        ObservableList list = root.getChildren();

        //creating a Stack pane.
        StackPane pane = new StackPane();

        Scene scene = new Scene(root, 1000,500);
        //setting color to the scene.
        scene.setFill(GREENYELLOW);

        //setting the title to Stage.
        primaryStage.setTitle("Sample application");

        //setting the scene to Stage.
        primaryStage.setScene(scene);

        //displaying the stage.
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
