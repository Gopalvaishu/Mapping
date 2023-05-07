package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class BankAccounts1 {
@Id
private long accountid;
private String name;
private long phone;
public long getAccountid() {
	return accountid;
}
public void setAccountid(long accountid) {
	this.accountid = accountid;
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











}
