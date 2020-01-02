/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 *
 * @author Owner
 */
public class FXMLDocumentController implements Initializable {
    private String[] board = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};
    private boolean gameStillGoing = true;
    private String winner = "None";
    private String currentPlayer = "X";
    private int selection;
    private int cycle = 0;
    
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
    private Button gameStarter;
    
    @FXML
    private TextArea text;
    
    @FXML
    private void handleButtonAction0(ActionEvent event) {
        selection = 0;
        button0.setText(currentPlayer);
        button0.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        selection = 1;
        button1.setText(currentPlayer);
        button1.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        selection = 2;
        button2.setText(currentPlayer);
        button2.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        selection = 3;
        button3.setText(currentPlayer);
        button3.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction4(ActionEvent event) {
        selection = 4;
        button4.setText(currentPlayer);
        button4.setDisable(true);
    }
    @FXML
    private void handleButtonAction5(ActionEvent event) {
        selection = 5;
        button5.setText(currentPlayer);
        button5.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction6(ActionEvent event) {
        selection = 6;
        button6.setText(currentPlayer);
        button6.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction7(ActionEvent event) {
        selection = 7;
        button7.setText(currentPlayer);
        button7.setDisable(true);
    }
    
    @FXML
    private void handleButtonAction8(ActionEvent event) {
        selection = 8;
        button8.setText(currentPlayer);
        button8.setDisable(true);
    }
    
    @FXML
    private void handleButtonActionGameStarter(ActionEvent event) throws InterruptedException {
        reset();
        //text.appendText(currentPlayer + "'s turn\n");
        text.appendText("Choose a position from 1-9: \n");
        cycle++;
        displayBoard();
        gameStarted();
    }
    
    public void reset(){
        System.out.println("reset started");
        for(int i = 0; i < 9; i++){
            board[i] = "-";
        }
        gameStillGoing = true;
        winner = "None";
        button0.setText("-");
        button1.setText("-");
        button2.setText("-");
        button3.setText("-");
        button4.setText("-");
        button5.setText("-");
        button6.setText("-");
        button7.setText("-");
        button8.setText("-");
        
        button0.setDisable(false);
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);
        button6.setDisable(false);
        button7.setDisable(false);
        button8.setDisable(false);
        
        currentPlayer = "X";
        cycle = 0;
        text.clear();
        System.out.println("reset finished");
    }
    
    public void gameStarted(){
        button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    playGame();
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    /*public void introMessage(){
        text.appendText("Welcome to the Tic Tac Toe game.\n");
    }*/
    
    //Displays the board for the game
    public void displayBoard(){
        text.appendText(" | " + board[0] + " | " + board[1] + " | " + board[2] + " | \n");
        text.appendText(" | " + board[3] + " | " + board[4] + " | " + board[5] + " | \n");
        text.appendText(" | " + board[6] + " | " + board[7] + " | " + board[8] + " | \n");
        text.appendText("\n");
        text.appendText("\n");
    }
    
    //Starts and runs the game of Tic Tac Toe
   public void playGame() throws InterruptedException{
      
      if(gameStillGoing){
         handleTurn(currentPlayer);
         checkForGameOver();
         flipPlayer();
      }
      if(gameStillGoing == false){
        if(winner.equals("X") || winner.equals("O")){
           text.appendText(winner + " has won!!!\n");
        }else if(winner.equals("None")){
           text.appendText("The game is a Tie :(\n");
        }
      }
   }
   
   //Handles a single turn of an arbitrary player
   public void handleTurn(String player) throws InterruptedException{
      if(cycle == 1){
        text.appendText(currentPlayer + "'s turn\n");
      }
      
      if(cycle > 1){
        text.appendText(currentPlayer + "'s turn\n");
        text.appendText("Choose a position from 1-9: \n");
        cycle++;
      }
      cycle++;
      
      text.appendText("Choice: " + selection + "\n");
      board[selection] = player;
      displayBoard();
   }
   
   //Checks if the game has ended
   public void checkForGameOver(){
      checkForWinner();
      checkForTie();
   }
   
   //Checks for a winner of the game
   public void checkForWinner(){
      String rowWinner = checkRows();
      String columnWinner = checkColumns();
      String diagonalWinner = checkDiagonals();
      if(!rowWinner.equals("None")){
         winner = rowWinner;
      }else if(!columnWinner.equals("None")){
         winner = columnWinner;
      }else if(!diagonalWinner.equals("None")){
         winner = diagonalWinner;
      }
   }
   
   //Checks every row for a winner match
   public String checkRows(){
     boolean row1 = board[0].equals(board[1]) && board[1].equals(board[2]) && !board[0].equals("-");
     boolean row2 = board[3].equals(board[4]) && board[4].equals(board[5]) && !board[3].equals("-");
     boolean row3 = board[6].equals(board[7]) && board[7].equals(board[8]) && !board[6].equals("-");
     
     if(row1 || row2 || row3){
      gameStillGoing = false;
     }
     
     if(row1){
      return board[0];
     }else if(row2){
      return board[3];
     }else if(row3){
      return board[6];
     }
     
     return "None";
   }
   
   //Checks every column for a winner match
   public String checkColumns(){
      boolean column1 = board[0].equals(board[3]) && board[3].equals(board[6]) && !board[0].equals("-");
      boolean column2 = board[1].equals(board[4]) && board[4].equals(board[7]) && !board[1].equals("-");
      boolean column3 = board[2].equals(board[5]) && board[5].equals(board[8]) && !board[2].equals("-");
      
      if(column1 || column2 || column3){
       gameStillGoing = false;
      }
      
      if(column1){
       return board[0];
      }else if(column2){
       return board[1];
      }else if(column3){
       return board[2];
      }
      return "None";
   }
   
   //Checks both diagonal for a winner match
   public String checkDiagonals(){
      boolean diagonal1 = board[0].equals(board[4]) && board[4].equals(board[8]) && !board[0].equals("-");
      boolean diagonal2 = board[2].equals(board[4]) && board[4].equals(board[6]) && !board[2].equals("-");
      
      if(diagonal1 || diagonal2){
       gameStillGoing = false;
      }
      
      if(diagonal1){
       return board[0];
      }else if(diagonal2){
       return board[2];
      }
      
      return "None";
   }
   
   //Checks if the game has reached a tie with no winner
   public void checkForTie(){
      if(!Arrays.asList(board).contains("-") && gameStillGoing == true){
         gameStillGoing = false;
      }
   }
   
   //Transitions the current player from one player to the other
   public void flipPlayer(){
      if(currentPlayer.equals("X")){
         currentPlayer = "O";
      }else if(currentPlayer.equals("O")){
         currentPlayer = "X";
      }
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
