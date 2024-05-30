package josecalvo.gamehub;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import josecalvo.utils.FXMLLoaderUtil;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(FXMLLoaderUtil.loadFXML("home"), 640, 480);
        stage.setScene(scene);
        stage.setTitle("GameHub");
        stage.show();
    }

    // Method to change the scene
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(FXMLLoaderUtil.loadFXML(fxml));
    }

    public static void main(String[] args) {
        launch();
    }

}