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
				
				//UC3 : Show TTT Game Board
				private void showBoard(char[] boardInputs) {
					int i, j = 0;
					int boardPosition = 1;
					char[][] gameBoard = new char[3][3];
					System.out.println("TTT Game Board Displaying: ");
					for (i = 0; i < 3; i++) {
						
						for (j = 0; j < 3; j++) {
							gameBoard[i][j] = boardInputs[boardPosition];
							System.out.print(gameBoard[i][j]);
							if (j < 2)
								System.out.print(" | ");
							boardPosition++;
						}
						System.out.println();
						if (i < 2)
							System.out.println("____________");
					}
				}
			
				//UC 4 : Check for Empty Position
				private boolean moveToPosition(char[] boardInputs, int boardPosition) {
					boolean isEmpty = false;
					if (boardPosition >= 1 && boardPosition <= 9) {
						if (boardInputs[boardPosition] == ' ')
							isEmpty = true;
					} else
						System.out.println("Invalid position entered");
					return isEmpty;
				}

		public static void main(String[] args) throws Exception {
			TicTacToeGames gameObject = new TicTacToeGames();
			char[] newBoard = gameObject.createBoard();
			char[] inputs= gameObject.userInput();	
			gameObject.showBoard(newBoard);
			System.out.println("Select position from 1 to 9 : ");
			int boardPosition=sc.nextInt();
			boolean isEmptyPosition=gameObject.moveToPosition(newBoard,boardPosition);
			System.out.println("Position is Empty : "+isEmptyPosition);
		}

	}

