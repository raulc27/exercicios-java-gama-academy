package fundamentos;

public class Excecoes {
    
	
		
	
		public static void main(String[] args) {
		

			try {
				int res = dividir(10,0);
				//logica
				System.out.println("O resultado da divisão é " + res);	
			}
			
			catch(ArithmeticException e) {
				System.out.println("Não pode dividir por zero");
			}
			catch(Exception e) {
				System.out.println("Chame o desenvolvedor");
			}
			finally {
				System.out.println("com ou sem erro, isso aconteceu...");
			}
			
			
		
			
		
		}
		
		static int dividir(int div, int dis) {
			int res = div / dis;
			return res;
		}
}
