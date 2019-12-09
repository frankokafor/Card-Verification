package com.frankokafor.card_verification.responses;

import java.util.Map;

public class StatsResponse {
	private Boolean success;
	private int start;
	private int limit;
	private long size;
	private Map<String, Integer> payload;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Map<String, Integer> getPayload() {
		return payload;
	}

	public void setPayload(Map<String, Integer> payload) {
		this.payload = payload;
	}

}
