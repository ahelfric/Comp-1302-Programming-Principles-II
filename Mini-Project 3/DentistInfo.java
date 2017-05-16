/* ***********************
*    Alex Helfrich       *
*    Comp 1302-04        *
*    StudentGUI Class    *
*    Mini-Project 3      *
*    DentistInfo Class   *
*********************** */

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

public class DentistInfo {
	private static String dentID;
	private static String dentPass;
	private static Text title = new Text("Dentist Info");
	private static TextArea info = new TextArea();
	public static void show(String IDIn, String passIn) {
		dentID = new String(IDIn);
		dentPass = new String(passIn);
		
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
		stage.setTitle("Dentist Form");
		Scene scene = new Scene(border, 340, 350);
		stage.setScene(scene);
		stage.showAndWait();;
		
		//Displays the appointments for the dentist
		Dentist dent1 = new Dentist();
		dent1.select(dentID);
		if (dent1.getApt() != null) {
			info.setText(dent1.toString());
		}
		
	}	
}