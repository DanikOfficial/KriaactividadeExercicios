import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RelatorioArquivo {
	private String arquivo;

	public RelatorioArquivo(String endereco) {
		try {
			this.arquivo = new String(Files.readAllBytes(Paths.get(endereco)));
		} catch (IOException e) {
			throw new IllegalArgumentException("Erro ao tentar ler o ficheiro", e);
		}
	}

	public void resumo() {
		List<String> palavras = Arrays.asList(arquivo.split(" "));
		List<String> linhas = Arrays.asList(arquivo.split("\n"));
		System.out.println("Numero de Linhas: " + linhas.size());
		System.out.println("Numero de Palavras: " + palavras.size());
	}

	public void existe(String palavra) {
		List<String> palavras = Arrays.asList(arquivo.split(" "));
		boolean existe = palavras.stream().anyMatch(p -> p.equalsIgnoreCase(palavra));
		long numero = palavras.stream().filter(p -> p.equalsIgnoreCase(palavra)).count();
		System.out.println("Palavra Existe? " + existe);
		System.out.println("Numero de Vezes que a palavra aparece: " + numero);
	}
}
