package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio1 {
	
	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("Desafio 1 - Mostre a lista na ordem numérica: crescente");
		numeros.stream().sorted().toList().forEach(System.out::print);
		System.out.println();
		
	}

}
