package builder_V2;

public class AutobuzBuilder implements Builder{
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsi;
    private boolean areOpriri;
    private String textRulat;
    private String model;
    private double nrCalatori;

    public AutobuzBuilder() {
        this.nrLinie = 102;
        this.numeSofer = "Popescu";
        this.deschideUsi = true;
        this.areOpriri = false;
        this.textRulat = "La multi ani";
        this.model = "Mercedes";
        this.nrCalatori = 35;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(this.nrLinie,this.numeSofer,this.deschideUsi,this.areOpriri,this.textRulat,this.model,this.nrCalatori);
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }

    public AutobuzBuilder setAreOpriri(boolean areOpriri) {
        this.areOpriri = areOpriri;
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.textRulat = textRulat;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrCalatori(double nrCalatori) {
        this.nrCalatori = nrCalatori;
        return this;
    }
}
