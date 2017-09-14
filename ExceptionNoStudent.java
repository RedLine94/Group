package ru.mail.redlin94;

public class ExceptionNoStudent extends Exception {
	@Override
	public String getMessage() {
		return ("This group does not contain given student.");
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
