package composite_classes;

public interface Nod {
    void adauga(Nod nod) throws Exception;
    void sterge(Nod nod) throws Exception;
    void afiseazaDescriere();
    Nod getNod(int pozitie) throws Exception;
    float calculeazaSumaGarantie(float pretPeLoc);

}
