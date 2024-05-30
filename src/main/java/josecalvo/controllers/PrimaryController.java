package josecalvo.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import josecalvo.gamehub.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("auth/secondary");
    }
}
