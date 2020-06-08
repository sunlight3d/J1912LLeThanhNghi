package com.mycompany.aptech;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProductListStage extends Stage {
    private Scene scene;
    public MainStage mainStage;
    ProductListStage(){
        scene = new Scene(new Label("Man hinh 2"), 400, 500);
        this.setScene(scene);
    }

    @Override
    public void showAndWait() {
        this.mainStage.disableSomething();
        super.showAndWait();

    }
}
