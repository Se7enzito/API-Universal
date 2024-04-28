package me.universal.matematica;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe possui funções matemáticas medianas. Ao criar a OO dessa classe,
 * você ja puxa todos os métodos das Formulas Básicas.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @FuncsDocumentation({"Multiplicação de Potências", "Soma de
 *          Potências", "Divisão de Potências", "Subtração Potências"})
 */

public class FormulasMedias extends FormulasBasicas {

	/**
	 * Função para pegar uma lista de potências. Será utilizada somente nos casos de
	 * soma e subtração, para os de divisão e multiplicação iremos aplicar algumas
	 * regras.
	 * 
	 * @param bases     Lista de bases para as potências.
	 * @param expoentes Lista de expoentes para as potências.
	 * @return Retorna uma lista de potências.
	 */
	private List<Double> getListaPotencias(List<Double> bases, List<Double> expoentes) {
		if (bases.size() != expoentes.size()) {
			throw new ArithmeticException("As listas precisam ter o número de dados dentro delas iguais.");
		}

		int tamanho = bases.size();
		List<Double> potencias = new ArrayList<Double>();

		for (int i = 0; i < tamanho; i++) {
			double b = bases.get(i);
			double p = bases.get(i);

			double potencia = Math.pow(b, p);

			potencias.add(potencia);
		}

		return potencias;
	}

	/**
	 * Calcula uma multiplicação de potências a partir de uma lista de números.
	 * 
	 * @param bases     Lista de bases para as potências.
	 * @param expoentes Lista de expoentes para as potências.
	 * @return 
	 * @return A multiplicação de todas as potências fornecidas.
	 */
	public double multiplicacaoPotencias(List<Double> bases, List<Double> expoentes) {
		List<Double> listaPotencias = getListaPotencias(bases, expoentes);
		
		double resultado = listaPotencias.get(0);
		listaPotencias.remove(0);
		
		for (double potencia : listaPotencias) {
			resultado *= potencia;
		}
		
		return resultado;
	}

	/**
	 * Calcula uma soma de potências a partir de uma lista de números.
	 * 
	 * @param bases     Lista de bases para as potências.
	 * @param expoentes Lista de expoentes para as potências.
	 * @return 
	 * @return A soma de todas as potências fornecidas.
	 */
	public double somaPotencias(List<Double> bases, List<Double> expoentes) {
		List<Double> listaPotencias = getListaPotencias(bases, expoentes);
		
		double resultado = 0;
		
		for (double potencia : listaPotencias) {
			resultado += potencia;
		}
		
		return resultado;
	}

	/**
	 * Calcula uma divisão de potências a partir de uma lista de números.
	 * 
	 * @param bases     Lista de bases para as potências.
	 * @param expoentes Lista de expoentes para as potências.
	 * @return 
	 * @return A divisão de todas as potências fornecidas.
	 */
	public double divisaoPotencias(List<Double> bases, List<Double> expoentes) {
		List<Double> listaPotencias = getListaPotencias(bases, expoentes);
		
		double resultado = listaPotencias.get(0);
		listaPotencias.remove(0);
		
		for (double potencia : listaPotencias) {
			resultado /= potencia;
		}
		
		return resultado;
	}

	/**
	 * Calcula uma subtração de potências a partir de uma lista de números. Sempre
	 * enviar a principal primeiro.
	 * 
	 * @param bases     Lista de bases para as potências.
	 * @param expoentes Lista de expoentes para as potências.
	 * @return 
	 * @return A subtração de todas as potências fornecidas.
	 */
	public double subtracaoPotencias(List<Double> bases, List<Double> expoentes) {
		List<Double> listaPotencias = getListaPotencias(bases, expoentes);
		
		double resultado = listaPotencias.get(0);
		listaPotencias.remove(0);
		
		for (double potencia : listaPotencias) {
			resultado -= potencia;
		}
		
		return resultado;
	}
}