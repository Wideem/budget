package dalis1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        boolean runProgram = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("i - prideti islaidu irasa");
        System.out.println("p - prideti pajamu irasa");
        while(runProgram){
            System.out.println("run");
            sc.nextLine();
            char c = sc.next().charAt(0);
            switch (c){
                  case 'i' -> naujasIrasas(biudzetas);
                default -> {break;
                }

            }

        }
        sc.close();
    }

     static void naujasIrasas(Biudzetas biudzetas){
         Scanner sc = new Scanner(System.in);
         System.out.println("iveskite suma:");
         double suma = sc.nextDouble();
         System.out.println("iveskite data ir laika:");
         String dataIrLaikas = sc.next();
         System.out.println("iveskite kategorija:");
         String kategorija = sc.next();
         System.out.println("iveskite atsiskaitymo buda:");
         String atsisakitymoBudas = sc.next();
         System.out.println("iveskite papildoma info:");
         String papildomaInfo = sc.next();
         sc.nextLine();
         sc.close();
         biudzetas.pridetiIslaiduIrasa(new IslaiduIrasas(suma,dataIrLaikas, kategorija, atsisakitymoBudas,papildomaInfo));
     }

}

