/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava0.pkg5;

import java.util.Scanner;

/**
 *
 * @author 348676487
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Initialize the scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Enter round one per line");

        int playerOneWins = 0;
        int playerTwoWins = 0;
        int drawCount = 0;
        String winner = "";

        boolean newGame = true;
        while (newGame == true) {
            while (true) {
                int result = winnerResult();

                if (result == -1) {
                    return;
                }

                if (result == 0) {
                    drawCount++;
                }

                if (result == 1) {
                    playerOneWins++;
                    if (playerOneWins == 2) {
                        winner = "PLAYER ONE";
                        break;
                    }
                }

                if (result == 2) {
                    playerTwoWins++;
                    if (playerTwoWins == 2) {
                        winner = "PLAYER TWO";
                        break;
                    }
                }
            }
            System.out.println(winner + " " + drawCount);
            playerOneWins = 0;
            playerTwoWins = 0;
            drawCount = 0;
        }

    }

    public static int winnerResult() {

        //Initialize the scanner
        Scanner s = new Scanner(System.in);

        String game = s.next();

        if (game.equals("Q")) {
            return -1;
        }

        game = game.toUpperCase();

        int result = 3;

        char playerOne = game.charAt(0);
        char playerTwo = game.charAt(1);

        if (playerOne == 'P' && playerTwo == 'R' || playerOne == 'S' && playerTwo == 'P' || playerOne == 'R' && playerTwo == 'S') {
            result = 1;
        } else if (playerOne == 'R' && playerTwo == 'P' || playerOne == 'P' && playerTwo == 'S' || playerOne == 'S' && playerTwo == 'R') {
            result = 2;
        } else if (playerOne == 'R' && playerTwo == 'R' || playerOne == 'P' && playerTwo == 'P' || playerOne == 'S' && playerTwo == 'S') {
            result = 0;
        }
        return result;
    }
}
