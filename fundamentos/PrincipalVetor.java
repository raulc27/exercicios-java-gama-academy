package fundamentos;
import java.util.Iterator;
import java.util.Vector;

public class PrincipalVetor {
	
	public static void main(String args[]) {
		
		Vector<String> dados = new Vector();
		
		dados.add("Alessandra");
		dados.add("Brian");
		
		dados.add("Kellison");
		dados.add("Raul");
		
		Iterator percorre = dados.iterator();
		
		while(percorre.hasNext()) {
			System.out.println(percorre.next());
		}
		
	System.out.println("\nAcessando um elemento da lista:\n");
	System.out.println(dados.get(0));
		
	}

}
