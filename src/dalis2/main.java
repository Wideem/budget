package dalis2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        boolean runProgram = true;
        Scanner sc = new Scanner(System.in);
        while (runProgram) {
            System.out.println("i - prideti islaidu irasa");
            System.out.println("p - prideti pajamu irasa");
            System.out.println("g - gauti islaidu irasa");
            System.out.println("k - gauti pajamu irasa");
            System.out.println("b - gauti balansa");
            System.out.println("n - gauti visas islaidas ir pajamas");
            System.out.println("z - pasalinti islaidu irasa");
            System.out.println("x - pasalinti pajamu irasa");
            char c = sc.next().charAt(0);
            switch (c) {
                case 'i' -> biudzetas.pridetiIslaiduIrasa(sc);
                case 'p' -> biudzetas.pridetiPajamuIrasa(sc);
                case 'g' -> biudzetas.gautiIrasa(sc, "i");
                case 'k' -> biudzetas.gautiIrasa(sc, "p");
                case 'b' -> System.out.println(biudzetas.balansas());
                case 'n' -> System.out.println(biudzetas.gautiIslaidasPajamas());
                case 'z' -> biudzetas.pasalintiIrasa(sc, "i");
                case 'x' -> biudzetas.pasalintiIrasa(sc, "p");
                default -> {
                    break;
                }

            }

        }
        sc.close();
    }


}

