package me.universal.matematica;

/**
 * Esta classe possui funções matemáticas básicas.
 *
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @FuncsDocumentation({"Soma", "Subtração", "Multiplicação", "Divisão", "Resto"})
 */

public class FormulasBasicas {

	/**
	 * Calcula uma soma a partir de uma lista de números.
	 * 
	 * @param numerosSomar Os números a serem somados.
	 * @return A soma de todos os números fornecidos.
	 */
	public double soma(double... numerosSomar) {
		double soma = 0;

		for (double numero : numerosSomar) {
			soma += numero;
		}

		return soma;
	}

	/**
	 * Calcula a subtração do número principal pelos números fornecidos.
	 * 
	 * @param numeroPrincipal O número do qual subtrair.
	 * @param numerosSubtrair Os números a serem subtraídos do número principal.
	 * @return O resultado da subtração.
	 */
	public double subtracao(double numeroPrincipal, double... numerosSubtrair) {
		double subtracao = numeroPrincipal;

		for (double numero : numerosSubtrair) {
			subtracao -= numero;
		}

		return subtracao;
	}

	/**
	 * Calcula a multiplicação do número principal pelos números fornecidos.
	 * 
	 * @param numeroPrincipal O número a ser multiplicado.
	 * @param numerosMultiplicar Os números pelos quais multiplicar o número principal.
	 * @return O resultado da multiplicação.
	 */
	public double multiplicacao(double numeroPrincipal, double... numerosMultiplicar) {
		double multiplicacao = numeroPrincipal;

		for (double numero : numerosMultiplicar) {
			multiplicacao *= numero;
		}

		return multiplicacao;
	}

	/**
	 * Realiza a divisão do numerador pelo denominador.
	 * 
	 * @param numerador O número a ser dividido.
	 * @param numerosDenominador Os números pelo qual dividir o numerador (Deve ser diferente de 0).
	 * @return O resultado da divisão.
	 */
	public double divisao(double numerador, double... numerosDenominador) {
		double resultado = numerador;
		
		for (double denominador : numerosDenominador) {
			if (denominador == 0) {
				throw new ArithmeticException("Não é possível dividir por zero.");
			}
			
			resultado /= denominador;
		}

		return resultado;
	}
	
	/**
	 * Realiza uma divisão e pega o resto dessa divisão.
	 * 
	 * @param numerador O número a ser dividido.
	 * @param numerosDenominador Os números pelo qual vai dividir o numerador ou seu resto (Deve ser diferente de 0).
	 * @return O resto da última divisão feita, pode ser uma divisão pelo resto de outra ou apenas o resto da primeira.
	 */
	public double resto(double numerador, double... numerosDenominador) {
		double resultado = numerador;
		
		for (double denominador : numerosDenominador) {
			if (denominador == 0) {
				throw new ArithmeticException("Não é possível dividir por zero.");
			}
			
			resultado %= denominador;
		}
		
		return resultado;
	}
}