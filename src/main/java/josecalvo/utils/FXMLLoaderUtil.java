package josecalvo.utils;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import josecalvo.gamehub.App;

public class FXMLLoaderUtil {

  // Method to load the FXML file
  public static Parent loadFXML(String fxml) throws IOException {
      URL fxmlLocation = App.class.getResource("/fxml/" + fxml + ".fxml");
      if (fxmlLocation == null) {
          throw new IOException("Cannot find FXML file: " + fxml);
      }
      FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
      return fxmlLoader.load();
  }
}
