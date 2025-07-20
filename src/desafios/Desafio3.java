package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio3 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 3 - Verifique se todos os números da lista são positivos:");
		System.out.println((numeros.stream().allMatch(n -> n > 0)) ? "Todos os números são positivos"
				: "Nem todos os números são positivos");

	}

}
