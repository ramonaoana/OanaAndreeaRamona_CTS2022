package factoryMethod;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz "+nrInmatriculare;
    }
}
