package tugaspraktikum9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
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

public class Regis {
    private Stage stage;
    private boolean firstInteraction = true;
    private boolean firstInteraction1 = true;

    public Regis(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Label welcome = new Label("Registrasi");
        Label profil = new Label("Input Your");
        Label profil1 = new Label(" Username");
        TextField user = new TextField("Username");
        PasswordField sandi = new PasswordField();
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
                sandi.setStyle("-fx-text-font: 10px");
                sandi.setText("");
                firstInteraction1 = false;
            }
        });

        moveAndSizeLabel(welcome, 145, 80);
        welcome.getStyleClass().add("heading");
        user.getStyleClass().add("field");
        sandi.getStyleClass().add("field");
        registrasi.getStyleClass().add("form-hover");
        registrasi.setPrefSize(80, 25);
        profil.getStyleClass().add("ayo");
        profil1.getStyleClass().add("ayo");
        profil1.setStyle("-fx-font-weight: BOLD");

        registrasi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = user.getText();
                String password = sandi.getText();
                boolean hasil = DbConnect.validasiLogin(username, password);
                if (hasil) {
                    HomeScene homeScene = new HomeScene(stage);
                    homeScene.show();
                }
            }
        });

        Region spacer = new Region();
        spacer.setPrefHeight(10);
        HBox root3 = new HBox();
        root3.getChildren().addAll(profil, profil1);
        VBox root1 = new VBox(20);
        root1.getChildren().addAll(user, sandi, spacer);

        Pane root = new Pane();
        root.getChildren().addAll(welcome, root1, root3, registrasi);
        root.getStyleClass().add("root");
        registrasi.relocate(165, 340);
        root3.relocate(146, 380);
        root1.relocate(120, 180);

        DbConnect.Connection();

        Scene scene = new Scene(root, 400, 500);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    private static void moveAndSizeLabel(Label label, double x, double y) {
        label.setLayoutX(x);
        label.setLayoutY(y);
    }
}
