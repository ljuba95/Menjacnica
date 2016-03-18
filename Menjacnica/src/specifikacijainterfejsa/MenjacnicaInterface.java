package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterface {
	
	public void dodajValutu(Valuta valuta);
	public void obrisiValutu(Valuta valuta);
	public Valuta pronadjiValutu(String ime, GregorianCalendar datum);
}
