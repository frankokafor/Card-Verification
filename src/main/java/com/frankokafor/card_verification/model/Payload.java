package com.frankokafor.card_verification.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Payload implements Serializable {

	private static final long serialVersionUID = 1L;
	private String scheme;
	private String type;
	private String bank;

	public Payload() {
		super();
	}

	public Payload(String scheme, String type, String bank) {
		super();
		this.scheme = scheme;
		this.type = type;
		this.bank = bank;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}
