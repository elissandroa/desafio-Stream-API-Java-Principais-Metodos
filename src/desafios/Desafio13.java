package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio13 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 13 - Filtrar os números que estão dentro de um intervalo: de 3 a 7");
		List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n >= 3 && n <= 7).toList();
		System.out.println("Números no intervalo de 3 a 7: " + numerosNoIntervalo);
	}

}
