package dalis3;

import java.util.UUID;

public class Irasas {
    protected final double suma;
    protected final String data;
    protected final String kategorija;
    protected final String papildomaInfo;
    private final UUID id;
    protected final String irasoTipas;

    public Irasas(double suma, String data, String ketegorija, String papildomaInfo, String irasoTipas) {
        this.suma = suma;
        this.data = data;
        this.kategorija = ketegorija;
        this.papildomaInfo = papildomaInfo;
        this.irasoTipas = irasoTipas;
        this.id = UUID.randomUUID();
    }

    public double getSuma() {
        return suma;
    }

    public String getId() {
        return id.toString();
    }

    @Override
    public boolean equals(Object o) {
        Irasas irasas = (Irasas) o; //cast object to irasas
        return id.equals(irasas.id);
    }
}
