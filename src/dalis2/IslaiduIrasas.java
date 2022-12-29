package dalis2;

public class IslaiduIrasas {
    private final double suma;
    private final String dataSuLaiku;
    private final String kategorija;
    private final String atsiskaitymoBudas;
    private final String papildomaInfo;

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
