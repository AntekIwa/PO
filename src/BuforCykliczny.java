import Ludzie.Osoba;

public class BuforCykliczny {

    private Ulamek[] tablica = new Ulamek [4];
    private int pojemnosc = 4;
    private int rozmiar = 0;
    private int poczatek = 0;

    private void powieksz()
    {
        Ulamek[] nowy = new Ulamek[pojemnosc * 2];

        for(int i = 0; i < rozmiar; i++)  
            nowy[i] = tablica[(poczatek + i) % pojemnosc];

        pojemnosc *= 2;
        poczatek = 0;
        tablica = nowy;
    }

    private void pomniejsz()
    {
        Ulamek[] nowy = new Ulamek[pojemnosc / 2];

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

    public void dodaj(Ulamek elem)
    {
        if(rozmiar == pojemnosc) powieksz();
        tablica[(poczatek + rozmiar) % pojemnosc] = elem;
        rozmiar++;
    }

    public Ulamek pobierz()
    {
        if(pusty()) return null;
        Ulamek ulamek = tablica[poczatek];
        rozmiar--;
        poczatek = (poczatek + 1)  % pojemnosc;
        if(pojemnosc > 8 && rozmiar <= pojemnosc / 4) pomniejsz();
        return ulamek;
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
