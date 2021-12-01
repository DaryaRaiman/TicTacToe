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

/**
* Checking the completion of the game
*/
public void checkIfGameIsOver(){
for (int a = 0; a < 8; a++) {
String line;
switch (a) {
case 0:
line = button0.getText() + button1.getText() + button2.getText();
break;
case 1:
line = button3.getText() + button4.getText() + button5.getText();
break;
case 2:
line = button6.getText() + button7.getText() + button8.getText();
break;
case 3:
line = button0.getText() + button4.getText() + button8.getText();
break;
case 4:
line = button2.getText() + button4.getText() + button6.getText();
break;
case 5:
line = button0.getText() + button3.getText() + button6.getText();
break;
case 6:
line = button1.getText() + button4.getText() + button7.getText();
break;
case 7:
line = button2.getText() + button5.getText() + button8.getText();
break;
default:
line = null;
break;
}

//X winner
if (line.equals("XXX")) {
winnerText.setText("X won!");
buttons.forEach(button ->{
setupButton(button);
button.setDisable(true);
});
winner = 1;
}

//O winner
if (line.equals("OOO")) {
winnerText.setText("O won!");
buttons.forEach(button ->{
setupButton(button);
button.setDisable(true);
});
winner = 1;

}

if(playerTurn == 9 && winner == 0){
winnerText.setText("TIE!");
}

}
}

/**
*
* @param ev
*/
@FXML
private void ClickBackButton2(ActionEvent ev){
BackButton2.getScene().getWindow().hide();
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


}
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
import java.util.Random;

/**
* Game process of easy game
*/
public class TicTacToeSingleEasy {

@FXML
private Button BackButton4;

@FXML
private Button button20;

@FXML
private Button button21;

@FXML
private Button button22;

@FXML
private Button button23;

@FXML
private Button button24;

@FXML
private Button button25;

@FXML
private Button button26;

@FXML
private Button button27;

@FXML
private Button button28;

@FXML
private Text winnerText2;

@FXML
private Text restartGameButton2;

int x;

ArrayList<Button> buttons2;

int playerTurn = 0;

int winner2 = 0;

Random random = new Random(System.currentTimeMillis());

int[] ListButtons = new int[] {0,0,0,0,0,0,0,0,0};

/**
* initialization
*/
public void initialize() {
buttons2 = new ArrayList<>(Arrays.asList(button20, button21, button22,button23,button24,button25,button26,button27,button28));

}

/**
*
* @param ev1
*/
@FXML
public void ClickButton20(ActionEvent ev1){
button20.setText("X");
playerTurn++;
button20.setDisable(true);
ListButtons[0] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}


/**
*
* @param ev1
*/
@FXML
public void ClickButton21(ActionEvent ev1){
button21.setText("X");
playerTurn++;
button21.setDisable(true);
ListButtons[1] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
*
* @param ev1
*/
@FXML
public void ClickButton22(ActionEvent ev1){
button22.setText("X");
playerTurn++;
button22.setDisable(true);
ListButtons[2] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
*
* @param ev1
*/
@FXML
public void ClickButton23(ActionEvent ev1){
button23.setText("X");
playerTurn++;
button23.setDisable(true);
ListButtons[3] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
*
* @param ev1
*/
@FXML
public void ClickButton24(ActionEvent ev1){
button24.setText("X");
playerTurn++;
button24.setDisable(true);
ListButtons[4] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
*
* @param ev1
*/
@FXML
public void ClickButton25(ActionEvent ev1){
button25.setText("X");
playerTurn++;
button25.setDisable(true);
ListButtons[5] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}


/**
*
* @param ev1
*/
@FXML
public void ClickButton26(ActionEvent ev1){
button26.setText("X");
playerTurn++;
button26.setDisable(true);
ListButtons[6] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
*
* @param ev1
*/
@FXML
public void ClickButton27(ActionEvent ev1){
button27.setText("X");
playerTurn++;
button27.setDisable(true);
ListButtons[7] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
*
* @param ev1
*/
@FXML
public void ClickButton28(ActionEvent ev1){
button28.setText("X");
playerTurn++;
button28.setDisable(true);
ListButtons[8] = 1;
if(playerTurn == 5){
checkIfGameIsOver();
}
if(playerTurn < 5) {
SetComputerSymbol();
}
}

/**
* Cumputer set symbol in button
*/
public void SetComputerSymbol(){

while(ListButtons[x] == 1){
x = (int)
(Math.random() * 9);
}
if(x==0){
button20.setText("O");
button20.setDisable(true);
ListButtons[0] = 1;
checkIfGameIsOver();
}
if(x==1){
button21.setText("O");
button21.setDisable(true);
ListButtons[1] = 1;
checkIfGameIsOver();
}
if(x==2){
button22.setText("O");
button22.setDisable(true);
ListButtons[2] = 1;
checkIfGameIsOver();
}
if(x==3){
button23.setText("O");
button23.setDisable(true);
ListButtons[3] = 1;
checkIfGameIsOver();
}
if(x==4){
button24.setText("O");
button24.setDisable(true);
ListButtons[4] = 1;
checkIfGameIsOver();
}
if(x==5){
button25.setText("O");
button25.setDisable(true);
ListButtons[5] = 1;
checkIfGameIsOver();
}
if(x==6){
button26.setText("O");
button26.setDisable(true);
ListButtons[6] = 1;
checkIfGameIsOver();
}
if(x==7){
button27.setText("O");
button27.setDisable(true);
ListButtons[7] = 1;
checkIfGameIsOver();
}
if(x==8){
button28.setText("O");
button28.setDisable(true);
ListButtons[8] = 1;
checkIfGameIsOver();
}
}

/**
*
* @param event
*/
@FXML
void restartGame2(ActionEvent event) {
winnerText2.setText("Tic-Tac-Toe");
playerTurn = 0;
winner2 = 0;
resetButton();
}

/**
* Reset button
*/
public void resetButton(){

buttons2.forEach(button ->{
button.setDisable(false);
button.setText("");
});

for(int i = 0; i < 9; i++){
ListButtons[i] = 0;
}
}

/**
* Checking the completion of the game
*/
public void checkIfGameIsOver(){
for (int a = 0; a < 8; a++) {
String line;
switch (a) {
case 0:
line = button20.getText() + button21.getText() + button22.getText();
break;
case 1:
line = button23.getText() + button24.getText() + button25.getText();
break;
case 2:
line = button26.getText() + button27.getText() + button28.getText();
break;
case 3:
line = button20.getText() + button24.getText() + button28.getText();
break;
case 4:
line = button22.getText() + button24.getText() + button26.getText();
break;
case 5:
line = button20.getText() + button23.getText() + button26.getText();
break;
case 6:
line = button21.getText() + button24.getText() + button27.getText();
break;
case 7:
line = button22.getText() + button25.getText() + button28.getText();
break;
default:
line = null;
break;
}

//X winner
if (line.equals("XXX")) {
winnerText2.setText("X won!");
buttons2.forEach(button ->{
button.setDisable(true);
});
winner2 = 1;
}

//O winner
if (line.equals("OOO")) {
winnerText2.setText("O won!");
buttons2.forEach(button ->{
button.setDisable(true);
});
winner2 = 1;
}

if(playerTurn == 5 && winner2 == 0){
winnerText2.setText("DRAW!");
buttons2.forEach(button ->{
button.setDisable(true);
});
}

}
}

/**
* back button
* @param ev
*/
@FXML
private void ClickBackButton4(ActionEvent ev){
BackButton4.getScene().getWindow().hide();
FXMLLoader loader = new FXMLLoader();
loader.setLocation(getClass().getResource("ChooseSinglRegim.fxml"));
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
