package ment.introduction;

import java.util.Scanner;

public class ChoHan_Game {
    public static void main(String[] args) {
        final int Max_ROUND = 5;    //Number of rounds
        String player1Name;         //First Player's name
        String player2Name;         //Second Player's name

        //Create a scanner object for input
        Scanner input = new Scanner(System.in);

        // Get the players' names
        System.out.println("Enter the first player's name: ");
        player1Name = input.nextLine();
        System.out.println("Enter the second player's name: ");
        player2Name = input.nextLine();

        // Create a dealer
        Dealer dealer = new Dealer();

        // Create the two players
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
    }
}
