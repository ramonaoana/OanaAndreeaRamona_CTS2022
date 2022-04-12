package strategy.classes;

public class Validator{
    ModPlata modPlata;
    float pret;

    public Validator(float pret) {
        this.pret = pret;
        this.modPlata=new CardSTB();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteCalatoria() {
        modPlata.plateste(pret);
    }
}
