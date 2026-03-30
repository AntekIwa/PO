package Ludzie;
public abstract class Osoba {
    public String imie;
    public String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public abstract void przedstawSie();

}
