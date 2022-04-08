package chap17.Ex16;

import java.util.Objects;


public class Account {
	private String ano ;  // 계좌번호
	private String owner ;  // 이름
	private int balance;  // 통장금액 
	
	Account(){}
	
	Account(String ano , String owner , int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
				
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balane) {
		this.balance = balane;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			if(this.ano.equals(((Account)obj).ano)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ano);
	}
	
}
