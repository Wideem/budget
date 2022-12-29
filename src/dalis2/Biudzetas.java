package dalis2;

import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
    private final ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    private final ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
    //Saugome index of arrayList kad galetumem removint:
    private int pajamuIrasasIndex;
    private int ilsaiduIrasasIndex;

    public Biudzetas() {
        this.pajamuIrasasIndex = 0;
        this.ilsaiduIrasasIndex = 0;
    }

    private void pridetiPajamuIrasa(PajamuIrasas irasas) {
        pajamos.add(irasas);
        System.out.println("Pajamu irasas sukrutas ir patalpintas " + this.pajamuIrasasIndex + " saraso elemente");
        this.pajamuIrasasIndex++;
    }

    private void pridetiIslaiduIrasa(IslaiduIrasas irasas) {
        islaidos.add(irasas);
        System.out.println("Islaidu irasas sukrutas ir patalpintas " + this.ilsaiduIrasasIndex + " saraso elemente");
        this.ilsaiduIrasasIndex++;
    }


    public PajamuIrasas gautiPajamuIrasa(int n) {
        return pajamos.get(n);
    }

    public IslaiduIrasas gautiIslaiduIrasa(int n) {
        return islaidos.get(n);
    }

    public void pridetiIslaiduIrasa(Scanner sc) {
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
        this.pridetiIslaiduIrasa(new IslaiduIrasas(suma, dataIrLaikas, kategorija, atsisakitymoBudas, papildomaInfo));
    }

    public void pridetiPajamuIrasa(Scanner sc) {
        System.out.println("iveskite suma:");
        double suma = sc.nextDouble();
        System.out.println("iveskite data");
        String data = sc.next();
        System.out.println("iveskite kategorija:");
        String kategorija = sc.next();
        System.out.println("iveskite Ar i banka (True/False):");
        Boolean pozymisArIBanka = sc.nextBoolean();
        System.out.println("iveskite papildoma info:");
        String papildomaInfo = sc.next();
        this.pridetiPajamuIrasa(new PajamuIrasas(suma, data, kategorija, pozymisArIBanka, papildomaInfo));
    }

    public void gautiIrasa(Scanner sc, String islaiduTipas) {
        System.out.println("iveskite iraso numeri kuri norite gauti:");
        int n = sc.nextInt();
        if (islaiduTipas == "p") {
            System.out.println(gautiPajamuIrasa(n));
        } else {
            System.out.println(gautiIslaiduIrasa(n));
        }
    }

    public double balansas() {
        double suma = 0;
        for (PajamuIrasas pajamos : this.pajamos) {
            suma += pajamos.getSuma();
        }
        for (IslaiduIrasas islaidos : this.islaidos) {
            suma -= islaidos.getSuma();
        }
        return suma;
    }

    public void pasalintiIrasa(Scanner sc, String islaiduTipas) {
        System.out.println("iveskite iraso numeri kuri norite pasalinti:");
        int n = sc.nextInt();
        if (islaiduTipas == "p") {
            pajamos.remove(n);
        } else {
            islaidos.remove(n);
        }
    }

    public String gautiIslaidasPajamas() {
        String rezutltatas = "";
        for (PajamuIrasas pajamos : this.pajamos) {
            rezutltatas += (String.format("Pajamos: %.2f\n", pajamos.getSuma()));
        }
        for (IslaiduIrasas islaidos : this.islaidos) {
            rezutltatas += (String.format("Islaidos: %.2f\n", islaidos.getSuma()));
        }
        return rezutltatas;
    }
}

