package com.iorbit.telehealthcare.onboarding.manager;

import com.iorbit.telehealthcare.core.data.CareHome;
import com.iorbit.telehealthcare.core.data.CareTaker;
import com.iorbit.telehealthcare.core.data.Device;
import com.iorbit.telehealthcare.core.data.Subscriber;
import com.iorbit.telehealthcare.onboarding.ActivateDevice;
import com.iorbit.telehealthcare.onboarding.AddCarehome;
import com.iorbit.telehealthcare.onboarding.AddCaretaker;
import com.iorbit.telehealthcare.onboarding.AddDevice;
import com.iorbit.telehealthcare.onboarding.AddSubscriber;
import com.iorbit.telehealthcare.onboarding.AttachCarehome;
import com.iorbit.telehealthcare.onboarding.AttachCaretaker;
import com.iorbit.telehealthcare.onboarding.DetachCarehome;
import com.iorbit.telehealthcare.onboarding.DetachCaretaker;
import com.iorbit.telehealthcare.onboarding.EditSubscriber;
import com.iorbit.telehealthcare.onboarding.EmailVerification;
import com.iorbit.telehealthcare.onboarding.DeactivateDevice;
import com.iorbit.telehealthcare.onboarding.UserConsent;
import com.iorbit.telehealthcare.onboarding.exception.OnboardingException;

public class SubscriberManager {

	public void addSubscriber(AddSubscriber addSubscriber, Subscriber subscriber) throws  OnboardingException{
		
       throw new OnboardingException("Error occured");
	}

	public void validateSubscriber(Subscriber subscriber) {
		 
	}
	
	public void editSubscriber(EditSubscriber editSubscriber, Subscriber subscriber) {

	}
	
	public void addCareTaker(AddCaretaker addCaretaker, CareTaker careTaker) {

	}

	public void addCareHome(AddCarehome addCarehome, CareHome careHome) {

	}

	public void attachCarehome(AttachCarehome carehome) {

	}

	public void detachCaretaker(DetachCaretaker caretaker) {

	}

	public void detachCarehome(DetachCarehome carehome) {

	}

	public void attachCaretaker(AttachCaretaker caretaker) {

	}

	public void emailVerification(EmailVerification emailVerification) {

	}

	public void userConsented(UserConsent constent) {

	}

	public void addDevice(AddDevice addDevic, Device device) {

	}

	public void activate(ActivateDevice activateDevice, Device device) {

	}

	public void deActivate(DeactivateDevice deactivateDevice, Device device) {

	}
}
