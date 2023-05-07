package unidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



//One to Many ex program

@Entity
public class Pancards1 {
@Id
private int panid;
private String name;
private long phone;
@ManyToOne
	
	List<BankAccounts1> lba;
public int getPanid() {
	return panid;
}
public void setPanid(int panid) {
	this.panid = panid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public List<BankAccounts1> getLba() {
	return lba;
}
public void setLba(List<BankAccounts1> lba) {
	this.lba = lba;
}


}
