package util;

/**
 * Classe responsável por validar os dados inputados pelo usuario
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class Valida {

	// verificando se o valor digitado é nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string.trim().equals("") || string == null);
	}

	// verificando se o valor informado é zero
	public static boolean isIntZero(int args) {
		return (args == 0);
	}

	// verificando se o valor informado é zero
	public static boolean isDoubleZero(double args) {
		return (args == 0);
	}

}
