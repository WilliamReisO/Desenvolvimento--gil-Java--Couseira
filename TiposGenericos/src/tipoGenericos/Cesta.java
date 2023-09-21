package tipoGenericos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cesta <E>{

	private List<E> lista = new ArrayList<>();
	
	public void Adiciona(E elemento) {
		lista.add(elemento);
	}
	public void retira(){
		Random r = new Random (System.currentTimeMillis());
	}
	public boolean temItems() {
		return !lista.isEmpty();
	}
}
