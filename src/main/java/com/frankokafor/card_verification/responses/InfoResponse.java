package com.frankokafor.card_verification.responses;

import com.frankokafor.card_verification.model.Payload;

public class InfoResponse {

	private Boolean success;
	private Payload payload;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

}
