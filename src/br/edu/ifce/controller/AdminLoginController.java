package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.service.AdminService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdminLoginController implements Initializable {
	private AdminService adminService = new AdminService();
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btLogin;

    @FXML
    private TextField txtLogin;

    @FXML
    void login(ActionEvent event) {
    	if(adminService.buscarAdminPorLogin(txtLogin.getText()).getLogin() != null) {
    		if (application == null) {
    		} else {
    			application.goToAdmin();
    		}
    	}else {

    	}
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
