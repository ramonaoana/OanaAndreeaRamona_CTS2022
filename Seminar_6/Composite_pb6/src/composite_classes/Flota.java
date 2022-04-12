package composite_classes;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Nod{
    String nume;
    List<Nod> noduri;

    public Flota(String nume) {
        this.nume = nume;
        noduri=new ArrayList<>();
    }


    @Override
    public void adauga(Nod nod) throws Exception {
        noduri.add(nod);

    }

    @Override
    public void sterge(Nod nod) throws Exception {
        noduri.remove(nod);

    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Numele flotei este: "+nume);
        for(Nod nod:noduri){
            nod.afiseazaDescriere();
        }
    }

    @Override
    public Nod getNod(int pozitie) throws Exception {
        return noduri.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
        float suma=0;
        for(Nod nod:noduri){
            suma+=nod.calculeazaSumaGarantie(pretPeLoc);
        }
        return suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flota{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", noduri=").append(noduri);
        sb.append('}');
        return sb.toString();
    }
}
