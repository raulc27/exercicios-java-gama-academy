package fundamentos;

public class Concatenacao {

	public static void main(String[] args) {
		
		
			String valor = verdade() ? "verdadeiro" : "false";
			System.out.println(valor);
		
		
	}
	
	static boolean verdade() {
		return true;
	}
	
	static String verdadeiro() {
		return "verdadeiro";
	}
}
