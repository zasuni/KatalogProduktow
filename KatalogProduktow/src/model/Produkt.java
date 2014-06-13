package model;

import java.io.Serializable;

public class Produkt implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nazwa;
	private String opis;
	private int kategoria;
	private float cena_sp;
	
	public Produkt() {
		 
	}
	
	public Produkt(int id, String nazwa, String opis, int kategoria) {
	
			this.id = id;
			this.nazwa = nazwa;
			this.opis = opis;
			this.kategoria = kategoria;
			
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKategoria() {
		return kategoria;
	}
	public void setKategoria(int kategoria) {
		this.kategoria = kategoria;
	}
	public float getCena_sp() {
		return cena_sp;
	}
	public void setCena_sp(float cena_sp) {
		this.cena_sp = cena_sp;
	}

	
}
