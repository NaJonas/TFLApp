package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.UrlConnectionReader;

public class HomeController {

    private UrlConnectionReader reader;

    @FXML
    private Label status;

    @FXML
    public void initialize() throws Exception {
        status.setText(reader.read());

    }



}
