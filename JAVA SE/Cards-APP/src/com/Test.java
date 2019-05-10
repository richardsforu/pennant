package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Customer cust = new Customer();
		cust.setBalance(3483784);
		cust.setCustId(1013);
		cust.setCustName("Praveen");

		Card c1 = new Card(1234, "VISA", "ASDF");
		c1.setCust(cust);

		Card c2 = new Card(1235, "MASTER", "HJJJ");
		Card c3 = new Card(1236, "VISA", "DJGDJ");
		Card c4 = new Card(1237, "MASTER", "HGSHS");
		Card c5 = new Card(1238, "VISA", "DSDS");
		Card c6 = new Card(1239, "MASTER", "JHKSHS");

		List<Card> masterCards = new ArrayList<Card>();
		List<Card> visaCards = new ArrayList<Card>();

		masterCards.add(c2);
		masterCards.add(c4);
		masterCards.add(c6);

		visaCards.add(c1);
		visaCards.add(c3);
		visaCards.add(c5);

		Map<String, List<Card>> cards = new HashMap<String, List<Card>>();
		cards.put("visa", visaCards);
		cards.put("master", masterCards);

		Set<String> keys = cards.keySet();

		for (Object key : keys) {
			//System.out.println("--- 1");
			List<Card> vs = cards.get(key);

			for (Card c : vs) {
				
				System.out.println(c.getCardNo());
				System.out.println(c.getCardType());
				System.out.println(c.getNameOnCard());
				if(c.getCust()!=null)
				System.out.println(c.getCust().getCustName());
				System.out.println("----------------------");
			}
		}

		System.out.println("-----  Done ");

	}

}
