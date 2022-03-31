package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.model.Prato;
import br.edu.ifce.service.PratoService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddFoodController implements Initializable {
	
	private PratoService pratoService = new PratoService();
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btAdd;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPrice;

    @FXML
    void addFood(ActionEvent event) {
    	Prato prato = new Prato();
    	prato.setNome(txtName.getText());
    	prato.setPreco(Double.valueOf(txtPrice.getText()).doubleValue());
    	
    	pratoService.addPrato(prato);
    	
    	if(application == null) {
    		
    	}else {
    		application.goToListFood();
    	}

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
