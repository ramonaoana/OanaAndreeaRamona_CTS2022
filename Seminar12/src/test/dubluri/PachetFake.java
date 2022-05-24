package test.dubluri;

import agentie.IPachet;

public class PachetFake implements IPachet {
    int valoarePret;
    boolean valoarePoateRezerva;

    public PachetFake() {
        this.valoarePret = 0;
        this.valoarePoateRezerva=false;
    }

    public int getValoarePret() {
        return valoarePret;
    }

    public void setValoarePret(int valoarePret) {
        this.valoarePret = valoarePret;
    }

    public boolean isValoarePoateRezerva() {
        return valoarePoateRezerva;
    }

    public void setValoarePoateRezerva(boolean valoarePoateRezerva) {
        this.valoarePoateRezerva = valoarePoateRezerva;
    }

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public double getPret() {
        return 0;
    }
}
