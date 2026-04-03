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
                new Czlowiek("Yoda", "Yoda") 
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

        testUlamkow();
    }

    static void testUlamkow(){

       Ulamek u1 = new Ulamek(4, 8);
       System.out.println("4/8 po skroceniu: " + u1); 

       Ulamek u2 = new Ulamek(2, 1);
       System.out.println("2/1 po skroceniu: " + u2); 

       Ulamek u3 = new Ulamek(0, 5);
       System.out.println("0/5 po skroceniu: " + u3); 


       // Dodawanie
       Ulamek dodawanie1 = new Ulamek(1, 2);
       Ulamek dodawanie2 = new Ulamek(1, 3);
       dodawanie1.dodaj(dodawanie2);
       System.out.println("1/2 + 1/3 = " + dodawanie1); 

       // Dodawanie liczby calkowitej
       Ulamek dodawanieLiczby = new Ulamek(1, 2);
       dodawanieLiczby.dodaj(2);
       System.out.println("1/2 + 2 = " + dodawanieLiczby); 

       // Odejmowanie
       Ulamek odejmowanie1 = new Ulamek(3, 4);
       Ulamek odejmowanie2 = new Ulamek(1, 4);
       odejmowanie1.odejmij(odejmowanie2);
       System.out.println("3/4 - 1/4 = " + odejmowanie1); 

       // mnozenie
       Ulamek mnozenie1 = new Ulamek(2, 3);
       Ulamek mnozenie2 = new Ulamek(3, 4);
       mnozenie1.pomnoz(mnozenie2);
       System.out.println("2/3 * 3/4 = " + mnozenie1); 

       // Dzielenie
       Ulamek dzielenie1 = new Ulamek(1, 2);
       Ulamek dzielenie2 = new Ulamek(1, 4);
       dzielenie1.podziel(dzielenie2);
       System.out.println("1/2 / 1/4 = " + dzielenie1); 

        // liczby ujemne
       Ulamek ujemny = new Ulamek(1, -2);
       System.out.println("1/-2 po utworzeniu: " + ujemny); 

       Ulamek ujemny2 = new Ulamek(-1, 2);
       ujemny.dodaj(ujemny2);
       System.out.println("-1/2 + (-1/2) = " + ujemny); 
   }
}
