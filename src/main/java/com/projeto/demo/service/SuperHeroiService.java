package com.projeto.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.projeto.demo.model.SuperHeroi;

public class SuperHeroiService {

	static List<SuperHeroi> lista;

	/**
	 *
	 */
	public void lerArquivoCsv() {
		try {
			Files.lines(Paths.get("log.csv")).skip(1)
			.map(line -> line.split(";"))
			.map(col-> new SuperHeroi(col[0], col[1], col[2], col[3], col[4]))
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @throws IOException
	 */
	public void criarLista() throws IOException {
		lista = Files.lines(Paths.get("log.txt")).skip(1).map(line -> line.split(";"))
				.map(col -> new SuperHeroi(col[0], col[1], col[2], col[3], col[4])).collect(Collectors.toList());

	}

	/**
	 *
	 * @throws IOException
	 */
	public void posicaoChegada() throws IOException {
		lista.sort((a, b) -> a.getTempoVolta().toString().compareTo(b.getTempoVolta().toString()));

	}

	public static void imprimir() {
		int count = 1;

		for (SuperHeroi superHeroi : lista) {
			System.out.println(count + " Posição -->  " + superHeroi.toString());
			count++;
		}
	}

	public void imprimirCodigoSuperHeroi() {

		for (SuperHeroi superHeroi : lista) {
			System.out.println(" Código -->  " + superHeroi.getSuperHeroi().substring(0, 3));
		}
	}

	public void imprimirNomeSuperHeroi() {

		for (SuperHeroi superHeroi : lista) {
			System.out.println(" Nome -->  " + superHeroi.getSuperHeroi().substring(5));
		}
	}

}
