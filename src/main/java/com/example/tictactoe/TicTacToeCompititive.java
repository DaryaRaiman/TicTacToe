package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
* Game process of compititive game
*/
public class TicTacToeCompititive implements Initializable {



@FXML
private Button button0;

@FXML
private Button button1;

@FXML
private Button button2;

@FXML
private Button button3;

@FXML
private Button button4;

@FXML
private Button button5;

@FXML
private Button button6;

@FXML
private Button button7;

@FXML
private Button button8;

@FXML
private Text winnerText;

@FXML
private Button BackButton2;


private int playerTurn = 0;

ArrayList<Button> buttons;

int winner = 0;

/**
*
* @param url
* @param resourceBundle
*/
@Override
public void initialize(URL url, ResourceBundle resourceBundle) {
buttons = new ArrayList<>(Arrays.asList(button0, button1, button2,button3,button4,button5,button6,button7,button8));

buttons.forEach(button ->{
setupButton(button);
button.setFocusTraversable(false);
});

}

/**
*
* @param button
*/
private void setupButton(Button button) {
button.setOnMouseClicked(mouseEvent -> {
setPlayerSymbol(button);
button.setDisable(true);
checkIfGameIsOver();
});
}

/**
*
* @param button
*/
public void setPlayerSymbol(Button button){
if(playerTurn % 2 == 0){
button.setText("X");
playerTurn++;
} else{
button.setText("O");
playerTurn++;
}

}

/**
*
* @param event
*/
@FXML
void restartGame(ActionEvent event) {
buttons.forEach(this::resetButton);
winnerText.setText("Tic-Tac-Toe");
playerTurn = 0;
winner = 0;
}

/**
*
* @param button
*/
public void resetButton(Button button){
button.setDisable(false);
button.setText("");
}
