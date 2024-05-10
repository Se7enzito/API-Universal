package me.universal.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Esta anotação é usada para documentar as dependências de uma classe.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Dependencias {
	/**
	 * As funções disponíveis na classe.
	 * 
	 * @return Uma lista de funções disponíveis na classe.
	 */
	String[] value();
}