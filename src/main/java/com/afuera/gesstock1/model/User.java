package com.afuera.gesstock1.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User extends ParentEntity {

	private static final long serialVersionUID = -5014387200981046050L;

	@Column(name = "name", nullable=false, length=30)
	private String name;
	
	@Column(name = "surname", nullable=false, length=30)
	private String surname;
	
	@Column(name = "phone", nullable=true, length=15)
	private String phone;
	
	@Column(name = "address",   nullable=true, length=255)
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
