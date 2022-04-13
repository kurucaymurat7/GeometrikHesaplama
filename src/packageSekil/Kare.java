package packageSekil;

public class Kare extends Dikdortgen{

    protected double cevreHesaplamaKare() {
        return cevreHesaplamaKare(kenar);
    }
    protected double alanHesaplamaKare() {
        return alanHesaplamaKare(kenar);
    }

    @Override
    public String toString() {
        return "Kare{" + "Kare cevre = " + cevreHesaplamaKare() + "Kare alan = " + alanHesaplamaKare() + " ";
    }
}
