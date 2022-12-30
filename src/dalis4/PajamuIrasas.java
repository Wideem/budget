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

    @Override
    public String getCsvValue(){
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.irasoTipas, this.suma, this.kategorija, this.data, this.pozymisArIBanka, this.papildomaInfo);
    }
}
