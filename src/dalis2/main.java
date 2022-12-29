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
            char c = sc.next().charAt(0);
            switch (c) {
                case 'i' -> biudzetas.pridetiIslaiduIrasa(sc);
                case 'p' -> biudzetas.pridetiPajamuIrasa(sc);
                case 'g' -> biudzetas.gautiIslaiduIrasa(sc);
                case 'k' -> biudzetas.gautiPajamuIrasa(sc);
                default -> {
                    break;
                }

            }

        }
        sc.close();
    }


}

