package packageSekil;

public class Dikdortgen extends Sekil {

    protected double cevreHesaplamaDikdortgen() {
        return cevreHesaplamaDikdortgen(uzunkenar,kisakenar);
    }

    protected double alanHesaplamaDikdortgen() {
        return alanHesaplamaDikdortgen(uzunkenar,kisakenar);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" + "Dikdortgen cevresi = " + cevreHesaplamaDikdortgen() +
                ", Dikdortgen alani = " + alanHesaplamaDikdortgen() + '}';
    }
}
