package fundamentos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassesUtilitarias {

	public static void main(String[] args) {
		
		Date date = new Date();
		Double valor = 135.9543;
		Integer matricula = 134;
		String aluno = "RAUL CASTRO";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(date));
		
		String recibo = String.format("Recebi de %s,  o valor de R$ %.2f",aluno,  valor);
		
		System.out.println(recibo);
	}
	
}
