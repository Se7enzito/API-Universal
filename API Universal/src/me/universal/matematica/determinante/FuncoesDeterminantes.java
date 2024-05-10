package me.universal.matematica.determinante;

import me.universal.matematica.matrizesAPI.MatrizClass;

/**
 * Esta classe possui as funções de uma determinante. É preciso da "MatrizClass"
 * para utilizar esta classe.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1 @Dependencias({"MatrizClass"})
 */

public class FuncoesDeterminantes {

	// Cálculo determinantes 2x2 e 3x3
	public void calculo2por2(MatrizClass matriz) {
		int linhas = matriz.getLinhas();
		int colunas = matriz.getColunas();

		if (linhas == 2 && colunas == 2) {
			// Pegar DP (Comum)
			// Pegar DS (Comum)
		} else {
			System.out.println("Essa matriz não pode usar o sistema de cálculo 2x2.");
			System.out.println("Para utilizar a matriz precisa ter: 2 linhas e 2 colunas");
		}
	}

	public void calculo3por3(MatrizClass matriz) {
		int linhas = matriz.getLinhas();
		int colunas = matriz.getColunas();

		if (linhas == 3 && colunas == 3) {
			// Pegar DP (3 DP's -> Regra para matriz 3x3)
			// Pegar DS (3 DS's -> Regra para matriz 3x3)
		} else {
			System.out.println("Essa matriz não pode usar o sistema de cálculo 3x3.");
			System.out.println("Para utilizar a matriz precisa ter: 3 linhas e 3 colunas");
		}
	}

	// Regras determinante
	// Regra 1 -
	// Regra 2 -
	// Regra 3 -
	// Regra 4 -
	// Regra 5 -
	// Regra 6 -
	// Regra 7 -
}
