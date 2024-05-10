package me.universal.exemplos;

import java.util.Scanner;

import me.universal.matematica.matrizesAPI.MatrizClass;

/**
 * Classe para exemplo da matriz.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @Dependencias({"MatrizClass"})
 */
public class MatrizExemplo {

	/**
	 * Função para mostrar com funciona os comandos da matriz
	 */
	public static void main(String[] args) {
		MatrizClass matriz = new MatrizClass(3, 3);

		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o tipo de exemplo que você quer:\n1 - Padrão\n2 - Modificação para matriz menor");
		int resp = s.nextInt();
		
		switch (resp) {
		case 1: {
			exemploPadrao(matriz);
			
			break;
		}
		
		case 2: {
			exemploModificacaoMenor(matriz);
			
			break;
		}
		}
		
		s.close();
	}
	
	/**
	 * Função para mostrar exemplo de modificação para uma matriz menor
	 * 
	 * @param matriz Envia a matriz para gerar os exemplos padrões
	 */
	private static void exemploModificacaoMenor(MatrizClass matriz) {
		matriz.printMatriz();
		matriz.setLinhas(2);
		matriz.setColunas(1);
		matriz.atualizarMatriz();
		matriz.printMatriz();
	}

	/**
	 * Função para mostrar exemplos padrões
	 * 
	 * @param matriz Envia a matriz para gerar os exemplos padrões
	 */
	private static void exemploPadrao(MatrizClass matriz) {
		// Atualizar uma matriz e ver o resultado
		matriz.printMatriz();
		matriz.setColunas(5);
		matriz.setLinhas(5);
		matriz.atualizarMatriz();
		matriz.printMatriz();

		// Definir um elemento na matriz e ver o resultado
		matriz.definirElementoMatriz(1, 2, 3.5);
		matriz.printMatriz();
	}

}
