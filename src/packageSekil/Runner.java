package packageSekil;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cember cember = new Cember();
        System.out.println("Cember yaricap (double) giriniz: ");
        cember.yaricap = scan.nextDouble();
        cember.cevreHesaplamaCember();
        cember.alanHesaplamaCember();
        System.out.println(cember);

        Kare kare = new Kare();
        System.out.println("Kare kenar (int) giriniz: ");
        kare.kenar = scan.nextInt();
        kare.cevreHesaplamaKare();
        kare.alanHesaplamaKare();
        System.out.println(kare);

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println("Dikdortgen uzun kenar (int) giriniz: ");
        dikdortgen.uzunkenar = scan.nextInt();
        System.out.println("Dikdortgen kisa kenar (int) giriniz: ");
        dikdortgen.kisakenar = scan.nextInt();
        dikdortgen.cevreHesaplamaDikdortgen();
        dikdortgen.alanHesaplamaDikdortgen();
        System.out.println(dikdortgen);
    }
}
