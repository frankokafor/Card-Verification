package com.frankokafor.card_verification.pojo;

public class ExtractPojo {

	private String scheme;
	private String type;
	private String brand;
	private Boolean prepaid;
	private Bank bank;
	private Country country;
	private Number number;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getPrepaid() {
		return prepaid;
	}

	public void setPrepaid(Boolean prepaid) {
		this.prepaid = prepaid;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

}
