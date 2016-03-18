package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {

	LinkedList<Valuta> valute = new LinkedList<>();
	@Override
	public void dodajValutu(Valuta valuta) {
		valute.add(valuta);
	}

	@Override
	public void obrisiValutu(Valuta valuta) {
		valute.remove(valuta);

	}

	@Override
	public Valuta pronadjiValutu(String ime, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(ime) && valute.get(i).getDatum().equals(datum))
				return valute.get(i);
		}
		return null;
	}

}
