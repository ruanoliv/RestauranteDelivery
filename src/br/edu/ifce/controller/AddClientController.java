package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.model.Cliente;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.service.ClienteService;
import br.edu.ifce.service.EnderecoService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddClientController implements Initializable {
	private ClienteService clienteService = new ClienteService();
	private EnderecoService enderecoService = new EnderecoService();
	
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btAdd;

    @FXML
    private TextField txtBornDate;

    @FXML
    private TextField txtCep;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtStreet;

    @FXML
    void addClient(ActionEvent event) {
    	
    	Endereco endereco = new Endereco();
    	Cliente cliente = new Cliente();
    	
    	endereco.setCep(txtCep.getText());
    	endereco.setCidade(txtCity.getText());
    	endereco.setRua(txtStreet.getText());
    	
    	cliente.setNome(txtName.getText());
    	cliente.setCpf(txtCpf.getText());
    	cliente.setDataNascimento(txtBornDate.getText());
    	cliente.setEndereco(endereco);
    	
    	enderecoService.addEndereco(endereco);
    	clienteService.addCliente(cliente);
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
