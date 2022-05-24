package agentie;

import persoana.IPersoana;

public class PachetTuristic implements IPachet{

    private IPersoana client;
    private String destinatie;
    private Double pret;

    public PachetTuristic(IPersoana client, String destinatie, Double pret) {
        super();
        this.client = client;
        this.destinatie = destinatie;
        this.pret = pret;
    }

    @Override
    public boolean poateRezerva() {
        return client.getVarsta() > 18;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {
        if (this.client.getVarsta() >= 65) {
            this.pret = this.pret - (procent / 100.0)*this.pret;
        }
    }

    @Override
    public double getPret() {
        return pret;
    }

    public IPersoana getClient() {
        return client;
    }

    public void setClient(IPersoana client) {
        this.client = client;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }


    public void setPret(Double pret) {
        this.pret = pret;
    }

}
