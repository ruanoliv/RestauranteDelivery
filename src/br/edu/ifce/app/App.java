package br.edu.ifce.app;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.edu.ifce.controller.AddClientController;
import br.edu.ifce.controller.AddFoodController;
import br.edu.ifce.controller.AdminController;
import br.edu.ifce.controller.AdminLoginController;
import br.edu.ifce.controller.ClientListController;
import br.edu.ifce.controller.FoodListController;
import br.edu.ifce.controller.LoginController;
import br.edu.ifce.controller.MainScreenController;
import br.edu.ifce.controller.RequestListController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {
	private Stage stage;
	
    public static void main(String[] args) {
       	Application.launch(App.class, (java.lang.String[]) null);
    }

    @Override
	public void start(Stage primaryStage) throws Exception {
		try {
			stage = primaryStage;
			stage.setTitle("Restaurante Delivery");
			goToLogin();
			primaryStage.show();
		} catch (Exception ex) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
    
    public void goToLogin() {
		try {
			
			LoginController controller = (LoginController) replaceSceneContent("../view/LoginScreen.fxml");
			controller.setApp(this);
			
			
		} catch (Exception ex) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
    public void goToMain() {
    	try {
    		
    		MainScreenController controller = (MainScreenController) replaceSceneContent("../view/MainScreen.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToAddClient() {
    	try {
    		
    		AddClientController controller = (AddClientController) replaceSceneContent("../view/AddClientScreen.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToAddFood() {
    	try {
    		
    		AddFoodController controller = (AddFoodController) replaceSceneContent("../view/AddFoodScreen.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToListFood() {
    	try {
    		
    		FoodListController controller = (FoodListController) replaceSceneContent("../view/foodList.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToListCliente() {
    	try {
    		
    		ClientListController controller = (ClientListController) replaceSceneContent("../view/clientList.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToListRequests() {
    	try {
    		
    		RequestListController controller = (RequestListController) replaceSceneContent("../view/RequestList.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToAdminLogin() {
    	try {
    		
    		AdminLoginController controller = (AdminLoginController) replaceSceneContent("../view/AdminLoginScreen.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    public void goToAdmin() {
    	try {
    		
    		AdminController controller = (AdminController) replaceSceneContent("../view/AdminScreen.fxml");
    		controller.setApp(this);
    		
    		
    	} catch (Exception ex) {
    		Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    
    private Initializable replaceSceneContent(String fxml) throws Exception {
    	
    	
		FXMLLoader loader = new FXMLLoader();
		InputStream in = App.class.getResourceAsStream(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(App.class.getResource(fxml));
		
		AnchorPane page;
		try {
			page = (AnchorPane) loader.load(in);
		} finally {
			in.close();
		}
		Scene scene = new Scene(page, 1366, 768);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.setMaximized(true);
		return (Initializable) loader.getController();
		
	}


}