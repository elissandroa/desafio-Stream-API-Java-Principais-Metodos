package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio5 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 5 - Calcule a média dos números maiores que 5:");
		Double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Média dos números maiores que 5: " + String.format("%.2f", media));
	}

}
