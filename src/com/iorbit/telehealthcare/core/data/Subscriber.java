package com.iorbit.telehealthcare.core.data;

import com.iorbit.telehealthcare.util.data.Address;
import com.iorbit.telehealthcare.util.data.Contact;
import com.iorbit.telehealthcare.util.data.IllnessDescription;
import com.iorbit.telehealthcare.util.data.Location;
import com.iorbit.telehealthcare.util.data.MedicalCondition;

public class Subscriber {

	private String type;
	private String firstName;
	private String lastName;
	private String carehomeName;
	private MedicalCondition medicalCondition = new MedicalCondition();
	private IllnessDescription illnessDescription = new IllnessDescription();
	private Address address;
	private Location location;
	private String caretakerName;
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

	public String getCarehomeName() {
		return carehomeName;
	}

	public void setCarehomeName(String carehomeName) {
		this.carehomeName = carehomeName;
	}

	public String getCaretakerName() {
		return caretakerName;
	}

	public void setCaretakerName(String caretakerName) {
		this.caretakerName = caretakerName;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public MedicalCondition getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(MedicalCondition medicalCondition) {
		this.medicalCondition = medicalCondition;
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

	public IllnessDescription getIllnessDescription() {
		return illnessDescription;
	}

	public void setIllnessDescription(IllnessDescription illnessDescription) {
		this.illnessDescription = illnessDescription;
	}

}
