package com.iorbit.telehealthcare.onboarding.exception;

import com.iorbit.telehealthcare.exception.TelehealthcareException;

public class OnboardingException extends TelehealthcareException {

	private static final long serialVersionUID = 7615241407102569326L;

	public OnboardingException(String message) {
		super(message);
	}

	public OnboardingException(String message, Throwable cause) {
		super(message, cause);
	}

	public OnboardingException(Throwable cause) {
		super(cause);
	}

}
