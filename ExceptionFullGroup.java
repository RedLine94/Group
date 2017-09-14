package ru.mail.redlin94;

public class ExceptionFullGroup extends Exception {

	@Override
	public String getMessage() {
		return ("The group is empty.");
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
