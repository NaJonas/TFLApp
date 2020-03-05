package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.UrlConnectionReader;

public class HomeController {


    private UrlConnectionReader reader;

    @FXML
    private Label status;
    @FXML
    public Label header;

    @FXML
    public void initialize() throws Exception {
        status.setText(reader.read("circle"));
        header.setText("Circle line status");
    }
    @FXML
    public void onClickPiccadilly() throws Exception {
        status.setText(reader.read("piccadilly"));
        header.setText("Piccadilly line status");

    }
    @FXML
    public void onClickDistrict() throws Exception {
        status.setText(reader.read("district"));
        header.setText("District line status");

    }
    @FXML
    public void onClickBakerloo() throws Exception {
        status.setText(reader.read("bakerloo"));
        header.setText("Bakerloo line status");


    }
    @FXML
    public void onClickCentral() throws Exception {
        status.setText(reader.read("central"));
        header.setText("Central line status");

    }
    @FXML
    public void onClickHammersmith() throws Exception {
        status.setText(reader.read("hammersmith-city"));
        header.setText("Hammersmith & C line status");

    }
    @FXML
    public void onClickCircle() throws Exception {
        initialize();
    }

}
