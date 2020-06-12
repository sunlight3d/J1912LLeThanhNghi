package com.mycompany.aptech;

import com.mycompany.aptech.models.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Callback;

import javax.swing.plaf.ProgressBarUI;
import java.util.Optional;

public class ProductListStage extends Stage implements IMyStage{
    private Scene scene;
    public LoginStage mainStage;
    private VBox vBox;
    private HBox hBox = new HBox();
    private TableView<Product> tableView = new TableView<Product>();
    private Button btnInsert = new Button("Insert");
    private Button btnUpdate = new Button("Update");
    private Button btnDelete = new Button("Delete");

    ContextMenu contextMenu = new ContextMenu();
    MenuItem menuItemEdit = new MenuItem("Edit");
    MenuItem menuItemDelete = new MenuItem("Delete");

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
    private void reloadData() {
        students.removeAll();
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
        //setup context menu
        tableView.setRowFactory(new Callback<TableView<Product>, TableRow<Product>>() {
            @Override
            public TableRow<Product> call(TableView<Product> productTableView) {
                final TableRow<Product> tableRow = new TableRow<Product>();
                menuItemEdit.setOnAction((ActionEvent actionEvent)->{
                    System.out.println("Bam vao Edit");
                });
                menuItemDelete.setOnAction((ActionEvent actionEvent)->{
                    System.out.println("Bam vao Delete");
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Delete");
                    alert.setHeaderText("Are you sure want delete?");

                    // option != null.
                    Optional<ButtonType> option = alert.showAndWait();
                    if (option.get() == ButtonType.OK) {
                        //Product selectedProduct = tableRow.getItem();
                        Product selectedProduct = tableView.getSelectionModel().getSelectedItem();
                       Database.getInstance().deleteAProduct(selectedProduct.getId());
                       reloadData();
                    }  else {
                    }
                });
                tableRow.setOnMouseClicked((MouseEvent mouseEvent) -> {
                    if(mouseEvent.getButton() == MouseButton.SECONDARY) {
                        System.out.println("Bam chuot phai");
                        contextMenu.getItems().addAll(menuItemEdit, menuItemDelete);
                        contextMenu.show(tableRow,
                                mouseEvent.getScreenX(),
                                mouseEvent.getScreenY());
                    } else if(mouseEvent.getButton() == MouseButton.PRIMARY) {
                        System.out.println("Bam chuot trai");
                        contextMenu.hide();
                    }

                });
                return tableRow;
            }
        });

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
