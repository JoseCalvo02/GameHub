module josecalvo.gamehub {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens josecalvo.gamehub to javafx.fxml;
    opens josecalvo.controllers to javafx.fxml;

    exports josecalvo.controllers;
    exports josecalvo.gamehub;
}
