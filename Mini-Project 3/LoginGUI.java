/* ***********************
*    Alex Helfrich       *
*    Comp 1302-04        *
*    StudentGUI Class    *
*    Mini-Project 3      *
*    LoginGUI Class      *
*********************** */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.geometry.*;

public class LoginGUI extends Application {
	//creating elements
	final Text title = new Text("Login");
	final Text labelID = new Text("ID:");
	final Text labelPW = new Text("Password:");
	final TextField fieldID = new TextField();
	final TextField fieldPW = new TextField();
	final Button patient = new Button();
	final Button dentist = new Button();

	
	@Override
	public void start(Stage stage) {
		//editing title element for topPane
		title.setFont(Font.font("", FontWeight.BOLD, 20));
		
		//editing elements for bottomPane
		enter.setText("Patient");
		enter.setLayoutX(130);
		enter.setLayoutY(-20);
		enter.setOnAction(e -> PatientForm.show(fieldID.getText(), fieldPW.getText()));
		
		enter.setText("Dentist");
		enter.setLayoutX(160);
		enter.setLayoutY(-20);
		enter.setOnAction(e -> DentistForm.show(fieldID.getText(), fieldPW.getText()));
		
		//repositioning elements for centerPane
		labelID.setLayoutX(20);
		labelPW.setLayoutX(20);
		
		labelID.setLayoutY(40);
		labelPW.setLayoutY(90);
		
		fieldID.setLayoutX(120);
		fieldPW.setLayoutX(120);
		
		fieldID.setLayoutY(20);
		fieldPW.setLayoutY(70);
		
		//creating panes
		BorderPane border = new BorderPane();
		StackPane topPane = new StackPane();
		Pane centerPane = new Pane();
		Pane bottomPane = new Pane();
		
		//adding elements to panes
		topPane.getChildren().addAll(title);
		centerPane.getChildren().addAll(labelID, labelPW, fieldID, fieldPW);
		bottomPane.getChildren().addAll(enter);
		
		//organizing borderpane
		border.setPadding(new Insets (10, 20, 10, 20));
		border.setTop(topPane);
		border.setCenter(centerPane);
		border.setBottom(bottomPane);
		
		//setting scene and stage
		Scene scene = new Scene(border, 340, 200);
		stage.setTitle("LoginGUI");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main(String[] args) { launch(args); } //end main
} //end class