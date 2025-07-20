package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio15 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 15 - Verifique se a lista contém pelo menos um número negativo:");
		boolean existeNegativo = numeros.stream().anyMatch(n -> n < 0);
		System.out.println(existeNegativo ? "A lista contém pelo menos um número negativo"
				: "A lista não contém números negativos");
	}

}
