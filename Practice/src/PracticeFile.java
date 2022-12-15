
/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.util.Scanner;

public class PracticeFile {

	private static void printBoard(String[][] board) {
		System.out.println();
		System.out.println(board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
		System.out.println("-------------");
		System.out.println(board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
		System.out.println("-------------");
		System.out.println(board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
		System.out.println();
	}

	private static boolean checkWinner(String[][] board, String symbol) {
		boolean playerWon = false;
		if (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol
				|| board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol
				|| board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol
				|| board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol
				|| board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol
				|| board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol
				|| board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol
				|| board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) {

			// display the board
			printBoard(board);

			// display win message
			System.out.println(symbol + ", You win !");
			playerWon = true;
		}
		return playerWon;
	}

	private static boolean checkDraw(String[][] board) {
		boolean Draw = false;
		if (board[0][0] != "1" && board[0][1] != "2" && board[0][2] != "3" && board[1][0] != "4" && board[1][1] != "5"
				&& board[1][2] != "6" && board[2][0] != "7" && board[2][1] != "8" && board[2][2] != "9") {

			// display the board
			printBoard(board);

			// display draw message
			System.out.println("Draw, No winner !");
			Draw = true;
		}
		return Draw;

	}

	/**
	 * @param args : practice TicTacToe Game
	 */
	public static void main(String[] args) {
		// create array for the TicTacToe positions
		String[][] ticTacToeArr = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		// display the board
		printBoard(ticTacToeArr);

		// players select there symbol
		System.out.println("Player 1 select Symbol: X or O");
		System.out.println("1- X");
		System.out.println("2- O");
		System.out.print("Here:");
		Scanner selectSymbolsc = new Scanner(System.in);
		int selectSymbol = selectSymbolsc.nextInt();

		// define the player turn
		boolean PlayerOneTurn;
		int validTurnsCounter = 0;

		// if player 1 select X
		if (selectSymbol == 1) {
			// display the symbols
			System.out.println("Player 1 select Symbol: X");
			System.out.println("Player 2 select Symbol: O");

			// player one turn
			PlayerOneTurn = true;

			boolean isThereAWinner = false;
			boolean isDraw = false;

			// LOOP TO CONTINUE THE GAME
			while (validTurnsCounter < 9 && isThereAWinner == false && isDraw == false) {

				// display the board
				printBoard(ticTacToeArr);

				if (PlayerOneTurn == true && isThereAWinner == false && isDraw == false) {
					// player 1 select move
					System.out.print("Player 1, Make a move, Enter position: ");
					Scanner player1Movesc = new Scanner(System.in);
					int player1Move = Integer.parseInt(player1Movesc.nextLine());
					// player1Movesc.close();
					String player1Symbol = "X";
					String player2Symbol = "O";

					// check the selection position of player1 and add value
					if (player1Move == 1) {
						if (ticTacToeArr[0][0] != "X" && ticTacToeArr[0][0] != "O") {
							// add value
							ticTacToeArr[0][0] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 2) {
						if (ticTacToeArr[0][1] != "X" && ticTacToeArr[0][1] != "O") {
							// add value
							ticTacToeArr[0][1] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 3) {
						if (ticTacToeArr[0][2] != "X" && ticTacToeArr[0][2] != "O") {
							ticTacToeArr[0][2] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 4) {
						if (ticTacToeArr[1][0] != "X" && ticTacToeArr[1][0] != "O") {
							ticTacToeArr[1][0] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 5) {
						if (ticTacToeArr[1][1] != "X" && ticTacToeArr[1][1] != "O") {
							ticTacToeArr[1][1] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 6) {
						if (ticTacToeArr[1][2] != "X" && ticTacToeArr[1][2] != "O") {
							ticTacToeArr[1][2] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 7) {
						if (ticTacToeArr[2][0] != "X" && ticTacToeArr[2][0] != "O") {
							ticTacToeArr[2][0] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 8) {
						if (ticTacToeArr[2][1] != "X" && ticTacToeArr[2][1] != "O") {
							ticTacToeArr[2][1] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 9) {
						if (ticTacToeArr[2][2] != "X" && ticTacToeArr[2][2] != "O") {
							ticTacToeArr[2][2] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}

					}

					// if player 1 select unknown selection
					else {
						System.out.println("Wrong selection");
						PlayerOneTurn = true;
					}
					// check winner
					if (isThereAWinner == false) {
						isThereAWinner = checkWinner(ticTacToeArr, player1Symbol);
						// checkWinner(ticTacToeArr, player1Symbol);
					}
					// check Draw
					if (isThereAWinner == false) {
						isDraw = checkDraw(ticTacToeArr);
						// checkDraw(ticTacToeArr);
					}

					if (PlayerOneTurn == false && isThereAWinner == false && isDraw == false) {
						// player 2 turn
						System.out.print("Player 2, Make a move, Enter position: ");
						Scanner player2Movesc = new Scanner(System.in);
						int player2Move = Integer.parseInt(player2Movesc.nextLine());
						// player2Movesc.close();

						// check the selection position of player2 and add value
						if (player2Move == 1) {
							if (ticTacToeArr[0][0] != "O" && ticTacToeArr[0][0] != "X") {
								ticTacToeArr[0][0] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
							}
						} else if (player2Move == 2) {
							if (ticTacToeArr[0][1] != "O" && ticTacToeArr[0][1] != "X") {
								ticTacToeArr[0][1] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
							}
						} else if (player2Move == 3) {
							if (ticTacToeArr[0][2] != "O" && ticTacToeArr[0][2] != "X") {
								ticTacToeArr[0][2] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 4) {
							if (ticTacToeArr[1][0] != "O" && ticTacToeArr[1][0] != "X") {
								ticTacToeArr[1][0] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 5) {
							if (ticTacToeArr[1][1] != "O" && ticTacToeArr[1][1] != "X") {
								ticTacToeArr[1][1] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 6) {
							if (ticTacToeArr[1][2] != "O" && ticTacToeArr[1][2] != "X") {
								ticTacToeArr[1][2] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 7) {
							if (ticTacToeArr[2][0] != "O" && ticTacToeArr[2][0] != "X") {
								ticTacToeArr[2][0] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 8) {
							if (ticTacToeArr[2][1] != "O" && ticTacToeArr[2][1] != "X") {
								ticTacToeArr[2][1] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 9) {
							if (ticTacToeArr[2][2] != "O" && ticTacToeArr[2][2] != "X") {
								ticTacToeArr[2][2] = "O";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						}
						// if player 2 select unknown selection
						else {
							System.out.println("Wrong selection");
							PlayerOneTurn = false;
						}

						// check winner
						if (isThereAWinner == false) {
							isThereAWinner = checkWinner(ticTacToeArr, player2Symbol);
							checkWinner(ticTacToeArr, player2Symbol);
						}
					}
				}
			}
		}

		// if player 1 select O
		else if (selectSymbol == 2) {
			// display the symbols
			System.out.println("Player 1 select Symbol: O");
			System.out.println("Player 2 select Symbol: X");

			// player one turn
			PlayerOneTurn = true;
			boolean isThereAWinner = false;
			boolean isDraw = false;

			// LOOP TO CONTINUE THE GAME
			while (validTurnsCounter < 9 && isThereAWinner == false && isDraw == false) {

				// display the board
				printBoard(ticTacToeArr);

				if (PlayerOneTurn == true && isThereAWinner == false && isDraw == false) {
					// player 1 select move
					System.out.print("Player 1, Make a move, Enter position: ");
					Scanner player1Movesc = new Scanner(System.in);
					int player1Move = Integer.parseInt(player1Movesc.nextLine());
					// player1Movesc.close();
					String player1Symbol = "O";
					String player2Symbol = "X";

					// check the selection position of player1 and add value
					if (player1Move == 1) {
						if (ticTacToeArr[0][0] != "X" && ticTacToeArr[0][0] != "O") {
							// add value
							ticTacToeArr[0][0] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 2) {
						if (ticTacToeArr[0][1] != "X" && ticTacToeArr[0][1] != "O") {
							// add value
							ticTacToeArr[0][1] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 3) {
						if (ticTacToeArr[0][2] != "X" && ticTacToeArr[0][2] != "O") {
							ticTacToeArr[0][2] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 4) {
						if (ticTacToeArr[1][0] != "X" && ticTacToeArr[1][0] != "O") {
							ticTacToeArr[1][0] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 5) {
						if (ticTacToeArr[1][1] != "X" && ticTacToeArr[1][1] != "O") {
							ticTacToeArr[1][1] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 6) {
						if (ticTacToeArr[1][2] != "X" && ticTacToeArr[1][2] != "O") {
							ticTacToeArr[1][2] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 7) {
						if (ticTacToeArr[2][0] != "X" && ticTacToeArr[2][0] != "O") {
							ticTacToeArr[2][0] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 8) {
						if (ticTacToeArr[2][1] != "X" && ticTacToeArr[2][1] != "O") {
							ticTacToeArr[2][1] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					} else if (player1Move == 9) {
						if (ticTacToeArr[2][2] != "X" && ticTacToeArr[2][2] != "O") {
							ticTacToeArr[2][2] = "O";
							PlayerOneTurn = false;
							validTurnsCounter++;
						} else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					// if player 1 select unknown selection
					else {
						System.out.println("Wrong selection");
						PlayerOneTurn = true;
					}
					// check winner
					if (isThereAWinner == false) {
						isThereAWinner = checkWinner(ticTacToeArr, player1Symbol);
						checkWinner(ticTacToeArr, player1Symbol);
					}
					// check Draw
					if (isThereAWinner == false) {
						isDraw = checkDraw(ticTacToeArr);
						checkDraw(ticTacToeArr);
					}

					if (PlayerOneTurn == false && isThereAWinner == false && isDraw == false) {
						// player 2 turn
						System.out.print("Player 2, Make a move, Enter position: ");
						Scanner player2Movesc = new Scanner(System.in);
						int player2Move = Integer.parseInt(player2Movesc.nextLine());
						// player2Movesc.close();

						// check the selection position of player2 and add value
						if (player2Move == 1) {
							if (ticTacToeArr[0][0] != "O" && ticTacToeArr[0][0] != "X") {
								ticTacToeArr[0][0] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
							}
						} else if (player2Move == 2) {
							if (ticTacToeArr[0][1] != "O" && ticTacToeArr[0][1] != "X") {
								ticTacToeArr[0][1] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
							}
						} else if (player2Move == 3) {
							if (ticTacToeArr[0][2] != "O" && ticTacToeArr[0][2] != "X") {
								ticTacToeArr[0][2] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 4) {
							if (ticTacToeArr[1][0] != "O" && ticTacToeArr[1][0] != "X") {
								ticTacToeArr[1][0] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 5) {
							if (ticTacToeArr[1][1] != "O" && ticTacToeArr[1][1] != "X") {
								ticTacToeArr[1][1] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 6) {
							if (ticTacToeArr[1][2] != "O" && ticTacToeArr[1][2] != "X") {
								ticTacToeArr[1][2] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 7) {
							if (ticTacToeArr[2][0] != "O" && ticTacToeArr[2][0] != "X") {
								ticTacToeArr[2][0] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 8) {
							if (ticTacToeArr[2][1] != "O" && ticTacToeArr[2][1] != "X") {
								ticTacToeArr[2][1] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						} else if (player2Move == 9) {
							if (ticTacToeArr[2][2] != "O" && ticTacToeArr[2][2] != "X") {
								ticTacToeArr[2][2] = "X";
								PlayerOneTurn = true;
								validTurnsCounter++;
							} else {
								System.out.println("The position already choosen");
								PlayerOneTurn = false;
							}
						}
						// if player 2 select unknown selection
						else {
							System.out.println("Wrong selection");
							PlayerOneTurn = false;
						}
						// check winner
						if (isThereAWinner == false) {
							isThereAWinner = checkWinner(ticTacToeArr, player2Symbol);
							checkWinner(ticTacToeArr, player2Symbol);
						}
					}
				}
			}
		}

		// if player 1 select unknown selection
		else {
			System.out.println("Wrong selection try again!");
			PlayerOneTurn = true;
		}

	} // End
}
