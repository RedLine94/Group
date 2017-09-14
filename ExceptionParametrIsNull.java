package ru.mail.redlin94;

public class ExceptionParametrIsNull extends Exception {
	@Override
	public String getMessage() {
		return ("The given parametr is null.");
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
