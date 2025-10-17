package no.hvl.dat100.jplab10.oppgave2;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {

        Vare v = new Vare(0,"temp",0.0);

		for (int i=0; i<varer.length-1; i++) {
            if (varer[i].erBilligereEnn(varer[i+1])) {
                v = varer[i];
            } else {
                v = varer[i+1];
            }
        }
        return v;
	}
	
	public static double totalPris(Vare[] varer) {		
		
		throw new TODO("totalPris");

	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		throw new TODO("finnVarenr");

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		throw new TODO("finnPrisDifferanser");

	}
}
