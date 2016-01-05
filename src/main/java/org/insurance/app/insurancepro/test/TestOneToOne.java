package org.insurance.app.insurancepro.test;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.insurance.app.insurancepro.dto.Hibernate;
import org.insurance.app.insurancepro.model.Account;
import org.insurance.app.insurancepro.model.Address;
import org.insurance.app.insurancepro.model.Claim;
import org.insurance.app.insurancepro.model.PolicyHolder;

import org.insurance.app.insurancepro.model.Request;

public class TestOneToOne {

	public static void main(String[] args) throws ParseException {


		PolicyHolder policyholder = new PolicyHolder();
	policyholder.setIdNo("54664774");
		policyholder.setFirstName("simba");
		policyholder.setSurname("Derek");
		policyholder.setEmail("taps@gmail.com");
		policyholder.setMobileNo("355353");
		policyholder.setUsername("Deri");

		Address addr1 = new Address();

		addr1.setHouseNo("7150");
		addr1.setStreet("Miti");
		addr1.setCity("Harare");
		addr1.setZip(4587);

		Address addr2 = new Address();

		addr2.setHouseNo("750");
		addr2.setStreet("Mii");
		addr2.setCity("arare");
		addr2.setZip(45887);
		
		policyholder.getListOfAddresses().add(addr1);
		policyholder.getListOfAddresses().add(addr2);
					
		Account account=new Account();
		account.setCredit(45);
		account.setDebit(100);
		account.setDescription("you have a lot of cash");
		account.getBalance();
		
		Claim claim=new Claim();
		claim.setDescription("This was an accident");
		claim.setEvidence("pic.jpeg");
		
		Request request=new Request();
		request.setComment("i want this policy");
		request.setProductType("Life insurance");

		
		policyholder.getClaimList().add(claim);
		policyholder.getAccountList().add(account);
		account.setPolicyholder(policyholder);
		claim.setPolicyholder(policyholder);
		
	//	policyholder.getRequestList().add(request);
		
		
		
		SessionFactory sessionfactory = Hibernate.getSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(policyholder);
		session.save(request);
		session.save(account);
		session.save(claim);
		session.getTransaction().commit();
		session.close();
	
				
		/*Binds the Profile and PolicyHolder entities 
		 * to a ONE-TO-ONE relationship */
		

		}
}