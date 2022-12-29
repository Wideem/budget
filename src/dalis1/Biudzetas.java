package dalis1;

import java.util.Arrays;
import java.util.Scanner;

public class Biudzetas {
    //Saugome index of array kad zinotumet kur pridet:
    private int pajamuIrasasIndex;
    private int ilsaiduIrasasIndex;
    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    public Biudzetas() {
        this.pajamuIrasasIndex = 0;
        this.ilsaiduIrasasIndex = 0;
    }

    private void pridetiPajamuIrasa(PajamuIrasas irasas) {
        pajamos[this.pajamuIrasasIndex] = irasas;
        System.out.println("Pajamu irasas sukrutas ir patalpintas " + this.pajamuIrasasIndex + " masyvo elemente");
    }

    private void pridetiIslaiduIrasa(IslaiduIrasas irasas) {
        islaidos[this.ilsaiduIrasasIndex] = irasas;
        System.out.println("Islaidu irasas sukrutas ir patalpintas " + this.ilsaiduIrasasIndex + " masyvo elemente");
    }


    public PajamuIrasas gautiPajamuIrasa(int n) {
        return pajamos[n];
    }

    public IslaiduIrasas gautiIslaiduIrasa(int n) {
        return islaidos[n];
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

    public void gautiPajamuIrasa(Scanner sc) {
        System.out.println("iveskite iraso numeri kuri norite gauti:");
        int n = sc.nextInt();
        System.out.println(pajamos[n]);

    }

    public void gautiIslaiduIrasa(Scanner sc) {
        System.out.println("iveskite iraso numeri kuri norite gauti:");
        int n = sc.nextInt();
        System.out.println(islaidos[n]);
    }
}

