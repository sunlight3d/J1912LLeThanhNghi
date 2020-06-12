/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptech;
import com.mycompany.aptech.models.Product;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Quality quality = Quality.EXCELLENT;
        int direction = Direction.NORTH;
        if(direction == Direction.EAST) {

        }
        //Database.getInstance().insertProduct(new Product("iphone 4", 400.0, 4));
        LoginStage loginStage = new LoginStage();
        loginStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
