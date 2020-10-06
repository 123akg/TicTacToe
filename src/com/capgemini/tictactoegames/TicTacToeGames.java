package com.capgemini.tictactoegames;

import java.util.*;

public class TicTacToeGames {

		public static final Scanner sc = new Scanner(System.in);
		public static char[] gameBoard;

	//UC1 :	Create TTT Game Board
		private static char[] createBoard() {
			char[] board = new char[10];
			Arrays.fill(board, ' ');
			return board;
		}

		public static void main(String[] args) throws Exception {
			TicTacToeGames gameObject = new TicTacToeGames();
			char[] newBoard = gameObject.createBoard();
			
		}

	}

