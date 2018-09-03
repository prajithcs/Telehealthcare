package com.iorbit.telehealthcare.onboarding;

import com.iorbit.telehealthcare.util.data.Address;
import com.iorbit.telehealthcare.util.data.Location;

public class AttachCarehome {

	private String name;
	private Location location;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
