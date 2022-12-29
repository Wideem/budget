package dalis2;

public class PajamuIrasas {
    private final double suma;
    private final String data;
    private final String kategorija;
    private final boolean pozymisArIBanka;
    private final String papildomaInfo;

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "suma=" + suma +
                ", kategorija=" + kategorija +
                ", data=" + data +
                ", pozymisArIBanka=" + pozymisArIBanka +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                '}';
    }

    public PajamuIrasas(double suma, String kategorija, String data, boolean pozymisArIBanka, String papildomaInfo) {
        this.suma = suma;
        this.kategorija = kategorija;
        this.data = data;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaInfo;
    }
}
