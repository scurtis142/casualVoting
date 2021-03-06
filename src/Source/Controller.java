package Source;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Controller class for the Character Editor.
 * @author Alexandra Crawley
 * @author leggy (Lachlan Healey)
 */
public class Controller implements Initializable{
	/*
	 * Instance variables:
	 */
	private Account account;
	private Vote vote;
	
	/* The GUI components from the FXML file */
	@FXML
	private Button login$loginbutton;
	@FXML
	private Button login$registerButton;
	
	/**
	 * A constructor to initialise the controller with no parameters.
	 */
	public Controller() {
		
	}
	
	/**
	 * A method to handle the GUI initialisation.
	 * 
	 * @param location The location of the root object.
	 * @param resources The resources to localise the root.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		handleButtonAction();
	}
	
	/*
	 * A method to create all of the button and image view event handlers.
	 */
	private void handleButtonAction(){
		login$loginbutton.setOnAction(verifyAndLogin());
	}
	
	/*
	 * Checks if the login details are correct and if so, changes the screen to the home screen
	 */
	private EventHandler<ActionEvent> verifyAndLogin(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				try {
					Parent p = FXMLLoader.load(getClass().getResource("accountHome.fxml"));
					Scene nextScene = new Scene(p);
					
					Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
					
					window.setScene(nextScene);
					window.show();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		return event;
	}
	
	/*
	 * Registers an account with the details in thetextfields
	 */
	private EventHandler<ActionEvent> register(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * Changes the scene to the home scene
	 */
	private EventHandler<ActionEvent> homeButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * Changes the scene to the login scene
	 */
	private EventHandler<ActionEvent> logoutButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * Changes the current scene to the account details scene
	 */
	private EventHandler<ActionEvent> accountDetailsButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * changes the scene to the create vote scene
	 */
	private EventHandler<ActionEvent> createVoteButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * Changes the current scene to view votes and details
	 */
	private EventHandler<ActionEvent> viewVotesButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * Changes the scene to the previous scene
	 */
	private EventHandler<ActionEvent> backButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * resets the password
	 */
	private EventHandler<ActionEvent> resetPasswordHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * Saves the account details
	 */
	private EventHandler<ActionEvent> accountDetailsSaveButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * a handler for the add question button in create vote scene
	 */
	private EventHandler<ActionEvent> addQuestionButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * a handler for the view questions button in create vote scene
	 */
	private EventHandler<ActionEvent> viewQuestionButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * a handler for the delete question button
	 */
	private EventHandler<ActionEvent> deleteQuestionButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * create vote save button handler
	 */
	private EventHandler<ActionEvent> createVoteSaveButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	/*
	 * finish button handler for vote details screen
	 */
	private EventHandler<ActionEvent> voteDetailsFinishButtonHandler(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
}