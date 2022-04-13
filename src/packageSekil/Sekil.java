package packageSekil;

public class Sekil {

    protected int uzunkenar;
    protected int kisakenar;
    protected int kenar;
    protected double yaricap;

    public Sekil() {
    }

    public Sekil(int uzunkenar, int kisakenar) {
        this.uzunkenar = uzunkenar;
        this.kisakenar = kisakenar;
    }

    public Sekil(int kenar) {
        this.kenar = kenar;
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    protected double cevreHesaplamaDikdortgen(int uzunkenar, int kisakenar) {
        return (uzunkenar+kisakenar)*2;
    }
    protected double cevreHesaplamaKare(int kenar) {
        return (kenar)*4;
    }
    protected double cevreHesaplamaCember(double yaricap) {
        return (yaricap)*2*3.14;
    }

    protected double alanHesaplamaDikdortgen(int uzunkenar, int kisakenar) {
        return (uzunkenar*kisakenar);
    }
    protected double alanHesaplamaKare(int kenar) {
        System.out.println("alan hesaplama kare");
        return (kenar*kenar);
    }
    protected double alanHesaplamaCember(double yaricap) {
        return (yaricap)*(yaricap)*3.14;
    }
}
