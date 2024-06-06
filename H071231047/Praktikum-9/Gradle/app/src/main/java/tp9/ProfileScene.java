package tp9;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.Scene;

public class ProfileScene {
    private Stage stage;

    ProfileScene(Stage stage) {
        this.stage = stage;
    }

    public void showWithTransition() {
        show();
        stage.getScene().getRoot().setTranslateX(800);
        TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.5), stage.getScene().getRoot());
        slideIn.setFromX(800);
        slideIn.setToX(0);
        slideIn.play();
    }

    private void setCircularImage(ImageView imageView, double radius) {
        Circle clip = new Circle(radius, radius, radius);
        imageView.setClip(clip);
    }

    public void show() {
        HBox layout = new HBox(50);
        layout.setId("layout");
        layout.setAlignment(Pos.CENTER);

        VBox person1 = new VBox(10);
        person1.setAlignment(Pos.CENTER);
        ImageView profilePhoto1 = new ImageView(new Image("/images/icon2.jpeg"));
        profilePhoto1.setFitWidth(150);
        profilePhoto1.setFitHeight(150);
        setCircularImage(profilePhoto1, 75);
        profilePhoto1.setId("fotoProfil");

        Text userName1 = new Text("PhantomGz");
        userName1.setId("namaProfil");
        Text description1 = new Text("Fullname\t: Arelio Junara Palinoan\nAge\t\t: 18\nWA\t\t: +62 813-4494-6001\nIG\t\t: @phantom.xf");
        description1.setId("tentangProfil");
        person1.getChildren().addAll(profilePhoto1, userName1, description1);

        Button btnToHome = new Button("BACK TO HOME");
        btnToHome.setId("homeButton");

        // Event Handling
        btnToHome.setOnAction(v -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.showWithTransition();
        });

        VBox btnContainer = new VBox(btnToHome);
        btnContainer.setAlignment(Pos.CENTER);
        btnContainer.setId("buttonContainer");

        VBox combinedLayout = new VBox(layout, btnContainer);
        combinedLayout.setAlignment(Pos.CENTER);
        combinedLayout.setId("combinedLayout");

        layout.getChildren().addAll(person1);
        Scene scene = new Scene(combinedLayout, 1000, 500);
        scene.getStylesheets().add("/styles/profile.css");
        stage.setScene(scene);
        stage.show();
    }
}
