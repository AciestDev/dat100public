package no.hvl.dat100.jplab10.oppgave1;

public class Oppdatering {

    // skriv ut
    private static void skrivUt(int[] tab) {
        System.out.print("[ ");

        for (int x : tab) {
            System.out.print(x + " ");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6};

        skrivUt(tab);

        // oppdater. Det er nødvendig med en vanlig "for løkke" her istendenfor en på utvidet form.
        // Dette er fordi for å endre hver index i tabellen trenger man index-en.
        // Den er ikke tatt i bruk ved utvidet form av løkken
        for (int x = 0; x < tab.length; x++) {
            tab[x] ++;
        }

        skrivUt(tab);
    }

}
