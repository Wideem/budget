package dalis3;

public class IslaiduIrasas extends Irasas {

    private final String atsiskaitymoBudas;

    public IslaiduIrasas(double suma, String data, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        super(suma, data, kategorija, papildomaInfo, "islaidos");
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" + "id=" + this.getId()+ ", suma=" + suma + ", data=" + data + ", kategorija=" + kategorija + ", atsiskaitymoBudas=" + atsiskaitymoBudas + ", papildomaInfo='" + papildomaInfo + '\'' + '}';
    }
}
