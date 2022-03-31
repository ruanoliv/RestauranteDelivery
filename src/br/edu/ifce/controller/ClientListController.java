package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.model.Cliente;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.service.ClienteService;
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

public class ClientListController implements Initializable {
	
	private ClienteService clienteService = new ClienteService();
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
	
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btBack;

    @FXML
    private TableView<Cliente> tbClient;

    @FXML
    private TableColumn<Cliente, String> tcCpf;

    @FXML
    private TableColumn<Cliente, String> tcData;

    @FXML
    private TableColumn<Cliente, Endereco> tcEndereco;

    @FXML
    private TableColumn<Cliente, String> tcNome;

    @FXML
    private TextField txtSearch;

    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void searchClient(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tcNome.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome"));
		tcCpf.setCellValueFactory(new PropertyValueFactory<Cliente, String>("cpf"));
		tcData.setCellValueFactory(new PropertyValueFactory<Cliente, String>("data"));
		tcEndereco.setCellValueFactory(new PropertyValueFactory<Cliente, Endereco>("endereco_id"));
		tbClient.setItems(FXCollections.observableArrayList(clienteService.listarClientes()));
		
	}

}
