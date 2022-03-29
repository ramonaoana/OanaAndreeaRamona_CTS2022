package factory;

public class Tramvai extends MijlocTransport{
    public Tramvai(int nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai "+nrInmatriculare;
    }
}
