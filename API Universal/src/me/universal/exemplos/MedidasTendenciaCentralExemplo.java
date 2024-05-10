package me.universal.exemplos;

import java.util.Arrays;
import java.util.List;

import me.universal.matematica.estatistica.MedidasTendenciasCentral;

/**
 * Classe para exemplo de uso das fórmulas medias.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @Dependencias({"MedidasTendenciasCentral"})
 */
public class MedidasTendenciaCentralExemplo {
	
	/**
	 * Função para mostrar os comandos de tedência central.
	 */
	public static void main(String[] args) {
		MedidasTendenciasCentral mCentral = new MedidasTendenciasCentral();
		
		List<Double> listaNumeros = Arrays.asList(1.0, 3.5, 4.0, 2.1, 4.5);
		
		System.out.println("Média");
		System.out.println(mCentral.media(listaNumeros));
		
		System.out.println("Moda");
		System.out.println(mCentral.moda(listaNumeros));
		
		System.out.println("Mediana");
		System.out.println(mCentral.mediana(listaNumeros));
	}

}
