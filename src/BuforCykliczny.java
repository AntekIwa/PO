import Ludzie.Osoba;

public class BuforCykliczny {

    private Osoba[] tablica = new Osoba [4];
    private int pojemnosc = 4;
    private int rozmiar = 0;
    private int poczatek = 0;

    private void powieksz()
    {
        Osoba[] nowy = new Osoba[pojemnosc * 2];

        for(int i = 0; i < rozmiar; i++)  
            nowy[i] = tablica[(poczatek + i) % pojemnosc];

        pojemnosc *= 2;
        poczatek = 0;
        tablica = nowy;
    }

    private void pomniejsz()
    {
        Osoba[] nowy = new Osoba[pojemnosc / 2];

        for(int i = 0; i < rozmiar; i++)
            nowy[i] = tablica[(poczatek + i) % pojemnosc];

        pojemnosc /= 2;
        poczatek = 0;
        tablica = nowy;
    }

    public boolean pusty()
    {
        return rozmiar == 0;
    }

    public void dodaj(Osoba elem)
    {
        if(rozmiar == pojemnosc) powieksz();
        tablica[(poczatek + rozmiar) % pojemnosc] = elem;
        rozmiar++;
    }

    public Osoba pobierz()
    {
        if(pusty()) return null;
        Osoba o = tablica[poczatek];
        rozmiar--;
        poczatek = (poczatek + 1)  % pojemnosc;
        if(pojemnosc > 8 && rozmiar <= pojemnosc / 4) pomniejsz();
        return o;
    }

    public void wypisz()
    {
        String wynik = "[";
        for(int i = 0; i < rozmiar - 1 ; i++)
        {
            wynik += tablica[(poczatek + i) % pojemnosc] + ",";
        }
        if(rozmiar > 0) wynik += tablica[(poczatek + rozmiar - 1) % pojemnosc];
        wynik += "]";
        System.out.println(wynik);
    }
}
