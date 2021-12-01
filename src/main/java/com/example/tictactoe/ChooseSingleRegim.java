package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**\
 * Choose level game of single type
 */
public class ChooseSingleRegim {


    @FXML
    private Button BackButton3;

    @FXML
    private Button ChooseSingleRegimButton1;

    @FXML
    private Button ChooseSingleRegimButtonHard;

    @FXML
    private Button ChooseSingleRegimMedium;

    @FXML
    void initialize() {
    }

    /**
     * @param ev
     */
    @FXML
    private void ClickBackButton3(ActionEvent ev){
        BackButton3.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ChooseGame.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     *
     * @param ev
     */
    @FXML
    private void ChooseSingleRegimClickEasy(ActionEvent ev){
        ChooseSingleRegimButton1.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameField2.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * @param ev1
     */
    @FXML
    private void ChooseSingleRegimClickHard(ActionEvent ev1){
        ChooseSingleRegimButtonHard.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameFieldSingleHard.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }


    @FXML
    private void ChooseSingleRegimClickMedium(ActionEvent ev){
        ChooseSingleRegimMedium.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameFieldMedium.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
