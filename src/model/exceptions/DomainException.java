package model.exceptions;

public class DomainException extends Exception{ //RuntimeException não precisa tratar a exceção no metodo ou no construtor

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
	
	
}
