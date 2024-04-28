package me.universal.transforms;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe possui funções que transformam conjuntos de dados primitivos para tipos de collections.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1 
 * @FuncsDocumentation({"Conjunto de Doubles para Lista"})
 */


public class TransformIntoColletions {
	
	/**
	 * Transforma um conjunto de doubles em uma lista.
	 * 
	 * @param numeros Conjunto de números de tipo double.
	 * @return 
	 * @return Lista formada pelos números da variável numeros.
	 */
	public List<Double> conjuntoDoublesToList(double... numeros) {
		List<Double> lista = new ArrayList<Double>();
		
		for (double numero : numeros) {
			lista.add(numero);
		}
		
		return lista;
	}

}
