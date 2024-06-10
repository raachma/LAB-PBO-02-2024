package tugaspraktikum9;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tugaspraktikum9.config.DbConnect;

public class HomeScene {
    private boolean firstInteraction = true;
    private boolean firstInteraction1 = true;
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Label welcome = new Label("Login");
        Label profil = new Label("Cek Your");
        Label profil1 = new Label(" Profil");
        TextField user = new TextField("Username");
        PasswordField sandi = new PasswordField();
        Button login = new Button("Login");
        Button registrasi = new Button("Sign Up");
        sandi.setPromptText("Password");

        user.setOnKeyPressed(event -> {
            if (firstInteraction) {
                user.setText("");
                firstInteraction = false;
            }
        });
        sandi.setOnKeyPressed(event -> {
            if (firstInteraction1) {
                sandi.setStyle("-fx-text-font : 10px");
                sandi.setText("");
                firstInteraction1 = false;
            }
        });

        // Styling
        welcome.getStyleClass().add("heading");
        user.getStyleClass().add("field");
        sandi.getStyleClass().add("field");
        login.getStyleClass().add("form-hover");
        login.setPrefSize(80, 25);
        registrasi.getStyleClass().add("form-hover");
        registrasi.setPrefSize(80, 25);
        profil.getStyleClass().add("ayo");
        profil1.getStyleClass().add("ayo");
        profil1.setStyle("-fx-font-weight : BOLD");

        login.setOnAction(event -> handleLogin(user.getText(), sandi.getText()));

        registrasi.setOnAction(event -> {
            InputData input = new InputData(stage);
            input.show();
        });

        // Layout
        Region spacer = new Region();
        spacer.setPrefHeight(10);
        HBox root3 = new HBox();
        root3.getChildren().addAll(profil, profil1);
        HBox root2 = new HBox(10);
        root2.getChildren().addAll(login, registrasi);
        VBox root1 = new VBox(20);
        root1.getChildren().addAll(user, sandi, spacer, root2);
        root3.relocate(165, 380);

        Pane root = new Pane();
        root.getChildren().addAll(welcome, root1, root3);
        root.getStyleClass().add("root");
        root1.relocate(120, 170);

        DbConnect.Connection();

        Scene scene = new Scene(root, 889, 500);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    private void handleLogin(String username, String password) {
        boolean hasil = DbConnect.validasiLogin(username, password);

        if (hasil) {
            // Dummy data for now. Replace with actual data from your data source.
            String name = "John Doe"; // Replace with actual name
            String age = "25"; // Replace with actual age
            String dob = "01-01-1999"; // Replace with actual date of birth
            String address = "123 Main St"; // Replace with actual address
            String program = "Computer Science"; // Replace with actual program

            Profil profilScene = new Profil(stage, name, age, dob, address, program);
            profilScene.show();
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Incorrect username or password");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
