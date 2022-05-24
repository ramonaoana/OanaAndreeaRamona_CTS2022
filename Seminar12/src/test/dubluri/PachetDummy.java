package test.dubluri;

import agentie.IPachet;
import agentie.PachetTuristic;
import persoana.IPersoana;

public class PachetDummy implements IPachet {

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
