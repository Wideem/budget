package dalis3;

import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
    private final ArrayList<Irasas> irasuSarasas = new ArrayList<>();

    //Saugome index of arrayList kad galetumem removint:
    private int irasaiIndex;

    public Biudzetas() {
        this.irasaiIndex = 0;
    }

    private void pridetiIrasa(Irasas irasas) {
        irasuSarasas.add(irasas);
        System.out.println("Irasas sukrutas ir patalpintas " + this.irasaiIndex + " saraso elemente");
        this.irasaiIndex++;
    }

    public Irasas gautiIrasa(int n) {
        return irasuSarasas.get(n);
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
        this.pridetiIrasa(new IslaiduIrasas(suma, dataIrLaikas, kategorija, atsisakitymoBudas, papildomaInfo));
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
        this.pridetiIrasa(new PajamuIrasas(suma, data, kategorija, pozymisArIBanka, papildomaInfo));
    }

    public void gautiIrasa(Scanner sc) {
        System.out.println("iveskite iraso numeri kuri norite gauti:");
        int n = sc.nextInt();
        System.out.println(gautiIrasa(n));
    }

    public double balansas() {
        double suma = 0;
        for (Irasas i : this.irasuSarasas) {
            if (i instanceof IslaiduIrasas) {
                suma -= i.getSuma();
            } else {
                suma += i.getSuma();
            }
        }
        return suma;
    }

    public void pasalintiIrasa(Scanner sc) {
        System.out.println("iveskite iraso numeri kuri norite pasalinti:");
        int n = sc.nextInt();
        irasuSarasas.remove(n);
    }

    public String gautiIslaidasPajamas() {
        String rezutltatas = "";
        for (Irasas i : this.irasuSarasas) {
            rezutltatas += (String.format("%s: %.2f\n", i.irasoTipas, i.getSuma()));
        }
        return rezutltatas;
    }

    public ArrayList<PajamuIrasas> gautiPajamuIrasus() {
        ArrayList<PajamuIrasas> irasai = new ArrayList<>();
        for (Irasas i : this.irasuSarasas) {
            if (i instanceof PajamuIrasas) {
                irasai.add((PajamuIrasas) i);
            }
        }
        return irasai;
    }

    public ArrayList<IslaiduIrasas> gautiIslaiduIrasus() {
        ArrayList<IslaiduIrasas> irasai = new ArrayList<>();
        for (Irasas i : this.irasuSarasas) {
            if (i instanceof IslaiduIrasas) {
                irasai.add((IslaiduIrasas) i);
            }
        }
        return irasai;
    }
}

