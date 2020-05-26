package com.techlabs.model;

public class Game {
	private String status;

	public void displayGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public boolean replace(char[][] gameBoard, char find, char replace) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (gameBoard[i][j] == find) {
					gameBoard[i][j] = replace;
					return true;
				}
			}
		}
		System.out.println("Invalid input");
		return false;
	}

	public boolean checkForWinSituation(char[][] gameBoard) {
		return (checkForRows(gameBoard) || checkForColumns(gameBoard) || checkForDiagonals(gameBoard));
	}

	public boolean checkForRows(char[][] gameBoard) {
		for (int i = 0; i < 9 && i % 2 == 0; i++) {
			if (check((gameBoard[i][0]), (gameBoard[i][4]), (gameBoard[i][8])) == true)
				return true;
		}
		return false;

	}

	public boolean checkForColumns(char[][] gameBoard) {
		for (int i = 0; i < 9 && i % 2 == 0; i++) {
			if (check((gameBoard[0][i]), (gameBoard[2][i]), (gameBoard[4][i])) == true)
				return true;
		}
		return false;
	}

	public boolean checkForDiagonals(char[][] gameBoard) {
			if (check((gameBoard[0][8]), (gameBoard[2][4]), (gameBoard[4][0]))
					|| check((gameBoard[0][0]), (gameBoard[2][4]), (gameBoard[4][8])) == true) {
				return true;
			}
			return false;
	}
	
	

	public char assignMarkerToPlayer2(char marker1) {
		char marker2;
		if (marker1 == 'o' || marker1 == 'O' || marker1 == '0') {
			marker2 = 'X';
		} else
			marker2 = 'O';
		return marker2;

	}

	public boolean check(char c1, char c2, char c3) {
		return ((c1 == c2) && (c2 == c3));
	}
	
	public boolean checkRows(char[][] gameBoard) {
		for (int i = 0; i < 9 && i % 2 == 0; i++) {
			if (check((gameBoard[i][0]), (gameBoard[i][4]), (gameBoard[i][8])) == true)
				return true;
		}
		return false;

	}

}
