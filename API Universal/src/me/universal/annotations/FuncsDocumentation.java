package me.universal.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Esta anotação é usada para documentar as funções disponíveis em uma classe.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FuncsDocumentation {
	/**
	 * As funções disponíveis na classe.
	 * 
	 * @return Uma lista de funções disponíveis na classe.
	 */
	String[] value();

	// Exemplo para obter as funções de uma classe, caso você não queira abrir a classe e ler o que ela fala
	// Obtém a classe FormulasBasicas
    // Class<?> clazz = FormulasBasicas.class;
    // Verifica se a anotação FuncsDocumentation está presente na classe
	// if (clazz.isAnnotationPresent(FuncsDocumentation.class)) {
	// Obtém a anotação FuncsDocumentation
	// FuncsDocumentation annotation = clazz.getAnnotation(FuncsDocumentation.class);
	// Obtém a lista de funções da anotação
	// String[] funcs = annotation.value();
	// Exibe as funções documentadas
	// System.out.println("Funções disponíveis na classe:");
	// for (String func : funcs) {
	// System.out.println(func);
	// }
	// } else {
	// System.out.println("A classe não possui documentação de funções.");
	// }
}
