package tugaspraktikum9;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InputData {
    private Stage stage;
    private boolean[] firstInteractions = {true, true, true, true, true};

    public InputData(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Label profil = new Label("Input Your");
        Label profil1 = new Label(" Profil");
        TextField nama = createTextField("Your Name", 0);
        TextField umur = createTextField("Your Age", 1);
        TextField tglLahir = createTextField("Your Date", 2);
        TextField alamat = createTextField("Your Address", 3);
        TextField prodi = createTextField("Your Study Program", 4);
        Button next = new Button("Next >");

        profil.getStyleClass().add("ayo1");
        profil1.getStyleClass().add("ayo1");
        profil1.setStyle("-fx-font-weight: BOLD");
        next.getStyleClass().add("form-hover");

        VBox root1 = new VBox(20);
        root1.getChildren().addAll(nama, umur, tglLahir, alamat, prodi);
        HBox root3 = new HBox();
        root3.getChildren().addAll(profil, profil1);

        next.setOnAction(event -> {
            Regis regis = new Regis(stage);
            regis.show();
        });

        Pane root = new Pane();
        root.getChildren().addAll(root3, root1, next);
        root.getStyleClass().add("root");
        root1.relocate(80, 100);
        root3.relocate(110, 50);
        next.relocate(180, 420);

        Scene scene = new Scene(root, 400, 500);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    private TextField createTextField(String promptText, int interactionIndex) {
        TextField textField = new TextField(promptText);
        textField.getStyleClass().add("field");
        textField.setPrefWidth(250);
        textField.setOnKeyPressed(event -> clearTextOnFirstInteraction(textField, interactionIndex));
        return textField;
    }

    private void clearTextOnFirstInteraction(TextField textField, int interactionIndex) {
        if (firstInteractions[interactionIndex]) {
            textField.setText("");
            firstInteractions[interactionIndex] = false;
        }
    }
}
