package dalis4;

public class IslaiduIrasas extends Irasas {

    private String atsiskaitymoBudas;

    public IslaiduIrasas(double suma, String data, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        super(suma, data, kategorija, papildomaInfo, "islaidos");
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" + "id=" + this.getId() + ", suma=" + suma + ", data=" + data + ", kategorija=" + kategorija + ", atsiskaitymoBudas=" + atsiskaitymoBudas + ", papildomaInfo='" + papildomaInfo + '\'' + '}';
    }
    @Override
    public String getCsvValue(){
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.irasoTipas, this.suma, this.kategorija, this.data, this.atsiskaitymoBudas, this.papildomaInfo);
    }
}
