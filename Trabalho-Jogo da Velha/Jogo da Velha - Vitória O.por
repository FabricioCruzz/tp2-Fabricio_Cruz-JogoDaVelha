programa
{
	inclua biblioteca Util --> u
	
	cadeia tabuleiroJogoDaVelha[][] = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}

	caracter jogada
	
	funcao inicio(){
		
		//VITÓRIA DO O
		efetuarJogada(1, 0, "O", tabuleiroJogoDaVelha)
		efetuarJogada(0, 0, "X", tabuleiroJogoDaVelha)
		efetuarJogada(1, 1, "O", tabuleiroJogoDaVelha)
		efetuarJogada(0, 2, "X", tabuleiroJogoDaVelha)
		efetuarJogada(1, 2, "O", tabuleiroJogoDaVelha)

		
	}
	funcao efetuarJogada(inteiro linha, inteiro coluna, cadeia simbolo, cadeia tabuleiro[][]){
	
	// caracter simbolo representa o 'X' ou 'O' referente ao jogador
	
		tabuleiro[linha][coluna] = simbolo
	
		imprimeTabuleiro(tabuleiro)
		verificaVencedor(tabuleiroJogoDaVelha)
		
		
	}
	funcao verificaVencedor(cadeia tabuleiro[][]){
		
		logico vencedor = falso
		
		//VERIFICA HORIZONTAL
		para(inteiro i = 0; i < 3; i++){
			se((tabuleiro[i][0] == tabuleiro[i][1]) e (tabuleiro[i][0] == tabuleiro[i][2])){
				se(tabuleiro[i][0] == "X"){
					escreva("O jogador 'X' venceu")
				}
				senao se(tabuleiro[i][0] == "O"){
					escreva("O jogador 'O' venceu")
				}
				vencedor = verdadeiro
			}
		}

		//VERIFICA VERTICAL
		para(inteiro j = 0; j < 3; j++){
			se((tabuleiro[0][j] == tabuleiro[1][j]) e (tabuleiro[0][j] == tabuleiro[2][j])){
				se(tabuleiro[0][j] == "X"){
					escreva("O jogador 'X' venceu! \n")
				}
				senao se(tabuleiro[0][j] == "O"){
					escreva("O jogador 'O' venceu! \n")
				}
				vencedor = verdadeiro
			}
		}

		//VERIFICA DIAGONAL
		se((tabuleiro[0][0] == tabuleiro[1][1]) e (tabuleiro[0][0] == tabuleiro[2][2])){
			se(tabuleiro[0][0] == "X"){
				escreva("O jogador 'X' é venceu! \n")
			}
			senao se(tabuleiro[0][0] == "O"){
				escreva("O jogador 'O' venceu! \n") 
			}
			vencedor = verdadeiro
		}
		se((tabuleiro[0][2] == tabuleiro[1][1]) e (tabuleiro[0][2] == tabuleiro[2][0])){
			se(tabuleiro[0][2] == "X"){
				escreva("O jogador 'X' venceu! \n")
			}
			senao se(tabuleiro[0][2] == "O"){
				escreva("O jogador 'O' venceu! \n")
			}
			vencedor = verdadeiro
		}
		// EMPATE
		senao se (vencedor == falso){
			escreva("O JOGO DEU VELHA! \n")
		}
	}
	
	funcao imprimeTabuleiro(cadeia tabuleiro[][]){
		limpa()

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("", tabuleiro[linha][coluna], "|")
			}
			escreva("\n")
		}
	
		Util.aguarde(1500)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */