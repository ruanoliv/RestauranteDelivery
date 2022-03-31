package br.edu.ifce.controller;
import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable{
	
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
	

    @FXML
    private Label btAdmin;
    
    @FXML
    private Button btLogin;

    @FXML
    private Label btRegister;

    @FXML
    private TextField txtLogin;

    @FXML
    void goRegister(MouseEvent event) {
    	if(application == null) {
    		
    	}else {
    		application.goToAddClient();
    	}
    }

    @FXML
    void login(ActionEvent event) {
    	if(application == null) {
    		
    	}else {
    		application.goToMain();
    		
    	}
    }
    

    @FXML
    void irAdmin(MouseEvent event) {
    	if(application == null) {
    		
    	}else {
    		application.goToAdminLogin();
    		
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
