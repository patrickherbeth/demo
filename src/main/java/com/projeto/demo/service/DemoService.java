package com.projeto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@SuppressWarnings("all")
@Transactional(propagation = Propagation.REQUIRED)
public class DemoService {

	/**
	 * @param matriz
	 * @param valor
	 * @return
	 */
	public List<String> buscar(int matriz[][], int valor[]) {

		// Laço responsável por localizar os valores presentes na matriz e retornar um array
		int count = 0;
		List<String> retorno = new ArrayList<String>();

		for (int i = 0; i < valor.length; i++) {
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					if (matriz[linha][coluna] == valor[i]) {
						count++;
					}
				}
			}

			retorno.add("Valor encontrado " + valor[i] + " Quantidade " + count);
			count = 0;
		}
		return retorno;
	}

	/**
	 * @return
	 */
	public int[][] gerarMatriz() {

		int matriz[][] = new int[15][15];
		int soma = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = linha * coluna;
			}
		}
		return matriz;
	}

	/**
	 * @param resultados
	 */
	public void imprimir(List<String> resultados) {
		for (String string : resultados) {
			System.out.println(string);
		}
	}

}
