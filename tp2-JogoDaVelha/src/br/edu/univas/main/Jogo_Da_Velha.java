package br.edu.univas.main;

import java.util.Scanner;

public class Jogo_Da_Velha {
	
	static Scanner scanner = new Scanner(System.in);
	
	static String[][] tabuleiroMatriz = {{"1A", "1B", "1C"},{"2A", "2B", "2C"},{"3A", "3B", "3C"}};
	
	static String player1;
	static String player2;
	
	static String jogada;
	static int contadorJogadas = 0;
	
	static String simbolo_X = " X";
	static String simbolo_O = " O";
	
	public static void main(String[] args) {
		
		solicitaNomeJogadores();
		
		jogoDaVelha();
		
		scanner.close();
	}
	
	public static boolean winner(String[][] tabuleiro) {
		
		boolean vencedor = false;
		
		// VERIFICA HORIZONTAL		
		for(int i = 0; i < 3; i++) {
			if(tabuleiroMatriz [i][0] == tabuleiroMatriz [i][1] && tabuleiroMatriz [i][0] == tabuleiroMatriz [i][2]) {
				if(tabuleiroMatriz [i][0].equals(simbolo_X)) {	
				System.out.println(player1 + " é o vencedor!");
				}
				else if(tabuleiroMatriz [i][0].equals(simbolo_O)) {
					System.out.println(player2 + " é o vencedor!");
				}
				vencedor = true;
				return true;
			}
		}
		
		//VERIFICA VERTICAL
		for(int j = 0; j < 3; j++) {
			if(tabuleiroMatriz [0][j] == tabuleiroMatriz [1][j] && tabuleiroMatriz [0][j] == tabuleiroMatriz [2][j]) {
				if(tabuleiroMatriz [0][j].equals(simbolo_X)) {	
					System.out.println(player1 + " é o vencedor!");
					}
					else if(tabuleiroMatriz [0][j].equals(simbolo_O)) {
						System.out.println(player2 + " é o vencedor!");
					}
					vencedor = true;
					return true;
				}
		}
		
		//VERIFICA DIAGONAL
		if(tabuleiroMatriz [0][0] == tabuleiroMatriz [1][1] && tabuleiroMatriz [0][0] == tabuleiroMatriz [2][2]) {
			if(tabuleiroMatriz [0][0].equals(simbolo_X)) {	
				System.out.println(player1 + " é o vencedor!");
				}
				else if(tabuleiroMatriz [0][0].equals(simbolo_O)) {
					System.out.println(player2 + " é o vencedor!");
				}
				vencedor = true;
				return true;
		}
		if(tabuleiroMatriz [0][2] == tabuleiroMatriz [1][1] && tabuleiroMatriz [0][2] == tabuleiroMatriz [2][0]) {
			if(tabuleiroMatriz [0][2].equals(simbolo_X)) {	
				System.out.println(player1 + " é o vencedor!");
				}
				else if(tabuleiroMatriz [0][2].equals(simbolo_O)) {
					System.out.println(player2 + " é o vencedor!");
				}
				vencedor = true;
				return true;
			}
		if (contadorJogadas == 9 && vencedor == false) {
			System.out.println("O JOGO DEU VELHA!");
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public static void jogadaPlayer1(String jogada) {
		
		contadorJogadas++;
		
		
		
		for(int i = 0; i < tabuleiroMatriz.length; i++) {
			for(int j = 0; j < tabuleiroMatriz.length; j++) {
				if(tabuleiroMatriz[i][j].equals(jogada)) {
					tabuleiroMatriz[i][j] = simbolo_X;
				}
			}
		}
	}

	public static void jogadaPlayer2(String jogada) {
		
		contadorJogadas++;
		
		
		
		for(int i = 0; i < tabuleiroMatriz.length; i++) {
			for(int j = 0; j < tabuleiroMatriz.length; j++) {
				if(tabuleiroMatriz[i][j].equals(jogada)) {
					tabuleiroMatriz[i][j] = simbolo_O;
				}
			}
		}
	}
	
	public static void imprimeTabuleiro(String[][] tabuleiro) {
		System.out.println();
		System.out.println("ANDAMENTO DO JOGO...");
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.print("" + tabuleiroMatriz[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}
	
	public static void solicitaNomeJogadores() {
		System.out.println("JOGADOR 1 INSIRA SEU NOME:");
		player1 = scanner.nextLine();
		
		System.out.println("JOGADOR 2 INSIRA SEU NOME:");
		player2 = scanner.nextLine();
	}
	public static void solicitaJogadaP1() {
		
		System.out.println("É A SUA VEZ, " + player1);
		System.out.println("Digite um número e a letra correspondente a casa do JOGO DA VELHA:");
		System.out.println("Por exemplo: 3B");
		
		jogada = scanner.nextLine();
	}
	public static void solicitaJogadaP2() {
		
		System.out.println("É A SUA VEZ, " + player2);
		System.out.println("Digite um número e a letra correspondente a casa do JOGO DA VELHA:");
		System.out.println("Por exemplo: 3B");

		jogada = scanner.nextLine();
	}
	public static void jogoDaVelha() {
		while(winner(tabuleiroMatriz) == false) {
			
			solicitaJogadaP1();
			jogadaPlayer1(jogada);
			
			imprimeTabuleiro(tabuleiroMatriz);
			
			if(contadorJogadas > 2) {
				if (winner(tabuleiroMatriz) == true) {
					break;
				}
			}
			
			solicitaJogadaP2();
			jogadaPlayer2(jogada);
			
			imprimeTabuleiro(tabuleiroMatriz);		
		}
	}

}
