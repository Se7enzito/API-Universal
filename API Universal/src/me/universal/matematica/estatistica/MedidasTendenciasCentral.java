package me.universal.matematica.estatistica;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @FuncsDocumentation({"Média", "Moda", "Mediana"})
 */

public class MedidasTendenciasCentral {
	
	/**
	 * Função para calcular a média de uma lista de números.
	 * 
	 * @param numeros Lista de números que vão ser analisados.
	 * @return Retorna a média da lista de números.
	 */
	public double media(List<Double> numeros) {
		double tamanho = numeros.size();
		double soma = 0;
		
		for (double numero : numeros) {
			soma += numero;
		}
		
		double resultado = soma / tamanho;
		
		return resultado;
	}
	
	/**
	 * Função para calcular a moda de uma lista de números.
	 * 
	 * @param numeros Lista de números que vão ser analisados.
	 * @return Retorna a moda da lista de números
	 */
	public Double moda(List<Double> numeros) {
		// Arrumar o método (Deixar multimodal)
        Map<Double, Integer> contagem = new HashMap<>();
        
        for (double numero : numeros) {
            contagem.put(numero, contagem.getOrDefault(numero, 0) + 1);
        }
        
        Double moda = 0.0;
        int maxContagem = 0;
        for (Entry<Double, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() > maxContagem) {
                moda = entry.getKey();
                maxContagem = entry.getValue();
            }
        }
        
        return moda;
	}
	
	/**
	 * Função para calcular a mediana de uma lista de números.
	 * 
	 * @param numeros Lista de números que vão ser analisados.
	 * @return Retorna a mediana da lista de números.
	 */
	public double mediana(List<Double> numeros) {
		Collections.sort(numeros);
		
		int tamanho = numeros.size();
		double resultado = 0;
		
		if (tamanho % 2 == 0) {
			int local0 = tamanho + 1 / 2;
			int local1 = tamanho - 1 / 2;
			
			resultado = (numeros.get(local0) + numeros.get(local1)) / 2;
		} else {
			int local = tamanho + 1 / 2;
			
			resultado = numeros.get(local);
		}
		
		return resultado;
	}

}
