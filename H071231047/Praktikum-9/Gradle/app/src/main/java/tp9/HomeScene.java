package tp9;

import javafx.animation.TranslateTransition;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void showWithTransition() {
        show();
        TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.5), stage.getScene().getRoot());
        slideIn.setFromX(800);
        slideIn.setToX(0);
        slideIn.play();
    }

    public void show() {
        VBox layout = new VBox(20);
        layout.setId("layout");
        
        Text title = new Text("APP JAVA SEDERHANA");
        title.setId("title");

        Text subtitle = new Text("HomeScene & Profilescene");
        subtitle.setId("subtitle");
        subtitle.setTextAlignment(TextAlignment.CENTER);

        Text line = new Text("_________________________________________________________");
        line.setId("line");

        Button btnToProfile = new Button("GO TO PROFILE");
        btnToProfile.setId("profileButton");

        btnToProfile.setOnAction(v -> {
            ProfileScene profileScene = new ProfileScene(stage);
            profileScene.showWithTransition();
        });

        layout.getChildren().addAll(title, subtitle, line, btnToProfile);
        Scene scene = new Scene(layout, 1000, 500);
        Image icon = new Image("/images/icon1.jpeg");
        stage.getIcons().add(icon);
        scene.getStylesheets().add("/styles/home.css");
        stage.setScene(scene);
        stage.show();
    }
}
