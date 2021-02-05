

/**
 * 
 * @author raul
 * classe para enviar mensagens
 */



public class TransmissorMensagem {

	private String destinatario;
	/**
	 * Constructor TransmissorMensagem
	 * @param d = destinatario
	 * @ throws Exceção no caso  de não informar o destinatário
	 */
	public TransmissorMensagem(String d) throws RuntimeExcepetion{
		if(d==null)
			throw new RuntimeException("É necessário informar o destinatário");
		this.destinatario = destinatario;
	}
	
	public void enviar(String mensagem) throws Exception{
		System.out.println(String.format("Caro $s, \n%s",destinatario,mensagem));
	}
	
	public static void main(String[] args) {
		try {
			TransmissorMensagem tm = new TransmissorMensagem("Aluno");
			tm.enviar("Seja bem-vindo");
		}
		catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
