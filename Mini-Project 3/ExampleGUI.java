/* ***********************
*    Alex Helfrich       *
*    Comp 1302-04        *
*    StudentGUI Class    *
*    Lab 8 Problem #2    *
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

public class ExampleGUI extends Application implements EventHandler<ActionEvent>{
	//creating elements
	final Text title = new Text("Student Info");
	final Text labelID = new Text("Student ID");
	final Text labelFN = new Text("First Name");
	final Text labelLN = new Text("Last Name");
	final Text labelGPA = new Text("Student GPA");
	final TextField fieldID = new TextField();
	final TextField fieldFN = new TextField();
	final TextField fieldLN = new TextField();
	final TextField fieldGPA = new TextField();
	final Button find = new Button();
	final Button update = new Button();
	final Button exit = new Button();
	
	@Override
	public void start(Stage stage) {
		//editing title element for topPane
		title.setFont(Font.font("", FontWeight.BOLD, 20));
		
		//editing elements for bottomPane
		find.setText("Find");
		find.setLayoutX(60);
		find.setLayoutY(-20);
		update.setText("Update");
		update.setLayoutX(120);
		update.setLayoutY(-20);
		update.setOnAction(this);
		exit.setText("Exit");
		exit.setLayoutX(197);
		exit.setLayoutY(-20);
		
		//repositioning elements for centerPane
		labelID.setLayoutX(20);
		labelFN.setLayoutX(20);
		labelLN.setLayoutX(20);
		labelGPA.setLayoutX(20);
		labelID.setLayoutY(40);
		labelFN.setLayoutY(90);
		labelLN.setLayoutY(140);
		labelGPA.setLayoutY(190);
		fieldID.setLayoutX(120);
		fieldFN.setLayoutX(120);
		fieldLN.setLayoutX(120);
		fieldGPA.setLayoutX(120);
		fieldID.setLayoutY(20);
		fieldFN.setLayoutY(70);
		fieldLN.setLayoutY(120);
		fieldGPA.setLayoutY(170);
		
		//creating panes
		BorderPane border = new BorderPane();
		StackPane topPane = new StackPane();
		Pane centerPane = new Pane();
		Pane bottomPane = new Pane();
		
		//adding elements to panes
		topPane.getChildren().addAll(title);
		centerPane.getChildren().addAll(labelID, labelFN, labelLN, labelGPA,
										fieldID, fieldFN, fieldLN, fieldGPA);
		bottomPane.getChildren().addAll(find, update, exit);
		
		//organizing borderpane
		border.setPadding(new Insets (10, 20, 10, 20));
		border.setTop(topPane);
		border.setCenter(centerPane);
		border.setBottom(bottomPane);
		
		//setting scene and stage
		Scene scene = new Scene(border, 340, 310);
		stage.setTitle("StudentGUI");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		stage.setOnCloseRequest(new EventHandler<ActionEvent>()
	}
	
	public void handle(ActionEvent event) {
		//Creates popup window when update button is pressed
		if(update == event.getSource()) {
			Button btn = new Button();
			btn.setText("Example");
			
			BorderPane root = new BorderPane();
			
			root.setCenter(btn);
			
			Scene scene = new Scene(root, 100, 50);
			Stage secondStage = new Stage();
			secondStage.setTitle("Hooray for popups!");
			secondStage.setScene(scene);
			secondStagetage.show();
			
			if(btn == event.getSource()) {
				
			}
		}
		
	}
	
	public static void main(String[] args) { launch(args); } //end main
} //end class