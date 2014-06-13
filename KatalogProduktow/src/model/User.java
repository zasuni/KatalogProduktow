package model;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	private String imie;
	private String nazwisko;
	
	public User(){
	 	
	}
	
	public User(String username, String password, String imie, String nazwisko){

		this.username=username;
		this.password=password;
		this.imie=imie;
		this.nazwisko=nazwisko;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public String getUzytkownik() {
		return this.imie.concat(this.nazwisko);
	}

}
