package fundamentos;
import java.util.ArrayList;
import java.util.Iterator;


public class Principal {

	public static void main(String args[]) {
		
		ArrayList<Integer> dados = new ArrayList();
		dados.add(4);
		dados.add(3);
		dados.add(2);
		dados.add(1);
		dados.add(0);
		
		
		
		Iterator<Integer> percorre = dados.iterator();
		while(percorre.hasNext()) {
			System.out.println(percorre.next());
		}
		System.out.println("\nAcessando um elemento da lista (pelo índice):\n");
		System.out.println(dados.get(0));
	}
	
}
