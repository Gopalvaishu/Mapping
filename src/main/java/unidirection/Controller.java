package unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Pancards1 pancards1=new Pancards1();
	pancards1.setName("Vaishnavi");
	pancards1.setPanid(1232354);
	pancards1.setPhone(23456789);
	
	BankAccounts1 accounts1=new BankAccounts1();
	accounts1.setAccountid(987624334);
	accounts1.setName("vaishnavi");
	accounts1.setPhone(23456789);
	
	BankAccounts1 accounts2=new BankAccounts1();
	accounts2.setAccountid(987654334);
	accounts2.setName("vaishnavi");
	accounts2.setPhone(23456789);
	
	BankAccounts1 accounts3=new BankAccounts1();
	accounts3.setAccountid(987454334);
	accounts3.setName("vaishnavi");
	accounts3.setPhone(23456789);
	
	List<BankAccounts1> lba=new ArrayList<BankAccounts1>();
	lba.add(accounts1);
	lba.add(accounts2);
	lba.add(accounts3);
	
	//mapping
	pancards1.setLba(lba);
	
	
	
	entityTransaction.begin();
	entityManager.persist(pancards1);
	entityManager.persist(accounts1);
	entityManager.persist(accounts2);
	entityManager.persist(accounts3);
	entityTransaction.commit();
	
	System.out.println("Many To One  unidirection mapping is done");
	
	
	}
	
	

}
