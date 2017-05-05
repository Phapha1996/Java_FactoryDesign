package test;

import phoneclass.Phone;
import factory.PhoneFactory;

public class TestClass {

	public static void main(String[] args) {

		try{
			
		PhoneFactory factory = new PhoneFactory();
		Phone p = factory.getPhone();
		p.getPhone();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
