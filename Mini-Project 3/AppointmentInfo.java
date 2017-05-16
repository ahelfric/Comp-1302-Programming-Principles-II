/* ***************************
*    Alex Helfrich           *
*    Comp 1302-04            *
*    StudentGUI Class        *
*    Mini-Project 3          *
*    Appointment Info Class  *
*************************** */

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.geometry.*;

public class AppointmentInfo {
	private static String patID;
	private static String patPass;
	private static Text title = new Text("AppointmentInfo");
	private static TextArea info = new TextArea();
	public static void show(String IDIn, String passIn) {
		patID = new String(IDIn);
		patPass = new String(passIn);
		
		//creating panes
		BorderPane border = new BorderPane();
		StackPane topPane = new StackPane();
		Pane centerPane = new Pane();
		Pane bottomPane = new Pane();
				
		//adding elements to panes
		topPane.getChildren().addAll(title);
		centerPane.getChildren().addAll(info);

		//organizing borderpane
		border.setPadding(new Insets (10, 20, 10, 20));
		border.setTop(topPane);
		border.setCenter(centerPane);
		border.setBottom(bottomPane);
		
		//setting scene and stage
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setTitle("Patient Form");
		Scene scene = new Scene(border, 340, 350);
		stage.setScene(scene);
		stage.showAndWait();;
		
		//Displays the appointment for the patient, if it exists
		Patient pat1 = new Patient();
		pat1.select(patID);
		if (pat1.getApt() != null) {
			info.setText(pat1.getApt().toString());
		}
		
	}	
}