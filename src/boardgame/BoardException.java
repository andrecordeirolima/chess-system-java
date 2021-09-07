package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	//construtor, que recebe a mensagem(msg), e a repassa
	//para o construtor da superClasse (RuntimeException)
	public BoardException(String msg) {
		super(msg);
	}
	

}
