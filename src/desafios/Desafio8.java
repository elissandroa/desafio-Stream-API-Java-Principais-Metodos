package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio8 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 8 - Somar os dígitos de todos os números da lista:");
		Integer somaDigitos = numeros.stream().map(n -> String.valueOf(n).chars().map(Character::getNumericValue).sum())
				.reduce(0, Integer::sum);
		System.out.println("Soma dos dígitos de todos os números: " + somaDigitos);

	}

}
