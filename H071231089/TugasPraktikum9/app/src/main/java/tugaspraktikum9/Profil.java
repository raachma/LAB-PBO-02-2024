package tugaspraktikum9;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Profil {
    private Stage stage;
    private String name;
    private String age;
    private String dob;
    private String address;
    private String program;

    public Profil(Stage stage, String name, String age, String dob, String address, String program) {
        this.stage = stage;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.program = program;
    }

    public void show() {
        Label title = new Label("Profile");
        Label nameLabel = new Label("Name: ");
        Label ageLabel = new Label("Age: ");
        Label dobLabel = new Label("Date of Birth: ");
        Label addressLabel = new Label("Address: ");
        Label programLabel = new Label("Study Program: ");

        Label nameValue = new Label(name);
        Label ageValue = new Label(age);
        Label dobValue = new Label(dob);
        Label addressValue = new Label(address);
        Label programValue = new Label(program);

        Button backButton = new Button("< Back");

        title.getStyleClass().add("title");
        backButton.getStyleClass().add("form-hover");

        VBox profileInfo = new VBox(10);
        profileInfo.getChildren().addAll(
            new HBox(10, nameLabel, nameValue),
            new HBox(10, ageLabel, ageValue),
            new HBox(10, dobLabel, dobValue),
            new HBox(10, addressLabel, addressValue),
            new HBox(10, programLabel, programValue)
        );

        backButton.setOnAction(event -> {
            InputData inputData = new InputData(stage);
            inputData.show();
        });

        VBox root = new VBox(20);
        root.getChildren().addAll(title, profileInfo, backButton);
        root.setStyle("-fx-padding: 20");

        Scene scene = new Scene(root, 400, 500);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
