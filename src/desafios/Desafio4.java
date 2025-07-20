package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio4 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 4 - Remova todos os valores ímpares:");
		List<Integer> novaLista = numeros.stream().map(n -> n % 2 == 0 ? n : null).filter(n -> n != null).toList();
		novaLista.forEach(System.out::print);
		System.out.println();

	}

}
