package Ludzie;

public class Czlowiek extends Osoba{
    public Czlowiek(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void przedstawSie() {
        System.out.println("nazywam się " + imie + " " + nazwisko + ".");
    }
}
