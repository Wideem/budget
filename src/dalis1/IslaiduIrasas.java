package dalis1;

public class IslaiduIrasas {
    private double suma;
    private String dataSuLaiku;
    private String kategorija;
    private String atsiskaitymoBudas;
    private String papildomaInfo;

    public IslaiduIrasas(double suma, String dataSuLaiku, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        this.suma = suma;
        this.dataSuLaiku = dataSuLaiku;
        this.kategorija = kategorija;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" +
                "suma=" + suma +
                ", dataSuLaiku=" + dataSuLaiku +
                ", kategorija=" + kategorija +
                ", atsiskaitymoBudas=" + atsiskaitymoBudas +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                '}';
    }
}
