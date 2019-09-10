package com.novi.minigames;

import java.util.Scanner;


public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        boolean debug = false;
        
        
        //Invoer van de spelers
        System.out.println("Welcome to Jasper zijn MiniGames");
        System.out.print("Enter name player one: ");
        String PlayerOne = input.nextLine();
        System.out.print("Enter name player two: ");
        String PlayerTwo = input.nextLine();
        System.out.println("Hello "+ PlayerOne + " and " + PlayerTwo + (", get ready to choose your battleground!\n\n\n"));
        
       
        //menu om een spel te kiezen
        System.out.println("Games:");
        System.out.println("1] Tic-Tac-Toe.");
        System.out.println("2] Four-In-A-Row.\n");
        System.out.print("Which game do you like to play? [1 or 2]: ");
        int GameChoice = input.nextInt();
        if (GameChoice == 1) {
            System.out.println("Let's play Tic-Tac-Toe!");
        } else {
            System.out.println("This option isn't available yet");
        }
        
        //Start van het spel
        System.out.println("\n\n--Tic-Tac-Toe--");
        
        //opmaak en printen van het bord
        System.out.println("---");
        char [] Grid = new char [9];
        for(int i = 0; i<9; i++) {
            Grid[i] = (char) ('1' + i); 
        }
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(Grid[j + i *3]);
            }
            System.out.println("");
        }
          String CurrentPlayer = PlayerOne;
          
          for (int i=0; i<9; i++){ 
              if (CurrentPlayer == PlayerOne){
        //Keuze speler 1
            System.out.println("Current player is: " + PlayerOne);
            System.out.println("What's your move? ");
            int Play = input.nextInt();
            System.out.println("");

            
            //opmaak en printen van bord met invoer van speler 1
            System.out.println("---");
            Grid [Play -1] = 'X';
            
            for(int k = 0; k < 3; k++){ 
            for(int j = 0; j < 3; j++) 
                System.out.print(Grid[j + k *3]);
            
            System.out.println("");
            CurrentPlayer = PlayerTwo;
            }
            }else {
                    
        
           
            //invoer keuze van speler 2    
            System.out.println("Current player is: " + PlayerTwo);
            System.out.println("What's your move? ");
            int Play2 = input.nextInt();
            System.out.println("");
            
          
            
            //printen van bord met keuze speler 1 en 2
            System.out.println("---");
            Grid [Play2 -1] = 'O';

            for(int k = 0; k < 3; k++){ 
            for(int j = 0; j < 3; j++) 
                System.out.print(Grid[j + k *3]);
            
            System.out.println("");
            CurrentPlayer = PlayerOne;
            }
            }
        }
    }
}



        
        //Get name of player 1  DONE
        //Get name of player 2  DONE
        
        //Print Menu            DONE
        //Get chosen game

            //Start chosen game DONE
            
                //Print board [Array van 9 plekken. doormiddel van For Lus 3 maal 3 rijen printen.  DONE
                //Use:  Dots and/or numbers for fields DONE
                //      X's and O's for player pawns DONE
                
                //Print current player DONE
                
                //Get chosen field DONE
                //Change field to current player pawn (X or O) DONE
                
                //If game is won
                    //Print board
                    //Winner gets a point
                    //Print scores
                    //Go back to menu
                
                //If game is not won
                    //Switch players
                    //Start next turn