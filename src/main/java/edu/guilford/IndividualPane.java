package edu.guilford;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

// IndividualPane is a class that extends one of the Pane classes
public class IndividualPane extends GridPane {
    //Could have GridPane, TitlePane, StckPane, Pane, BorderPane, and others
    //These organize the components we want to display in different ways

    //Three String attributes
    private String name;
    private String email;
    private String phone;

    // add a textfield attribute for the name
    private TextField nameField;
    // add a textfield attribute for the email
    private TextField emailField;
    // add a textfield attribute for the phone
    private TextField phoneField;


    //Constructor
    public IndividualPane() {
        name = "John Doe";
        email = "jdoe@guilford";
        phone = "555-555-5555";

        //Instantiate the textfield for the name
        nameField = new TextField();
        //Instantiate the textfield for the email
        emailField = new TextField();
        //Instantiate the textfield for the phone
        phoneField = new TextField();

        //Add a label to the pane
        this.add(new javafx.scene.control.Label("Name: " + name), 0, 0);
        this.add(new javafx.scene.control.Label("Email: " + email), 0, 1);
        this.add(new javafx.scene.control.Label("Phone: " + phone), 0, 2);
        // Add nameField to the pane next the to the name label
        this.add(nameField, 1, 0);
        // Add emailField to the pane next the to the email label
        this.add(emailField, 1, 1);
        // Add phoneField to the pane next the to the phone label
        this.add(phoneField, 1, 2);

        //Give the pane a border
        this.setStyle("-fx-border-color: black");
        //and a background color
        this.setStyle("-fx-background-color: lightblue");
    }
}
