package no.hvl.dat100.jplab10.oppgave1;

public class DataTabell {

    private static void skrivUt(Data[] tab) {
        System.out.print("[ ");

        for (Data x : tab) {
            System.out.print(x + " ");
        }

        System.out.print("]");
    }
	
	public static void main(String[] args) {
	
		Data[] tab = new Data[3];
		
		tab[0] = new Data(1);
		tab[1] = new Data(2);
		tab[2] = new Data(3);
		
		skrivUt(tab);

		System.out.println();

        // Selv om utvidet form er tatt i bruk her, endrer vi ikke hver index med å gå igjennom index-ene i listen.
        // Vi henter hver index ved "getMetoden" fra "Data", og endrer hver av de med "setMetoden".
		for (Data d : tab) {
			d.setData(d.getData() + 1);
		}
		
		
		skrivUt(tab);
		System.out.println();
		
	}
}
