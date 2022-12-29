package dalis1;

public class PajamuIrasas {
    private int suma;
    private int kategorijosIndeksas;
    private int data;
    private  int pozymisArIBanka;
    private String papildomaInfo;

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "suma=" + suma +
                ", kategorijosIndeksas=" + kategorijosIndeksas +
                ", data=" + data +
                ", pozymisArIBanka=" + pozymisArIBanka +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                '}';
    }

    public PajamuIrasas(int suma, int kategorijosIndeksas, int data, int pozymisArIBanka, String papildomaInfo) {
        this.suma = suma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.data = data;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaInfo;
    }
}
