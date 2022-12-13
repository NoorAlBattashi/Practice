/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.util.Scanner;
public class PracticeFile {

	/**
	 * @param args : practice
	 */
	public static void main(String[] args) {
		//create array for the tictactoe positions
		String[][] ticTacToeArr = {{"1", "2", "3"}, {"4","5","6"}, {"7","8","9"}};

		//display the board
		System.out.println(ticTacToeArr[0][0] +"  |  "+ ticTacToeArr[0][1]+"  |  "+ticTacToeArr[0][2]);
		System.out.println("-------------");
		System.out.println(ticTacToeArr[1][0] +"  |  "+ ticTacToeArr[1][1]+"  |  "+ticTacToeArr[1][2]);
		System.out.println("-------------");
		System.out.println(ticTacToeArr[2][0] +"  |  "+ ticTacToeArr[2][1]+"  |  "+ticTacToeArr[2][2]);
		System.out.println();

		//players select there symbol
		System.out.println("Player 1 select Symbol: X or O");
		System.out.println("1- X");
		System.out.println("2- O");
		System.out.print("Here:");
		Scanner selectSymbolsc = new Scanner(System.in); 
		int selectSymbol = selectSymbolsc.nextInt();

		//define the player turn
		boolean PlayerOneTurn;
		int validTurnsCounter = 0;

		//if player 1 select X
		if (selectSymbol == 1) {
			//display the symbols
			System.out.println("Player 1 select Symbol: X");
			System.out.println("Player 2 select Symbol: O");

			//player one turn
			PlayerOneTurn = true;
			
			//LOOP TO CONTINUE THE GAME
			while(validTurnsCounter < 9) {
				 

				//display the board
				System.out.println();
				System.out.println(ticTacToeArr[0][0] +"  |  "+ ticTacToeArr[0][1]+"  |  "+ticTacToeArr[0][2]);
				System.out.println("-------------");
				System.out.println(ticTacToeArr[1][0] +"  |  "+ ticTacToeArr[1][1]+"  |  "+ticTacToeArr[1][2]);
				System.out.println("-------------");
				System.out.println(ticTacToeArr[2][0] +"  |  "+ ticTacToeArr[2][1]+"  |  "+ticTacToeArr[2][2]);
				System.out.println();
				if (PlayerOneTurn == true) {
					//player 1 select move
					System.out.print("Player 1, Make a move, Enter position: ");
					Scanner player1Movesc = new Scanner(System.in); 
					int player1Move = Integer.parseInt(player1Movesc.nextLine());
					// player1Movesc.close();

					//check the selection position of player1 and add value
					if (player1Move == 1 ) {
						if (ticTacToeArr[0][0] != "X" && ticTacToeArr[0][0] != "O") {
							//add value
							ticTacToeArr[0][0] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}				
					}
					else if (player1Move == 2 ) {
						if (ticTacToeArr[0][1] != "X" && ticTacToeArr[0][1] != "O") {
							//add value
							ticTacToeArr [0][1] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					else if (player1Move == 3 ) {
						if (ticTacToeArr [0][2] != "X" && ticTacToeArr [0][2] != "O") {
							ticTacToeArr [0][2] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}	
					}
					else if (player1Move == 4 ) {
						if (ticTacToeArr [1][0] != "X" && ticTacToeArr [1][0] != "O") {
							ticTacToeArr [1][0] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					else if (player1Move == 5 ) {
						if (ticTacToeArr [1][1] != "X" && ticTacToeArr [1][1] != "O") {
							ticTacToeArr [1][1] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					else if (player1Move == 6 ) {
						if (ticTacToeArr [1][2] != "X" && ticTacToeArr [1][2] != "O") {
							ticTacToeArr [1][2] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					else if (player1Move == 7 ) {
						if (ticTacToeArr [2][0] != "X" && ticTacToeArr [2][0] != "O") {
							ticTacToeArr [2][0] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					else if (player1Move == 8 ) {
						if (ticTacToeArr [2][1] != "X" && ticTacToeArr [2][1] != "O") {
							ticTacToeArr [2][1] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					else if (player1Move == 9 ) {
						if (ticTacToeArr [2][2] != "X" && ticTacToeArr [2][2] != "O") {
							ticTacToeArr [2][2] = "X";
							PlayerOneTurn = false;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = true;
						}
					}
					//if  player 1 select unknown selection
					else {
						System.out.println("Wrong selection");
						PlayerOneTurn = true;
					}
					//check winner
					if(ticTacToeArr [0][0] == "X" && ticTacToeArr [0][1] == "X" && ticTacToeArr [0][2] == "X" ||
							ticTacToeArr [1][0] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [1][2] == "X" ||
							ticTacToeArr [2][0] == "X" && ticTacToeArr [2][1] == "X" &&  ticTacToeArr [2][2] == "X" ||
							ticTacToeArr [0][0] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [2][2] == "X" ||
							ticTacToeArr [0][2] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [2][0] == "X" ||
							ticTacToeArr [0][0] == "X" && ticTacToeArr [1][0] == "X" && ticTacToeArr [2][0] == "X" ||
							ticTacToeArr [0][1] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [2][1] == "X" ||
							ticTacToeArr [0][2] == "X" && ticTacToeArr [1][2] == "X"  && ticTacToeArr [2][2] == "X") {

						//display the board
						System.out.println();
						System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
						System.out.println();
						//display win message
						System.out.println("Player 1, you win !");
						break;
					}
					//Draw
					else if(ticTacToeArr [0][0] != "1" && ticTacToeArr [0][1] != "2" && ticTacToeArr [0][2] != "3" &&
							ticTacToeArr [1][0] != "4" && ticTacToeArr [1][1] != "5" && ticTacToeArr [1][2] != "6" &&
							ticTacToeArr [2][0] != "7" && ticTacToeArr [2][1] != "8" &&  ticTacToeArr [2][2]!= "9") {

						//display the board
						System.out.println();
						System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
						System.out.println();
						//display win message
						System.out.println("Draw, No winner !");
						break;
						}

				if (PlayerOneTurn == false) {
					//player 2 turn
					System.out.print("Player 2, Make a move, Enter position: ");
					Scanner player2Movesc = new Scanner(System.in); 
					int player2Move = Integer.parseInt(player2Movesc.nextLine());
					// player2Movesc.close();

					//check the selection position of player2 and add value
					if (player2Move == 1) {
						if (ticTacToeArr [0][0] != "O" && ticTacToeArr [0][0] != "X") {
							ticTacToeArr [0][0] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else{
							System.out.println("The position already choosen");
						}				
					}
					else if (player2Move == 2 ) {
						if (ticTacToeArr [0][1] != "O" && ticTacToeArr [0][1] != "X") {
							ticTacToeArr [0][1] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
						}
					}
					else if (player2Move == 3 ) {
						if (ticTacToeArr [0][2] != "O" && ticTacToeArr [0][2] != "X") {
							ticTacToeArr [0][2] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}	
					}
					else if (player2Move == 4 ) {
						if (ticTacToeArr [1][0] != "O" && ticTacToeArr [1][0] != "X") {
							ticTacToeArr [1][0] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}
					}
					else if (player2Move == 5 ) {
						if (ticTacToeArr [1][1] != "O" && ticTacToeArr [1][1] != "X") {
							ticTacToeArr [1][1] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}
					}
					else if (player2Move == 6 ) {
						if (ticTacToeArr [1][2] != "O" && ticTacToeArr [1][2] != "X") {
							ticTacToeArr [1][2] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}
					}
					else if (player2Move == 7) {
						if (ticTacToeArr [2][0] != "O" && ticTacToeArr [2][0] != "X") {
							ticTacToeArr [2][0] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}
					}
					else if (player2Move == 8 ) {
						if (ticTacToeArr [2][1] != "O" && ticTacToeArr [2][1] != "X") {
							ticTacToeArr [2][1] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}
					}
					else if (player2Move == 9 ) {
						if (ticTacToeArr [2][2] != "O" && ticTacToeArr [2][2] != "X") {
							ticTacToeArr [2][2] = "O";
							PlayerOneTurn = true;
							validTurnsCounter++;
						}
						else {
							System.out.println("The position already choosen");
							PlayerOneTurn = false;
						}
					}
					//if  player 2 select unknown selection
					else {
						System.out.println("Wrong selection");
						PlayerOneTurn = false;
					}
					//check winner
					if(ticTacToeArr [0][0] == "O" && ticTacToeArr [0][1] == "O" && ticTacToeArr [0][2] == "O" ||
							ticTacToeArr [1][0] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [1][2] == "O" ||
							ticTacToeArr [2][0] == "O" && ticTacToeArr [2][1] == "O" &&  ticTacToeArr [2][2] == "O" ||
							ticTacToeArr [0][0] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [2][2] == "O" ||
							ticTacToeArr [0][2] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [2][0] == "O" ||
							ticTacToeArr [0][0] == "O" && ticTacToeArr [1][0] == "O" && ticTacToeArr [2][0] == "O" ||
							ticTacToeArr [0][1] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [2][1] == "O" ||
							ticTacToeArr [0][2] == "O" && ticTacToeArr [1][2] == "O"  && ticTacToeArr [2][2] == "O") {

						//display the board
						System.out.println();
						System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
						System.out.println();
						//display win message
						System.out.println("Player 2, you win !");
						break;
					}
					//Draw
					else if(ticTacToeArr [0][0] != "1" && ticTacToeArr [0][1] != "2" && ticTacToeArr [0][2] != "3" &&
							ticTacToeArr [1][0] != "4" && ticTacToeArr [1][1] != "5" && ticTacToeArr [1][2] != "6" &&
							ticTacToeArr [2][0] != "7" && ticTacToeArr [2][1] != "8" &&  ticTacToeArr [2][2] != "9") {

						//display the board
						System.out.println();
						System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
						System.out.println("-------------");
						System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
						System.out.println();
						//display win message
						System.out.println("Draw, No winner !");
						break;
						}
				}		
			}
		}
		}

		//if  player 1 select O
//		else if (selectSymbol == 2){
//			//display the symbols
//			System.out.println("Player 1 select Symbol: O");
//			System.out.println("Player 2 select Symbol: X");
//
//			//player one turn
//			PlayerOneTurn = true;
//
//			//LOOP TO CONTINUE THE GAME			
//			for(int a = 0 ; a < 10; a++) {
//
//				//display the board
//				System.out.println();
//				System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
//				System.out.println("-------------");
//				System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
//				System.out.println("-------------");
//				System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
//				System.out.println();
//
//				if (PlayerOneTurn == true) {
//					//player 1 select move
//					System.out.print("Player 1, Make a move, Enter position: ");
//					Scanner player1Movesc = new Scanner(System.in); 
//					int player1Move = player1Movesc.nextInt();
//
//					//check the selection position of player1 and add value
//					if (player1Move == 1 ) {
//						if (ticTacToeArr [0][0] != "O" && ticTacToeArr [0][0] != "X") {
//							ticTacToeArr [0][0] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}				
//					}
//					else if (player1Move == 2 ) {
//						if (ticTacToeArr [0][1] != "O" && ticTacToeArr [0][1] != "X") {
//							ticTacToeArr [0][1] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					else if (player1Move == 3 ) {
//						if (ticTacToeArr [0][2] != "O" && ticTacToeArr [0][2] != "X") {
//							ticTacToeArr [0][2] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}	
//					}
//					else if (player1Move == 4 ) {
//						if (ticTacToeArr [1][0] != "O" && ticTacToeArr [1][0] != "X") {
//							ticTacToeArr [1][0] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					else if (player1Move == 5 ) {
//						if (ticTacToeArr [1][1] != "O" && ticTacToeArr [1][1] != "X") {
//							ticTacToeArr [1][1] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					else if (player1Move == 6 ) {
//						if (ticTacToeArr [1][2] != "O" && ticTacToeArr [1][2] != "X") {
//							ticTacToeArr [1][2] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					else if (player1Move == 7) {
//						if (ticTacToeArr [2][0] != "O" && ticTacToeArr [2][0] != "X") {
//							ticTacToeArr [2][0] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					else if (player1Move == 8 ) {
//						if (ticTacToeArr [2][1] != "O" && ticTacToeArr [2][1] != "X") {
//							ticTacToeArr [2][1] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					else if (player1Move == 9 ) {
//						if (ticTacToeArr [2][2] != "O" && ticTacToeArr [2][2] != "X") {
//							ticTacToeArr [2][2] = "O";
//							PlayerOneTurn = false;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = true;
//						}
//					}
//					//if  player 1 select unknown selection
//					else {
//						System.out.println("Wrong selection");
//						PlayerOneTurn = true;
//					}
//
//					//check winner
//					if(ticTacToeArr [0][0] == "O" && ticTacToeArr [0][1] == "O" && ticTacToeArr [0][2] == "O" ||
//							ticTacToeArr [1][0] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [1][2] == "O" ||
//							ticTacToeArr [2][0] == "O" && ticTacToeArr [2][1] == "O" &&  ticTacToeArr [2][2] == "O" ||
//							ticTacToeArr [0][0] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [2][2] == "O" ||
//							ticTacToeArr [0][2] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [2][0] == "O" ||
//							ticTacToeArr [0][0] == "O" && ticTacToeArr [1][0] == "O" && ticTacToeArr [2][0] == "O" ||
//							ticTacToeArr [0][1] == "O" && ticTacToeArr [1][1] == "O" && ticTacToeArr [2][1] == "O" ||
//							ticTacToeArr [0][2] == "O" && ticTacToeArr [1][2] == "O"  && ticTacToeArr [2][2] == "O") {
//
//						//display the board
//						System.out.println();
//						System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
//						System.out.println("-------------");
//						System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
//						System.out.println("-------------");
//						System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
//						System.out.println();
//						//display win message
//						System.out.println("Player 1, you win !");
//						break;
//					}
//				}
//
//				if (PlayerOneTurn == false) {
//					//player 2 turn
//					System.out.print("Player 2, Make a move, Enter position: ");
//					Scanner player2Movesc = new Scanner(System.in); 
//					int player2Move = player2Movesc.nextInt();
//
//					//check the selection position of player2 and add value
//					if (player2Move == 1) {
//						if (ticTacToeArr [0][0] != "X" && ticTacToeArr [0][0] != "O") {
//							ticTacToeArr [0][0] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}				
//					}
//					else if (player2Move == 2) {
//						if (ticTacToeArr [0][1] != "X" && ticTacToeArr [0][1] != "O") {
//							ticTacToeArr [0][1] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}
//					}
//					else if (player2Move == 3) {
//						if (ticTacToeArr [0][2] != "X" && ticTacToeArr [0][2] != "O") {
//							ticTacToeArr [0][2] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}	
//					}
//					else if (player2Move == 4) {
//						if (ticTacToeArr [1][0] != "X" && ticTacToeArr [1][0] != "O") {
//							ticTacToeArr [1][0] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}
//					}
//					else if (player2Move == 5) {
//						if (ticTacToeArr [1][1] != "X" && ticTacToeArr [1][1] != "O") {
//							ticTacToeArr [1][1] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}
//					}
//					else if (player2Move == 6) {
//						if (ticTacToeArr [1][2] != "X" && ticTacToeArr [1][2] != "O") {
//							ticTacToeArr [1][2] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}
//					}
//					else if (player2Move == 7) {
//						if (ticTacToeArr [2][0] != "X" && ticTacToeArr [2][0] != "O") {
//							ticTacToeArr [2][0] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}
//					}
//					else if (player2Move == 8) {
//						if (ticTacToeArr [2][1] != "X" && ticTacToeArr [2][1] != "O") {
//							ticTacToeArr [2][1] = "X";
//							PlayerOneTurn = true;
//						}
//						else {
//							System.out.println("The position already choosen");
//							PlayerOneTurn = false;
//						}
//					}
//					else if (player2Move == 9) {
//						if (ticTacToeArr [2][2] != "X" && ticTacToeArr [2][2] != "O") {
//							ticTacToeArr [2][2] = "X";
//							PlayerOneTurn = true;
//						}
//						//if  player 2 select unknown selection
//						else {
//							System.out.println("Wrong selection");
//							PlayerOneTurn = false;
//						}
//
//
//						//check winner
//						if(ticTacToeArr [0][0] == "X" && ticTacToeArr [0][1] == "X" && ticTacToeArr [0][2] == "X" ||
//								ticTacToeArr [1][0] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [1][2] == "X" ||
//								ticTacToeArr [2][0] == "X" && ticTacToeArr [2][1] == "X" &&  ticTacToeArr [2][2] == "X" ||
//								ticTacToeArr [0][0] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [2][2] == "X" ||
//								ticTacToeArr [0][2] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [2][0] == "X" ||
//								ticTacToeArr [0][0] == "X" && ticTacToeArr [1][0] == "X" && ticTacToeArr [2][0] == "X" ||
//								ticTacToeArr [0][1] == "X" && ticTacToeArr [1][1] == "X" && ticTacToeArr [2][1] == "X" ||
//								ticTacToeArr [0][2] == "X" && ticTacToeArr [1][2] == "X"  && ticTacToeArr [2][2] == "X") {
//
//							//display the board
//							System.out.println();
//							System.out.println(ticTacToeArr [0][0] +"  |  "+ ticTacToeArr [0][1]+"  |  "+ticTacToeArr [0][2]);
//							System.out.println("-------------");
//							System.out.println(ticTacToeArr [1][0] +"  |  "+ ticTacToeArr [1][1]+"  |  "+ticTacToeArr [1][2]);
//							System.out.println("-------------");
//							System.out.println(ticTacToeArr [2][0] +"  |  "+ ticTacToeArr [2][1]+"  |  "+ticTacToeArr [2][2]);
//							System.out.println();
//							//display win message
//							System.out.println("Player 2, you win !");
//
//							break;
//						}
//					}
//				}
//			}
//		}
		//if  player 1 select unknown selection	
		else {
			System.out.println("Wrong selection try again!");
			PlayerOneTurn = true;
		}
		

	} //End
}
