package builder;

public class Autobuz {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsi;
    private boolean areOpriri;
    private String textRulat;
    private String model;
    private double nrCalatori;

    Autobuz(int nrLinie, String numeSofer, boolean deschideUsi, boolean areOpriri, String textRulat, String model, double nrCalatori) {
        this.nrLinie = nrLinie;
        this.numeSofer = numeSofer;
        this.deschideUsi = deschideUsi;
        this.areOpriri = areOpriri;
        this.textRulat = textRulat;
        this.model = model;
        this.nrCalatori = nrCalatori;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    void setAreOpriri(boolean areOpriri) {
        this.areOpriri = areOpriri;
    }

    void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setNrCalatori(double nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", areOpriri=").append(areOpriri);
        sb.append(", textRulat='").append(textRulat).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append('}');
        return sb.toString();
    }
}
