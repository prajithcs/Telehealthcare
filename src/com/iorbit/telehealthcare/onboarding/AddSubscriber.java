package com.iorbit.telehealthcare.onboarding;

import com.iorbit.telehealthcare.util.data.Address;
import com.iorbit.telehealthcare.util.data.Contact;
import com.iorbit.telehealthcare.util.data.IllnessDescription;
import com.iorbit.telehealthcare.util.data.Location;
import com.iorbit.telehealthcare.util.data.MedicalCondition;

public class AddSubscriber {

	private String type;
	private String firstName;
	private String lastName;
	private MedicalCondition medicalCondition; 
	private IllnessDescription illnessDescription; 
	private Address address;
	private Location location;
	private Contact contact;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public MedicalCondition getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(MedicalCondition medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public IllnessDescription getIllnessDescription() {
		return illnessDescription;
	}

	public void setIllnessDescription(IllnessDescription illnessDescription) {
		this.illnessDescription = illnessDescription;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
