package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class AdminController implements Initializable {
	
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
	
    @FXML
    private Button btListClent;

    @FXML
    private Button btListFood;

    @FXML
    private Button btListRequests;

    @FXML
    private Button btVoltar;

    @FXML
    void listClient(ActionEvent event) {
    	if(application == null) {
    		
    	}else{
    		application.goToListCliente();
    	}
    }

    @FXML
    void listFood(ActionEvent event) {
    	if(application == null) {
    		
    	}else{
    		application.goToListFood();
    	}
    }

    @FXML
    void listRequests(ActionEvent event) {
    	if(application == null) {
    		
    	}else{
    		application.goToListRequests();
    	}
    }

    @FXML
    void voltarTela(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
