package com.TimeSheet.Exception;

public class RecordNotFoundException extends RuntimeException{
	private static final long serialversionUID=1L;

	public RecordNotFoundException(String msg) {
		super(msg);
	}


}
