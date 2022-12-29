package dalis3;

public class PajamuIrasas extends Irasas {

    private final boolean pozymisArIBanka;


    public PajamuIrasas(double suma, String kategorija, String data, boolean pozymisArIBanka, String papildomaInfo) {
        super(suma, data, kategorija, papildomaInfo, "pajamos");
        this.pozymisArIBanka = pozymisArIBanka;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" + "id=" + this.getId()+ ", suma=" + suma + ", kategorija=" + kategorija + ", data=" + data + ", pozymisArIBanka=" + pozymisArIBanka + ", papildomaInfo='" + papildomaInfo + '\'' + '}';
    }
}
