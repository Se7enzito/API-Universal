package me.universal.matematica.matrizesAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Classe de uma matriz.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1 @FuncsDocumentation({"Getters and Setters", "Função para
 *          visualizar a matriz", "Função para definir um elemento na matriz"})
 */
public class MatrizClass {

	// Elementos de uma matriz.
	private int linhas;
	private int colunas;
	private List<List<Double>> elementos;

	/**
	 * Função inicializadora da classe
	 * 
	 * @param linhas  Quantidade de linhas da matriz.
	 * @param colunas Quantida de colunas da matriz.
	 */
	public MatrizClass(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.elementos = new ArrayList<>();

		for (int i = 0; i < linhas; i++) {
			List<Double> linha = new ArrayList<>();
			for (int j = 0; j < colunas; j++) {
				linha.add(0.0);
			}
			elementos.add(linha);
		}
	}

	/**
	 * Define os elementos da matriz.
	 * 
	 * @param elementos Os elementos que serão atribuídos à matriz.
	 */
	public void setElementos(List<List<Double>> elementos) {
		this.elementos = elementos;
	}

	/**
	 * Nova quantidade de linhas que a matriz vai ter.
	 * 
	 * @param linhas Nova quantida de linhas da matriz.
	 */
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	/**
	 * Nova quantida de colunas que a matriz vai ter.
	 * 
	 * @param colunas
	 */
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	/**
	 * Obtém os elementos da matriz.
	 * 
	 * @return Retorna os elementos da matriz.
	 */
	public List<List<Double>> getElementos() {
		return elementos;
	}

	/**
	 * Obtém a quantida de linhas da matriz.
	 * 
	 * @return Retorna as linhas da matriz.
	 */
	public int getLinhas() {
		return linhas;
	}

	/**
	 * Obtém a quantidade de colunas da matriz.
	 * 
	 * @return Retorna as colunas da matriz.
	 */
	public int getColunas() {
		return colunas;
	}

	/**
	 * Imprime os elementos da matriz.
	 */
	public void printMatriz() {
		for (List<Double> linha : elementos) {
			for (Double elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Gerado pelo próprio Eclipse
	 */
	@Override
	public int hashCode() {
		return Objects.hash(colunas, elementos, linhas);
	}
	
	/**
	 * Gerado pelo próprio Eclipse
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatrizClass other = (MatrizClass) obj;
		return colunas == other.colunas && Objects.equals(elementos, other.elementos) && linhas == other.linhas;
	}

	/**
	 * Atualiza a matriz para a quantida de linhas e colunas que estão definidas,
	 * caso mudem nas configurações.
	 */
	public void atualizarMatriz() {
		int linhasDef = elementos.size();

		// Confere as linhas
		if (linhasDef == linhas) {
			System.out.println("O número de linhas está correto.");
		} else if (linhasDef < linhas) {
			// Caso definido menor
			// Arruma a quantida de linhas (Caso esteja faltando)
			int linhasFaltantes = linhas - linhasDef;

			for (int i = 0; i < linhasFaltantes; i++) {
				List<Double> linha = new ArrayList<>();
				linha.add(0.0);

				elementos.add(linha);
			}

			System.out.println("O número de linhas agora está correto.");
		} else {
			// Caso definido maior
			int linhasExtras = linhasDef - linhas;

			List<List<Double>> linha = elementos;
			for (int i = 0; i < linhasExtras; i++) {
				linha.remove(elementos.size() - 1);
			}

			elementos = linha;

			System.out.println("O número de linhas agora está correto.");
		}

		// Confere as colunas
		int x = 1;
		for (List<Double> elemento : elementos) {
			int colunasDef = elemento.size();

			if (colunasDef == colunas) {
				System.out.println("A linha" + x + " está correta.");
			} else if (colunasDef < colunas) {
				// Caso definido menor
				int colunasFaltantes = colunas - colunasDef; // Pega o número de colunas que faltam ser adicionadas

				// Arruma a quantidade de colunas na linha (Caso esteja faltando)
				// System.out.println("A linha " + x + " precisa de mais " + colunasFaltantes + " colunas.");

				for (int i = 0; i < colunasFaltantes; i++) {
					elemento.add(0.0);
				}

				elementos.set(x - 1, elemento);
				System.out.println("A linha foi arrumada.");
			} else {
				// Caso definido maior
				int colunasExtra = colunasDef - colunas; // Pega o número de colunas que estão sobrando
				
				for (int i = 0; i < colunasExtra; i++) {
					elemento.remove(elemento.size() - 1);
				}
				
				elementos.set(x - 1, elemento);
				System.out.println("A linha foi arrumada.");
			}

			x++;
		}
	}

	/**
	 * Função para definir um elemento na matriz.
	 * 
	 * @param linha    Linha no qual o elemento vai ser definido.
	 * @param coluna   Coluna na qual o elemento vai ser definido.
	 * @param elemento Elemento que vai ser definido.
	 */
	public void definirElementoMatriz(int linha, int coluna, double elemento) {
		if (linha <= linhas && coluna <= colunas) {
			List<Double> linhaMatriz = elementos.get(linha - 1);

			linhaMatriz.set(coluna - 1, elemento);
			System.out.println("Nova linha da matriz: " + linhaMatriz);

			elementos.set(linha - 1, linhaMatriz);
		} else {
			System.out.println("O número de colunas ou linhas está fora do padrão da matriz.");
			pegarElementosMatriz();
		}
	}

	/**
	 * Retorna as linhas e colunas da matriz.
	 */
	public void pegarElementosMatriz() {
		System.out.println("Linhas: " + getLinhas() + " / Colunas: " + getColunas());
	}
}