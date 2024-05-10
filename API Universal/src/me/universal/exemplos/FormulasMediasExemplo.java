package me.universal.exemplos;

import java.util.Arrays;
import java.util.List;

import me.universal.matematica.FormulasMedias;

/**
 * Classe para exemplo de uso das fórmulas medias.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @Dependencias({"FormulasMedias"})
 */
public class FormulasMediasExemplo {
	
	/**
	 * Função para mostrar os comandos das fórmulas médias. 
	 */
	public static void main(String[] args) {
		FormulasMedias forms = new FormulasMedias();
		
		List<Double> bases = Arrays.asList(1.0, 5.0, 7.0, 10.0);
		List<Double> expoentes = Arrays.asList(1.0, 4.0, 3.0, 20.0);
		
		System.out.println("Multiplicação de Potências");
		System.out.println(forms.multiplicacaoPotencias(bases, expoentes));
		
		System.out.println("Soma de Potências");
		System.out.println(forms.somaPotencias(bases, expoentes));
		
		System.out.println("Divisão de Potências");
		System.out.println(forms.divisaoPotencias(bases, expoentes));
		
		System.out.println("Subtração de Potências");
		System.out.println(forms.subtracaoPotencias(bases, expoentes));
	}

}
