package com.nyl.nylim.domain;

public class Price {
	
	private String fundID;
	private String qucipID;
	private String ticker;
	
	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Price(String fundID, String qucipID, String ticker) {
		super();
		this.fundID = fundID;
		this.qucipID = qucipID;
		this.ticker = ticker;
	}

	public String getFundID() {
		return fundID;
	}
	
	public void setFundID(String fundID) {
		this.fundID = fundID;
	}
	
	public String getQucipID() {
		return qucipID;
	}
	
	public void setQucipID(String qucipDI) {
		this.qucipID = qucipDI;
	}
	
	public String getTicker() {
		return ticker;
	}
	
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
}
