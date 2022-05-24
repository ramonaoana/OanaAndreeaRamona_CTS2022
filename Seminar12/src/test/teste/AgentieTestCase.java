package test.teste;


import agentie.AgentieTurism;
import agentie.IPachet;
import agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.Boundary;
import test.categorii.UtilizareDummy;
import test.categorii.UtilizareFake;
import test.dubluri.PachetDummy;
import test.dubluri.PachetFake;

import static org.junit.Assert.assertEquals;

public class AgentieTestCase {
    @Test
    @Category(UtilizareDummy.class)
    public void adaugaPachete(){
        IPachet pachetDummy=new PachetDummy();
        AgentieTurism agentie=new AgentieTurism();

        agentie.adaugaPachet(pachetDummy);
        assertEquals(1,agentie.getNrPacheteTuristice());
    }

    @Test
    @Category(UtilizareFake.class)
    public void calculeazaPretTotalFake(){
        PachetFake pachetFake =new PachetFake();
        PachetFake pachetFake1 =new PachetFake();

        pachetFake.setValoarePret(200);
        pachetFake1.setValoarePret(1000);

        AgentieTurism agentieTurism=new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake);
        agentieTurism.adaugaPachet(pachetFake1);
        double total=agentieTurism.calculareSumaTotalaPachete();
        assertEquals(pachetFake.getPret(),total-pachetFake1.getPret(),10);
    }

    @Test
    @Category(Boundary.class)
    public void testBoundaryCalculeazaSuma(){
        AgentieTurism agentieTurism=new AgentieTurism();
        double suma=agentieTurism.calculareSumaTotalaPachete();
        assertEquals(0, suma, 10);
    }

    @Test(timeout = 100)
    @Category(UtilizareFake.class)
    public void testPerformanta(){
        AgentieTurism agentieTurism=new AgentieTurism();

        for(int i=0;i<100;i++){
            PachetFake pachetFake1=new PachetFake();
            pachetFake1.setValoarePret(10*i);
            agentieTurism.adaugaPachet(pachetFake1);
        }
        agentieTurism.calculareSumaTotalaPachete();
    }
}
