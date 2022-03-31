package br.edu.ifce.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifce.app.App;
import br.edu.ifce.model.Admin;
import br.edu.ifce.service.AdminService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddAdminController implements Initializable {
	
	private AdminService adminService = new AdminService();
	private App application;
	
	public void setApp(App application) {
		this.application = application;
		
	}
	
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button btAdd;

    @FXML
    private TextField txtLogin;

    @FXML
    void addAdmin(ActionEvent event) {
    	Admin admin = new Admin();
    	admin.setLogin(txtLogin.getText());
    	
    	adminService.addAdmin(admin);
    	
    	if(application == null) {
    		
    	}else {
    		application.goToAdmin();
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
