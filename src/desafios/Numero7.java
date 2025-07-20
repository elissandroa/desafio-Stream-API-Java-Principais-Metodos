package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Numero7 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 7 - Encontrar o segundo número maior da lista:");
		Integer segundoMaior = numeros.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().orElse(null);
		System.out.println(segundoMaior != null ? "O segundo maior número é: " + segundoMaior
				: "Não há segundo maior número na lista");

	}

}
