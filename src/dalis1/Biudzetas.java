package dalis1;

import java.util.Arrays;

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

    public void pridetiPajamuIrasa(PajamuIrasas irasas){
        pajamos[this.pajamuIrasasIndex] = irasas;
    }

    public void pridetiIslaiduIrasa(IslaiduIrasas irasas){
        islaidos[this.ilsaiduIrasasIndex] = irasas;
    }


    public PajamuIrasas gautiPajamuIrasa(int n){
        return pajamos[n];
    }
    public IslaiduIrasas gautiIslaiduIrasa(int n){
        return islaidos[n];
    }
}
