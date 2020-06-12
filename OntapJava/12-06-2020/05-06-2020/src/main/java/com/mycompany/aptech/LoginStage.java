package com.mycompany.aptech;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginStage extends Stage implements IMyStage{
    private Label lblTitle;
    private Scene scene;
    private GridPane gridPane = new GridPane();
    private TextField txtName = new TextField();
    private PasswordField txtPassord = new PasswordField();
    private VBox vBox = new VBox();
    private Button btnLogin = new Button("Login to your Account");
    private HBox hBox = new HBox();
    private Label topLabel = new Label("Login Screen");
    private ProductListStage productListStage;
    public LoginStage() {
        this.setupUI();
        this.setupActions();
        this.setScene(this.scene);
    }

    @Override
    public void setupActions() {
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if(LoginStage.this.txtName.getText().equals("hoang") &&
                        LoginStage.this.txtPassord.getText().equals("123456")
                ) {
                    if(productListStage == null) {
                        productListStage = new ProductListStage();
                        productListStage.mainStage = LoginStage.this;
                    }
                    productListStage.showAndWait();
                } else {
                    showAlert("Sai pass roi nhe");
                }
//                showAlert("name ="+MainStage.this.txtName.getText()
//                        +"pass:"+MainStage.this.txtPassord.getText());
            }
        });
    }

    @Override
    public void setupUI() {
        this.setTitle("Hello");
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(new Label("Name: "), 0, 0, 1, 1);
        gridPane.add(new Label("Password: "), 0, 1, 1, 1);
        gridPane.add(txtName, 1, 0, 1, 1);
        txtName.setPromptText("Enter your name");
        gridPane.add(txtPassord, 1, 1, 1, 1);
        txtPassord.setPromptText("Enter your pass");

        hBox.getChildren().add(btnLogin);
        vBox.getChildren().addAll(topLabel, gridPane, hBox);
        topLabel.setTextFill(Color.web("#ff0000"));
        vBox.setAlignment(Pos.TOP_CENTER);
        hBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20, 10, 10, 10));
        scene = new Scene(vBox);
        //fake data
        this.txtName.setText("hoang");
        this.txtPassord.setText("123456");
    }

    private void showAlert(String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Alert");
        alert.setContentText(content);
        alert.showAndWait();
    }
    public void disableSomething(){
        this.vBox.setDisable(true);
    }
    public void enableAll(){
        this.vBox.setDisable(false);
    }
}
