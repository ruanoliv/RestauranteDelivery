package br.edu.ifce.controller;
import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.model.Prato;
import br.edu.ifce.service.PratoService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class MainScreenController implements Initializable {
	
	private PratoService pratoService = new PratoService();
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}

    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btAddOnCart;

    @FXML
    private Button btGoCart;

    @FXML
    private TableView<Prato> tbFood;
    
    @FXML
    private TableColumn<Prato, String> tcNome;

    @FXML
    private TableColumn<Prato, Double> tcPreco;

    @FXML
    private TextField txtSearch;

    @FXML
    void addOnCart(ActionEvent event) {

    }

    @FXML
    void goCart(ActionEvent event) {

    }

    @FXML
    void searchFood(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tcNome.setCellValueFactory(new PropertyValueFactory<Prato, String>("nome"));
		tcPreco.setCellValueFactory(new PropertyValueFactory<Prato, Double>("preco"));
		tbFood.setItems(FXCollections.observableArrayList(pratoService.listarPratos()));
		
	}

}
