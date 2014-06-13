package kontroler;

import java.util.ArrayList;
import java.util.List;

import model.Produkt;
 
public class ProduktKontroler {
	
	private List<Produkt> produkty;
	private int lastId = 1;
	
	public ProduktKontroler() {
		produkty = new ArrayList<Produkt>();
		generujDaneTestowe();
	}
		
	public void dodajNowy(String nazwa, String opis, int kategoria) {
		
		produkty.add(new Produkt(lastId++, nazwa ,opis ,kategoria ));
				
	}	 
	
	public void usunProdukt(Produkt produkt) {
		
		produkty.remove(produkt);
		
	} 
		
	public List<String> getKategorie() {
		
	    List<String> list = new ArrayList<String>();
	    list.add(new String("Laptopy"));
	    list.add(new String("Monitory"));
	    list.add(new String("Karty graficzne"));
	    
	    return list;
	}

	public List<Produkt> getProdukty() {
		  
		return produkty;
	}
	
	public Produkt getProduktById(int id){
		
		Produkt prod = null;
		
		for(Produkt p : produkty){
			if(p.getId()==id){
				prod=p;
				break;
			}
		}
		
		return prod;
	}

	public void generujDaneTestowe(){
		produkty.add(new Produkt(lastId++, "ASUS G750JX-T4191H","Laptop dla graczy – mocna konfiguracja i najwy¿sza wydajnoœæ.",1));
		produkty.add(new Produkt(lastId++, "Samsung ATIV Book 9 Lite","Przemyœlany w ka¿dym detalu. Pracuj i baw siê bez ograniczeñ dziêki czterordzeniowemu procesorowi Samsung Quad-Core, gotów do pracy w 8 sekund dziêki dyskowi SSD 128 GB",1));

		produkty.add(new Produkt(lastId++, "21,5 cali, LG 22EN33S-B Czarny","Monitor wykonany w technologii LED* Nastêpc¹ jest model 22M35A",2));
		produkty.add(new Produkt(lastId++, "24 cali, iiyama ProLite E2483HS czarny","D-Sub, DVI-D, HDMI, Monitor z USB , matryca AMVA",2	));
		produkty.add(new Produkt(lastId++, "23 cali, Dell P2314H + G³oœniki AX210CR GRATIS!!!","Gwarancja 0 martwych pikseli – 3 lata! * Nastêpca modelu 23'' Dell U2312HM * G³oœniki AX210CR o wartoœci 100 z³ - GRATIS!!!",2));

		produkty.add(new Produkt(lastId++, "GeForce GTX 680 EVGA 2GB 2xDVI&HDMI&DP (PCI-E) z NVIDIA GeForce Experience™","Zapewnij sobie najlepsze wra¿enia w trakcie rozgrywki dziêki sterownikom graficznym NVIDIA z oprogramowaniem GeForce Experience™, automatycznie optymalizuj¹cym gry ju¿ po jednym klikniêciu mysz¹.",3));
		produkty.add(new Produkt(lastId++, "Radeon R9 290 Club3D 4GB 975/5000MHz DP&HDMI&2xDVI (PCI-E) Royal King","",3));
	}


} 	


