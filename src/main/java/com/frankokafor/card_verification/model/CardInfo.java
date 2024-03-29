package com.frankokafor.card_verification.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card_info")
public class CardInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(unique = true, nullable = false)
	private long id;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "bank", column = @Column(name = "bank_name")),
			@AttributeOverride(name = "scheme", column = @Column(name = "card_scheme")),
			@AttributeOverride(name = "type", column = @Column(name = "card_type")) })
	private Payload payload;
	@Column(name = "search_amount")
	private Integer searchAmount;
	@Column(name = "success")
	private Boolean success;
	@Column(name = "card_number")
	private String cardNumber;

	public CardInfo() {
		super();
	}

	public CardInfo(Payload payload, Integer searchAmount, Boolean success, String cardNumber) {
		super();
		this.payload = payload;
		this.searchAmount = searchAmount;
		this.success = success;
		this.cardNumber = cardNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getSearchAmount() {
		return searchAmount;
	}

	public void setSearchAmount(Integer searchAmount) {
		this.searchAmount = searchAmount;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

}
