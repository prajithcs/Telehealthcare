package com.iorbit.telehealthcare.onboarding;

import com.iorbit.telehealthcare.util.data.Address;
import com.iorbit.telehealthcare.util.data.Contact;
import com.iorbit.telehealthcare.util.data.Location;
public class AddCaretaker {


	private String firstName;
	private String lastName;
	private String type;
	private int priority;
	private String carehomeName;
	private String longDistance;	
	private  Contact contact;
	private Address address;
	private Location location;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getCarehomeName() {
		return carehomeName;
	}
	public void setCarehomeName(String carehomeName) {
		this.carehomeName = carehomeName;
	}
	public String getLongDistance() {
		return longDistance;
	}
	public void setLongDistance(String longDistance) {
		this.longDistance = longDistance;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
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
	
	
	
	 
}
