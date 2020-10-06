package com.capgemini.tictactoegames;

import java.util.*;

public class TicTacToeGames {

		public static final Scanner sc = new Scanner(System.in);
		public static char[] gameBoard;
        public static char[] inputs;

	//UC1 :	Create TTT Game Board
		private static char[] createBoard() {
			char[] board = new char[10];
			Arrays.fill(board, ' ');
			return board;
		}
		
		//UC2 : Input From User
				private static char[] userInput() {
					Scanner sc =new Scanner(System.in);
					System.out.println("Choose X or O :");
					char choice=sc.next().charAt(0);
					char userValue=' ';
					char systemValue=' ';
					switch(choice) {
						case 'X':
							userValue=choice;
							systemValue='O';
							break;
						case 'O':
							userValue=choice;
							systemValue='X';
							break;
						default:
							System.out.println("Invalid input chosen");
					}
					char[] inputs= {userValue,systemValue};
					return inputs;
			            
				}
			

		public static void main(String[] args) throws Exception {
			TicTacToeGames gameObject = new TicTacToeGames();
			char[] newBoard = gameObject.createBoard();
			char[] inputs= gameObject.userInput();	
		}

	}

