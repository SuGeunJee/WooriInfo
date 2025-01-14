package info.exception;

//멤버가 없을때 
public class NotExistException extends Exception {
	public NotExistException() {}

	public NotExistException(String message) {
		super(message);
	}
}
