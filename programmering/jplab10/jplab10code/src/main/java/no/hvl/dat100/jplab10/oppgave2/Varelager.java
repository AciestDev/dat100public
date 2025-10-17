package no.hvl.dat100.jplab10.oppgave2;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		varer = new Vare[n];
        antall = 0;

	}
	
	public Vare[] getVarer() {
		
		return varer;

	}
	
	public boolean leggTilVare(Vare v) {

        boolean inserted = true;

        if (antall >= varer.length) {
            System.out.println("Doesn't work. Pls fix code lmao");
            inserted = false;
        } else if (varer[antall] == null) {
            varer[antall] = v;
        }

        do {
            antall++;
        } while (antall < varer.length && varer[antall] != null);

        return inserted;


	}
	
	public boolean leggTil(int varenr, String navn, double pris) {

        Vare v = new Vare(varenr, navn, pris);

        return leggTilVare(v);

	}
	
	public Vare finnVare(int varenr) {


		for (int i = 0; i < varer.length; i++) {
            if (varer[i].getVarenr() == varenr) {
                return varer[i];
            }
        }

        return null;
    }
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
		for (int i = 0; i < varer.length; i++) {
            System.out.println(varer[i].toString());
        }
        System.out.println(SEP);

	}
	
}
