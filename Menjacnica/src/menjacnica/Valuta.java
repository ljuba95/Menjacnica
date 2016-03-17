package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv, kraciNaziv;
	private double prodajni, kupovni, srednji;
	private GregorianCalendar datum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getKraciNaziv() {
		return kraciNaziv;
	}
	public void setKraciNaziv(String kraciNaziv) {
		this.kraciNaziv = kraciNaziv;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kraciNaziv == null) ? 0 : kraciNaziv.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kraciNaziv == null) {
			if (other.kraciNaziv != null)
				return false;
		} else if (!kraciNaziv.equals(other.kraciNaziv))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [Naziv: " + naziv + ", Kraci naziv: " + kraciNaziv + ", Prodajni kurs: " + prodajni + ", Kupovni kurs: "
				+ kupovni + ", Srednji kurs: " + srednji + ", Datum: " + datum + "]";
	}

}
