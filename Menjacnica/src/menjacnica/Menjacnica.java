package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {

	private LinkedList<Valuta> valute = new LinkedList<>();
	@Override
	public void dodajValutu(Valuta valuta) {
		if(valuta != null)
			valute.add(valuta);
		else
			throw new RuntimeException("Valuta ne sme biti null.");

	}

	@Override
	public void obrisiValutu(Valuta valuta) {
		if(valuta != null)
			valute.remove(valuta);
		else
			throw new RuntimeException("Valuta ne sme biti null.");

	}

	@Override
	public Valuta pronadjiValutu(String ime, GregorianCalendar datum) {
		for (Valuta valuta : valute) {
			if((valuta.getNaziv().equals(ime) || valuta.getKraciNaziv().equals(ime))
					&& valuta.getDatum().equals(datum))
				return valuta;
		}
		return null;
	}

}
