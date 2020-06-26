package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Board;
import com.techlabs.model.Cell;
import com.techlabs.model.Game;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyzer;

public class GameTest {
	public static void main(String args[]) {
		String playerName;
		int position;
		Board board = new Board();
		
		ResultAnalyzer resultAnalyzer= new ResultAnalyzer(board);
		Scanner sc = new Scanner(System.in); 
		Player[] players = new Player[2];
		System.out.println("Enter player1 name");
		playerName = sc.nextLine();
		players[0]= new Player(playerName,Mark.X);
		
		System.out.println("Enter player2 name");
		playerName = sc.nextLine();
		players[1]= new Player(playerName, Mark.O);
		
		Game game = new Game(players, board, resultAnalyzer);
		while(game.getStatus().equals("In Progress")) {
			System.out.println(game.getCurrentPlayer().getName()+" select your position");
			position = sc.nextInt();
			if(position<9 && position>=0) {
				game.play(position);
			}
			else {
				System.out.println("Select a position between 0-8");
			}
			displayBoard(board);
		}
		if(game.getStatus().equals("Draw")) {
			System.out.println("its a draw!!!!");
		}
		else {
			System.out.println("Winner is "+game.getNextPlayer().getName() );
		}
	}
	public static void displayBoard(Board board) {
		Cell[] cells = board.getBoard();
		for(int count=0;count<9;count++) {
			System.out.print(cells[count].getMark()+" ");
			if((count+1)%3==0) {
				System.out.print("\n");
			}
		}
	}

}
