package dalis4;

import java.util.UUID;

public class Irasas {
    protected final String irasoTipas;
    private final UUID id;
    protected double suma;
    protected String data;
    protected String kategorija;
    protected String papildomaInfo;

    public Irasas(double suma, String data, String ketegorija, String papildomaInfo, String irasoTipas) {
        this.suma = suma;
        this.data = data;
        this.kategorija = ketegorija;
        this.papildomaInfo = papildomaInfo;
        this.irasoTipas = irasoTipas;
        this.id = UUID.randomUUID();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getId() {
        return id.toString();
    }

    @Override
    public boolean equals(Object o) {
        Irasas irasas = (Irasas) o; //cast object to irasas
        return id.equals(irasas.id);
    }

    @Override
    public String toString() {
        return "Irasas{" +
                "suma=" + suma +
                ", data='" + data + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                ", id=" + id +
                ", irasoTipas='" + irasoTipas + '\'' +
                '}';
    }
}
