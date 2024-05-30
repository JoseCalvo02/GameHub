package josecalvo.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import josecalvo.gamehub.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("home");
    }
}