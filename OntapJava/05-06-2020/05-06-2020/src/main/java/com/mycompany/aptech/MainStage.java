package com.mycompany.aptech;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainStage extends Stage {
    private Label lblTitle;
    private Scene scene;
    public void initComponents() {
        this.setTitle("Hello");
        this.initModality(Modality.APPLICATION_MODAL);
        GridPane gridPane = new GridPane();
        lblTitle = new Label("TableView example");
        gridPane.add(lblTitle, 0,0,2,1);
        scene = new Scene(new StackPane(lblTitle), 640, 480);
        this.setScene(this.scene);
    }
}
