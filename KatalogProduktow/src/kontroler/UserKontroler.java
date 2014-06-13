package kontroler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserKontroler implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<User> userData;
	
	public UserKontroler() {
		userData = new ArrayList<User>();
		generujDaneTestowe();
	}
	
	public boolean checkExist(String username){
		
		boolean wynik=false;
		
		for(User u : userData){
			if(u.getUsername().equalsIgnoreCase(username)){
				wynik=true;
				break;
			}
		}
		
		return wynik;
	}
	
	public boolean checkPassword(String password){
		
		boolean wynik=false;
		
		for(User u : userData){
			if(u.getPassword().equalsIgnoreCase(password)){
				wynik=true;
				break;
			}
		}
		
		return wynik;
	}
	
	private void generujDaneTestowe(){
		userData.add(new User("admin","admin","Tomasz","Za³êski"));
	}
	
}
