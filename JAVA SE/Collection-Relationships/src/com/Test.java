package com;

public class Test {

	public static void main(String[] args) {

		Address p = new Address();
		Address t = new Address();

		p.setAddrId(10);
		p.setAddrType("Permanent");
		p.setAddress("Goa");

		t.setAddrId(11);
		t.setAddrType("Temp");
		t.setAddress("Hyderabad");
		
		
		
		// List<Address> addrs=new ArrayList<Address>();
		// addrs.add(p);
		// addrs.add(t);
		
		
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setCustName("Ozvitha");
		
		cust.getAddresses().add(p);
		cust.getAddresses().add(t);
		
		
		
		//cust.setAddresses(addrs);
		
		
		System.out.println("ID: "+cust.getCustId());
		System.out.println("Name: "+cust.getCustName());
		
		for(Address addr:cust.getAddresses()) {
			System.out.println(addr.getAddrId());
			System.out.println(addr.getAddrType());
			System.out.println(addr.getAddress());
			System.out.println("----------------------");
			
		}

	}

}
