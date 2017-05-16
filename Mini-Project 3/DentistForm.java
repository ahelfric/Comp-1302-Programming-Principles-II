/* ***********************
*    Alex Helfrich       *
*    Comp 1302-04        *
*    StudentGUI Class    *
*    Mini-Project 3      *
*    DentistForm Class   *
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

public class DentistForm {
	private static String dentID;
	private static String dentPass;
	private static Text title = new Text("Dentist Form");
	private static TextArea info = new TextArea();
	private static Button btn = new Button();
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
		bottomPane.getChildren().addAll(btn);

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
		
		//Check if the dentist ID exists and displays it
		//If not, display a window telling the user to enter a correct ID
		if(patID.startsWith("D")) {
			Dentist dent1 = new Dentist();
			dent1.select(dentID);
			if ((dent1.getPassword() != null) && (dentPass.compareTo(dent1.getPassword()) == 0)) {
				btn.setText("Display Appointments");
				btn.setOnAction(e -> DentistInfo.show(dentID, dentPass));
				info.setText(dent1.getFirstName() + " " + dent1.getLastName() + "\n" +
							 dent1.getEmail() + "\n" + dent1.getOffice());
			}
		}
	}	
}