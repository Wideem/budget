package dalis4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        biudzetas.pridetiIrasa(new IslaiduIrasas(120, "2022-01-12", "Baldai", "Kortele", "Ikea"));
        biudzetas.pridetiIrasa(new PajamuIrasas(120, "2022-01-12", "Atlyginimas", true, "atlyginimas"));
        boolean runProgram = true;
        Scanner sc = new Scanner(System.in);
        while (runProgram) {
            System.out.println("i - prideti islaidu irasa");
            System.out.println("p - prideti pajamu irasa");
            System.out.println("g - gauti Irasus");
            System.out.println("b - gauti balansa");
            System.out.println("n - gauti visas islaidas ir pajamas");
            System.out.println("z - pasalinti irasa");
            System.out.println("r - redaguoti irasa");
            System.out.println("5 - issaugoti duomenis i faila");
            System.out.println("6 - gauti duomenis is failo");
            char c = sc.next().charAt(0);
            switch (c) {
                case 'i' -> biudzetas.pridetiIrasa(sc, "islaidos");
                case 'p' -> biudzetas.pridetiIrasa(sc, "pajamos");
                case 'g' -> biudzetas.gautiIrasa(sc);
                case 'b' -> System.out.println(biudzetas.balansas());
                case 'n' -> System.out.println(biudzetas.gautiIslaidasPajamas());
                case 'z' -> biudzetas.pasalintiIrasa(sc);
                case 'r' -> biudzetas.readaguotiIrasa(sc);
                case '5' -> biudzetas.issaugoti();
                case '6' -> biudzetas.nuskaityiFaila();
                default -> {
                    break;
                }

            }

        }
        sc.close();
    }


}

