package testy;

import kontroler.ProduktKontroler;
import model.Produkt;

import org.junit.Test;

public class ProduktCase {

	
	ProduktKontroler pk = new ProduktKontroler();
	
	@Test
	public void test() {

		wypiszProdukty();
		
		Produkt pr;
		
		pr=pk.getProduktById(3);
		
		System.out.println();
		System.out.println(pr.getNazwa());
		
		pk.usunProdukt(pr);
		
		wypiszProdukty();
	}
	
	public void wypiszProdukty(){
		for(Produkt p : pk.getProdukty()){
			System.out.println(p.getId()+" ".concat(p.getNazwa()));
		}
	}

}
