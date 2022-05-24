package test.teste;

import agentie.IPachet;
import agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import persoana.IPersoana;
import test.categorii.Boundary;
import test.dubluri.PachetFake;
import test.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(PersoanaFake.class)
    public void testPoateRezervaVarstaEligibila(){
        PersoanaFake persoanaFake=new PersoanaFake();
        IPachet pachet=new PachetTuristic(persoanaFake,"Paris",1000.0);
        persoanaFake.setVarsta(22);
        assertTrue(pachet.poateRezerva());
    }

    @Test
    @Category(PersoanaFake.class)
    public void testPoateRezervaVarstaIneligibila(){
        PersoanaFake persoanaFake=new PersoanaFake();
        IPachet pachet=new PachetTuristic(persoanaFake,"Paris",1000.0);
        persoanaFake.setVarsta(12);
        assertFalse(pachet.poateRezerva());
    }

    @Test
    @Category({PersoanaFake.class, Boundary.class})
    public void aplicaDiscountVarstnici(){
        PersoanaFake persoanaFake=new PersoanaFake();
        IPachet pachet=new PachetTuristic(persoanaFake,"Paris",3500.0);
        persoanaFake.setVarsta(65);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(3150, pachet.getPret(),10);
    }

    @Test
    @Category({PersoanaFake.class,Boundary.class})
    public void aplicaDiscountPersoanaNormala(){
        PersoanaFake persoanaFake=new PersoanaFake();
        IPachet pachet=new PachetTuristic(persoanaFake,"Paris",3500.0);
        persoanaFake.setVarsta(50);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(3500, pachet.getPret(),0.05);
    }
}
