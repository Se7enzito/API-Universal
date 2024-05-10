package me.universal.exemplos;

import me.universal.matematica.FormulasBasicas;

/**
 * Classe para exemplo de uso das fórmulas básicas.
 * 
 * @author Bernardo de Castro Monteiro Franco Gomes
 * @version 0.1
 * @Dependencias({"FormulasBasicas"})
 */
public class FormulasBasicasExemplo {
	
	
	public static void main(String[] args) {
		FormulasBasicas forms = new FormulasBasicas();
		
		System.out.println("Soma");
		System.out.println(forms.soma(2, 3, 4, 5, 6));
		
		System.out.println("Subtração");
		System.out.println(forms.subtracao(100, 1, 2, 3, 4, 5));
		
		System.out.println("Divisão");
		System.out.println(forms.divisao(40, 1, 2, 3, 4, 5));
		
		System.out.println("Multiplicação");
		System.out.println(forms.multiplicacao(1, 2, 3, 4, 5));
		
		System.out.println("Resto");
		System.out.println(forms.resto(40, 3, 5, 7));
	}

}
