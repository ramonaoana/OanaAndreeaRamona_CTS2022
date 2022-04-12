package composite_classes;

import java.util.function.DoubleToIntFunction;

public class Autobuz implements Nod{
    String producator;
    String model;
    int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adauga(Nod nod) throws Exception {
        throw new Exception("nu a fost implementat");
    }

    @Override
    public void sterge(Nod nod) throws Exception {
        throw new Exception("nu a fost implementat");

    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());

    }

    @Override
    public Nod getNod(int pozitie) throws Exception {
        throw new Exception("nu a fost implementat");
    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
         return pretPeLoc*nrLocuri;
    }
}
