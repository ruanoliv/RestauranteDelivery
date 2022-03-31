package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.model.Cliente;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.model.Pedido;
import br.edu.ifce.model.Prato;
import br.edu.ifce.service.PedidoService;
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

public class RequestListController implements Initializable {
	
	private PedidoService pedidoService = new PedidoService();
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
	
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btVoltar;

    @FXML
    private TableView<Pedido> tbRequests;
    
    @FXML
    private TableColumn<Pedido, Cliente> tcCliente;

    @FXML
    private TableColumn<Pedido, Prato> tcPrato;

    @FXML
    private TextField txtSearch;

    @FXML
    void requestsSearch(ActionEvent event) {

    }

    @FXML
    void voltarTela(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tcCliente.setCellValueFactory(new PropertyValueFactory<Pedido, Cliente>("cliente"));
		tcPrato.setCellValueFactory(new PropertyValueFactory<Pedido, Prato>("prato"));
		tbRequests.setItems(FXCollections.observableArrayList());
	}

}
