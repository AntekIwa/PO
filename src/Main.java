import Ludzie.Osoba;
import Ludzie.Czlowiek;
import Ludzie.Agent;

public class Main {
    public static void main(String[] args){
        Osoba[] tablica = new Osoba[4];
        int liczbaElementow = 0;
        Osoba[] nowiLudzie = {
                new Czlowiek("Jan", "Kowalski"),
                new Agent("James", "Bond"),
                new Czlowiek("Anna", "Nowak"),
                new Agent("Darth", "Vader"),
                new Czlowiek("Yoda", "Yoda") // Ten element nie zmieści się w początkowej tablicy
        };
        for (Osoba o : nowiLudzie) {
            if (liczbaElementow >= tablica.length) {
                System.out.println("-> Brak miejsca, powiekszamy tablice z: " + tablica.length + " na " + (tablica.length * 2) + ".");
                tablica = BuforCykliczny.powieksz(tablica);
            }
            tablica[liczbaElementow] = o;
            liczbaElementow++;
        }
        for (int i = 0; i < liczbaElementow; i++) {
            tablica[i].przedstawSie();
        }
    }
}
