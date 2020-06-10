package com.mycompany.aptech;

import com.mycompany.aptech.models.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.swing.plaf.ProgressBarUI;

public class ProductListStage extends Stage implements IMyStage{
    private Scene scene;
    public LoginStage mainStage;
    private VBox vBox;
    private HBox hBox = new HBox();
    private TableView<Product> tableView = new TableView<Product>();
    private Button btnInsert = new Button("Insert");
    private Button btnUpdate = new Button("Update");
    private Button btnDelete = new Button("Delete");
    ObservableList<Product> students = FXCollections.observableArrayList(
//            new Product("iphone 5", 500.0, 5),
//            new Product("iphone 7", 700.0, 7),
//            new Product("iphone 6", 600.0, 6)
            );
    @Override
    public void setupUI() {
        this.vBox = new VBox();
        this.setupTableView();
        hBox.getChildren().addAll(
                btnInsert, btnUpdate, btnDelete);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        this.vBox.getChildren().addAll(new Label("List of Products"),tableView, hBox);
        scene = new Scene(vBox, 400, 500);
        this.setScene(scene);
        students.addAll(Database.getInstance().getAllProducts());

    }
    private void setupTableView() {
        TableColumn columnProductName = new TableColumn("Product's name");
        columnProductName.setMinWidth(100);
        columnProductName.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn columnPrice = new TableColumn("Price");
        columnPrice.setMinWidth(100);
        columnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn columnAmount = new TableColumn("Amount");
        columnAmount.setMinWidth(100);
        columnAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        this.tableView.getColumns().addAll(columnProductName,columnPrice, columnAmount);
        this.tableView.setItems(this.students);

    }
    ProductListStage(){
        setupUI();
        this.setupActions();
    }

    @Override
    public void showAndWait() {
        this.mainStage.disableSomething();
        super.showAndWait();

    }



    @Override
    public void setupActions() {
        this.setOnHidden(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                ProductListStage.this.mainStage.enableAll();
            }
        });
    }
}
