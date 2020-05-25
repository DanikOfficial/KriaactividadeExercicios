public class VerificadorPalindromo {
	/**
	 * Este codigo não usa nenhuma API Java para inverter a palavra
	 */
	public static boolean testaPalindromoUsandoCodigoNativoJava(String palavra) {
		boolean resultado = false;
		String palavraInvertida = "";
		if (palavra.length() < 3) {
			throw new IllegalArgumentException("Erro: A palavra digitada tem um numero de caracteres inferior a 3");
		} else {
			for (int i = palavra.length() - 1; i >= 0; i--) {
				palavraInvertida += palavra.charAt(i);
			}
			resultado = palavraInvertida.equalsIgnoreCase(palavra) ? true : false;
		}
		return resultado;
	}

	/**
	 * Este codigo usa uma API Java para inverter a palavra
	 */
	public static boolean testaPalindromoUsandoAPIJava(String palavra) {
		boolean resultado = false;
		if (palavra.length() < 3) {
			throw new IllegalArgumentException("Erro: A palavra digitada tem um numero de caracteres inferior a 3");
		} else {
			StringBuilder palavraInvertida = new StringBuilder(palavra).reverse(); // Classe StringBuilder usada para
																					// manipular o texto.
			resultado = palavraInvertida.toString().equalsIgnoreCase(palavra.toString());
		}
		return resultado;
	}
}
