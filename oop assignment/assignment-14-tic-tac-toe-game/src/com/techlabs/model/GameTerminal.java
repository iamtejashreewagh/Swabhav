package com.techlabs.model;

import java.awt.DisplayMode;
import java.util.Scanner;

public class GameTerminal {
	public static void game() {
		Game game = new Game();
		String player1, player2;
		char marker1, marker2 = '0';
		char choice;
		Scanner input = new Scanner(System.in);

		System.out.print("Player 1 enter your name : ");
		player1 = input.nextLine();
		System.out.print("Player 2 enter your name : ");
		player2 = input.nextLine();

		System.out.println(player1 + " Select your marker ('x' or 'o'): ");
		marker1 = input.nextLine().charAt(0);
		marker2 = game.assignMarkerToPlayer2(marker1);
		System.out.println(player2 + " your marker is : " + marker2);
		char[][] gameBoard = { { '1', ' ', '|', ' ', '2', ' ', '|', ' ', '3' },
				{ '-', '-', '+', '-', '-', '-', '+', '-', '-' }, { '4', ' ', '|', ' ', '5', ' ', '|', ' ', '6' },
				{ '-', '-', '+', '-', '-', '-', '+', '-', '-' }, { '7', ' ', '|', ' ', '8', ' ', '|', ' ', '9' } };
		game.displayGameBoard(gameBoard);
		for (int i = 0; i <= 3; i++) {
			System.out.println(player1 + " enter your choice : ");
			choice = input.nextLine().charAt(0);
			boolean replace1 = game.replace(gameBoard, choice, marker1);
			while(replace1==false) {
				System.out.println(player1 + " enter your choice : ");
				choice = input.nextLine().charAt(0);
			    replace1 = game.replace(gameBoard, choice, marker1);
			}
			game.displayGameBoard(gameBoard);
			boolean winStatus1 = game.checkForWinSituation(gameBoard);
			if (winStatus1 == true) {
				System.out.println(player1+" wins!");
				return;
			}

			System.out.println(player2 + " enter your choice : ");
			choice = input.nextLine().charAt(0);
			boolean replace2 = game.replace(gameBoard, choice, marker2);
			while(replace2==false) {
				System.out.println(player1 + " enter your choice : ");
				choice = input.nextLine().charAt(0);
			    replace2 = game.replace(gameBoard, choice, marker1);
			}
			game.displayGameBoard(gameBoard);

			boolean winStatus2 = game.checkForWinSituation(gameBoard);
			if (winStatus2 == true) {
				System.out.println(player2+" wins!");
				return;
			}
		}
		System.out.println(player2 + " enter your choice : ");
		choice = input.nextLine().charAt(0);
		game.replace(gameBoard, choice, marker2);
		game.displayGameBoard(gameBoard);
		System.out.println("There is a tie!");

	}
}
