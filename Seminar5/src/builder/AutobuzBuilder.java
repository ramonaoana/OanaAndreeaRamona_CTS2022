package builder;

public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;


    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder() {
        this.autobuz =new Autobuz(25,"Marian", true, true, "Ora 9","RT",25);
    }

    public AutobuzBuilder setNrLinie(int nrLinie){
        this.autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer){
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setDeschideUsi(Boolean deschideUsi){
        this.autobuz.setDeschideUsi(deschideUsi);
        return this;
    }

    public AutobuzBuilder setAreOpriri(Boolean areOpriri){
        this.autobuz.setAreOpriri(areOpriri);
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat){
        this.autobuz.setTextRulat(textRulat);
        return this;
    }

    public AutobuzBuilder setModel(String model){
        this.autobuz.setModel(model);
        return this;
    }

    public AutobuzBuilder setNrPersoane(Double nrPersoane){
        this.autobuz.setNrCalatori(nrPersoane);
        return this;
    }
    

}
