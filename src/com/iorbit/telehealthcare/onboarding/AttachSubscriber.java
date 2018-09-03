package com.iorbit.telehealthcare.onboarding;

import com.iorbit.telehealthcare.util.data.Address;
import com.iorbit.telehealthcare.util.data.Location;

public class AttachSubscriber {

	private String type;
	private String name;
	private Address address;
	private Location location;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
