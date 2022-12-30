package dalis4;

public class PajamuIrasas extends Irasas {

    private boolean pozymisArIBanka;

    public PajamuIrasas(double suma, String data, String kategorija, boolean pozymisArIBanka, String papildomaInfo) {
        super(suma, data, kategorija, papildomaInfo, "pajamos");
        this.pozymisArIBanka = pozymisArIBanka;
    }

    public boolean isPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(boolean pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" + "id=" + this.getId() + ", suma=" + suma + ", kategorija=" + kategorija + ", data=" + data + ", pozymisArIBanka=" + pozymisArIBanka + ", papildomaInfo='" + papildomaInfo + '\'' + '}';
    }
}
