package com.nyl.nylim.domain;

public class Price {

	private String fundID;
	private String qucip;
	private String ticker;
	private String effectiveDate;
	private String frequency;

	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Price(String fundID, String qucip, String ticker, String effectiveDate, String frequency) {
		super();
		this.fundID = fundID;
		this.qucip = qucip;
		this.ticker = ticker;
		this.effectiveDate = effectiveDate;
		this.frequency = frequency;
	}

	public String getFundID() {
		return fundID;
	}

	public void setFundID(String fundID) {
		this.fundID = fundID;
	}

	public String getQucip() {
		return qucip;
	}

	public void setQucip(String qucip) {
		this.qucip = qucip;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

}
