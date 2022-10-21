import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.projeto.demo.model.SuperHeroi;

public class Main {

	static List<SuperHeroi> lista;

	public static void main(String[] args) throws IOException {
		int valor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15 };
		int matriz[][] = new int[15][15];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = linha * coluna;
			}
		}

		criarLista();
		buscar(matriz, valor);
		lerArquivoCsv();
		posicaoChegada();
		imprimir();
		imprimirCodigoSuperHeroi();
		imprimirNomeSuperHeroi();

	}

	public static void buscar(int matriz[][], int valor[]) {
		int count = 0;

		for (int i = 0; i < valor.length; i++) {
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					if (matriz[linha][coluna] == valor[i]) {
						count++;
					}
				}
			}

			System.out.println("Valor encontrado " + valor[i] + " Quantidade " + count);
			count = 0;
		}
	}

	public static void lerArquivoCsv() {
		try {
			Files.lines(Paths.get("log.txt")).skip(1).map(line -> line.split(";"))
					.map(col -> new SuperHeroi(col[0], col[1], col[2], col[3], col[4]))
					.forEach(pessoa -> System.out.println(pessoa.toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void criarLista() throws IOException {
		lista = Files.lines(Paths.get("log.txt")).skip(1).map(line -> line.split(";"))
				.map(col -> new SuperHeroi(col[0], col[1], col[2], col[3], col[4])).collect(Collectors.toList());

	}

	public static void posicaoChegada() throws IOException {
		lista.sort((a, b) -> a.getTempoVolta().toString().compareTo(b.getTempoVolta().toString()));

	}

	public static void imprimir() {
		int count = 1;

		for (SuperHeroi superHeroi : lista) {
			System.out.println(count + " Posição -->  " + superHeroi.toString());
			count++;
		}
	}

	public static void imprimirCodigoSuperHeroi() {

		for (SuperHeroi superHeroi : lista) {
			System.out.println(" Código -->  " + superHeroi.getSuperHeroi().substring(0, 3));
		}
	}

	public static void imprimirNomeSuperHeroi() {

		for (SuperHeroi superHeroi : lista) {
			System.out.println(" Nome -->  " + superHeroi.getSuperHeroi().substring(5));
		}
	}
}
