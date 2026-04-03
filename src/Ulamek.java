import java.sql.SQLOutput;

public class Ulamek {
    private int licznik;
    private int mianownik;

    Ulamek(int licznik, int mianownik){
        this.licznik = licznik;
        this.mianownik = mianownik;
        if(mianownik == 0){
            System.out.println("mianownik nie moze byc 0!");
            System.exit(1);
        }
    }

    public int getLicznik(){
        return licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    private int nwd(int a, int b){
        if(b == 0) return a;
        return nwd(b, a%b);
    }

    private void skroc(){
        int gcd = nwd(licznik, mianownik);
        licznik /= gcd;
        mianownik /= gcd;
        if(licznik < 0 && mianownik < 0){
            licznik *= -1;
            mianownik *= -1;
        }
        else if(licznik > 0 && mianownik < 0){
            licznik *= -1;
            mianownik *= -1;
        }
    }

    void dodaj(Ulamek ulamek){
        int gcd = nwd(mianownik, ulamek.getMianownik());
        int nww = mianownik/gcd * ulamek.getMianownik();
        licznik *= nww/mianownik;
        licznik += ulamek.getLicznik() * nww / ulamek.getMianownik();
        mianownik = nww;
        skroc();
    }
    void dodaj(int liczba){
        dodaj(new Ulamek(liczba, 1));
    }

    void odejmij(Ulamek ulamek){
        int gcd = nwd(mianownik, ulamek.getMianownik());
        int nww = mianownik/gcd * ulamek.getMianownik();
        licznik *= nww/mianownik;
        licznik -= ulamek.getLicznik() * nww / ulamek.getMianownik();
        mianownik = nww;
        skroc();
    }
    void odejmij(int liczba){
        odejmij(new Ulamek(liczba, 1));
    }

    void pomnoz(Ulamek ulamek){
        licznik *= ulamek.getLicznik();
        mianownik *= ulamek.getMianownik();
        skroc();
    }
    public void pomnoz(int liczba){
        pomnoz(new Ulamek(liczba, 1));
    }


    void podziel(Ulamek ulamek){
        if(ulamek.getLicznik() == 0){
            System.out.println("nie mozna dzielic przez 0!!!");
        }
        else{
            licznik *= ulamek.getMianownik();
            mianownik *= ulamek.getLicznik();
        }
    }
    public void podziel(int liczba){
        if(liczba == 0) {
            System.out.println("nie mozna dzielic przez 0!!!");
        }
        else{
            podziel(new Ulamek(liczba, 1));
        }
    }

    public String toString()
    {
        skroc();
        if(mianownik == 1) return licznik + "";
        else if(licznik == 0) return "0";
        else return licznik + " / " + mianownik;
    }
}
