import Ludzie.Osoba;

public class BuforCykliczny {
    public static Osoba[] powieksz(Osoba[] bufor){
        Osoba[] nowy = new Osoba[bufor.length*2];
        for(int i = 0; i < bufor.length; i++){
            nowy[i] = bufor[i];
        }
        return nowy;
    }
    public static Osoba[] pomniejsz(Osoba[] bufor){
        Osoba[] nowy = new Osoba[bufor.length/2];
        for(int i = 0; i < bufor.length/4; i++){
            nowy[i] = bufor[i];
        }
        return nowy;
    }
}
