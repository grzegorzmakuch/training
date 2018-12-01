package javaFx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;


public class FirstApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.getStyleClass().add("grid-pane");

        Button btn1 = new Button("Guzik 1");
        Button btn2 = new Button("Guzik 2");

        TextField textField1 = new TextField("Pole tekstowe 1");
        TextField textField2 = new TextField("Pole tekstowe 2");

        CheckBox checkbox1 = new CheckBox("Checkbox 1");
        CheckBox checkBox2 = new CheckBox("Checkbox 2");

        gridPane.add(btn1, 0, 0);
        gridPane.add(btn2, 0, 1);
        gridPane.add(textField1, 1, 0);
        gridPane.add(textField2, 1, 1);
        gridPane.add(checkbox1, 2, 0);
        gridPane.add(checkBox2, 2, 1);

        Scene scene = new Scene(gridPane, 600, 280);
        scene.getStylesheets().add("javaFx/style.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
