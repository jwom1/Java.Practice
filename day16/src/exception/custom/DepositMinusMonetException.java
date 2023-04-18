package exception.custom;

public class DepositMinusMonetException extends RuntimeException {

	public DepositMinusMonetException() {}
	public DepositMinusMonetException(String message) {
		super(message);
	}
}
