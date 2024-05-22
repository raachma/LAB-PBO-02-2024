package praktikum9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        // HomeScene components
        Label homeLabel = new Label("Welcome to Home Scene");
        homeLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px;");
        Button goToProfileButton = new Button("Go to Profile");
        goToProfileButton.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-color: black;");
        VBox homeLayout = new VBox(20, homeLabel, goToProfileButton);
        homeLayout.setAlignment(Pos.CENTER);
        homeLayout.setStyle("-fx-background-color: white;");
        Scene homeScene = new Scene(homeLayout, 500, 500);

        // ProfileScene components
        Label profileLabel = new Label("User Profile");
        profileLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px;");
        Label userNameLabel = new Label("Username: Muhammad Rifky Kurniawan");
        Label userRiwayat = new Label("Sudiang, Biring kanaya");
        userRiwayat.setStyle("-fx-font-weight: bold; -fx-font-sixe: 16px;");
        userNameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        ImageView profileImageView = new ImageView(new Image(App.class.getResource("/praktikum9/gambarprofile.jpg").toString()));
        profileImageView.setFitHeight(400);
        profileImageView.setFitWidth(250);
        profileImageView.setStyle("-fx-background-color: #fe0500;");
        Button backButton = new Button("Back to Home");
        VBox profileLayout = new VBox(20, profileLabel, userNameLabel, userRiwayat,profileImageView, backButton);
        profileLayout.setAlignment(Pos.CENTER);
        profileLayout.setStyle("-fx-background-color: #fe0500;"); // Ubah warna latar belakang menjadi merah
        Scene profileScene = new Scene(profileLayout, 500, 500);

        // Event handling for switching scenes
        goToProfileButton.setOnAction(e -> primaryStage.setScene(profileScene));
        backButton.setOnAction(e -> primaryStage.setScene(homeScene));

        // Setting the initial scene
        primaryStage.setScene(homeScene);
        primaryStage.setTitle("Aplikasi JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
