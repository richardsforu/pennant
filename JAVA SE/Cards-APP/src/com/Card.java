package com;

public class Card {

	private long cardNo;
	private String cardType;
	private String nameOnCard;

	private Customer cust;

	public Card() {
		// TODO Auto-generated constructor stub
	}

	public Card(long cardNo, String cardType, String nameOnCard) {
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.nameOnCard = nameOnCard;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

}
