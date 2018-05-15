/*
 * @author s3419069 (Mykhailo Muzyka)
 * 
 * Copyright (c) 2018 RMIT University, Advanced Programming (COSC1295) Assignment 2
 */
package userInreface;

import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

/**
 * @author s3419069 (Mykhailo Muzyka)
 * this class represents simple Select Relation stage
 */
public class SelectRelation extends SecondaryStage {
	
	/**
	 * just simple combo box
	 */
	ComboBox<String> comboBox = new ComboBox<>();
	
	/**
	 * @return selected relation
	 */
	public String getRelation() {
		try {
			return comboBox.getSelectionModel().getSelectedItem().toString();
		}
		catch (Exception e) {
			return null;
		}
	}

	/**
	 * fill main gridpane for the stage
	 */
	@Override
	protected void show(GridPane paneWrapper) {
		ObservableList<String> options = 
  			    FXCollections.observableArrayList(
  			        "couple",
  			        "friends",
  			        "classmates",
  			        "colleagues"
  			    );
  		comboBox.setItems(options);
  		paneWrapper.add(comboBox, 1, 2);	
	}
	
}
