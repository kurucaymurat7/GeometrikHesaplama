package packageSekil;

public class Cember extends Sekil{
    protected double cevreHesaplamaCember() {
        return cevreHesaplamaCember(yaricap);
    }
    protected double alanHesaplamaCember() {
        return alanHesaplamaCember(yaricap);
    }

    @Override
    public String toString() {
        return "Cember{" + "Cember cevre = " + cevreHesaplamaCember() + "Cember alan = " + alanHesaplamaCember() + '}';
    }
}
