package Ludzie;

public class Agent extends Osoba {
    public Agent(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void przedstawSie() {
        System.out.println("nazywam się " + nazwisko + ". " + imie + " " + nazwisko + ".");
    }
}
    