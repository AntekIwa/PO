import Ludzie.Osoba;
import Ludzie.Czlowiek;
import Ludzie.Agent;

public class Main {
    public static void main(String[] args){

       // testUlamkow();
        testBufora();
    }

    static void testBufora(){
        BuforCykliczny bufor = new BuforCykliczny();
        Ulamek u1 = new Ulamek(4, 8);
        Ulamek u2 = new Ulamek(2, -1);
        Ulamek u3 = new Ulamek(0, 5);
        bufor.dodaj(u1);
        bufor.dodaj(u2);
        bufor.dodaj(u3);
        bufor.wypisz();
        System.out.println(bufor.pobierz());
        bufor.wypisz();
        System.out.println(bufor.pobierz());
        bufor.wypisz();
        System.out.println(bufor.pobierz());
        bufor.wypisz();
        System.out.println(bufor.pobierz());

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
