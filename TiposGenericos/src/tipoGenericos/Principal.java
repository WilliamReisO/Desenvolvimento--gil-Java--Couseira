package tipoGenericos;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main (String[] args) {
		Cesta<Fruta> frutas = new Cesta<>();
		frutas.Adiciona(new Fruta("Maça"));
		frutas.Adiciona(new Fruta("Banana"));
		frutas.Adiciona(new Fruta("Mamão"));
		frutas.Adiciona(new Fruta("Melacia"));
		frutas.Adiciona(new Fruta("Uva"));
		frutas.Adiciona(new FrutaVermelha("morango"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>();
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		while(frutas.temItems()){
			System.out.println(frutas.retira());
		}
	}
}
