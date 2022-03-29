package factoryMethod;

public class Autobuz extends MijlocTransport {

    public Autobuz(int nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz "+nrInmatriculare;
    }
}
