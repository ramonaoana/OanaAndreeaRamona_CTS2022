package classes;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class PersoanaGetVarstaTest {
    Persoana persoana;

    @Test
    public void getVarstaRight() {
        persoana=new Persoana("Ramona", "6010529440035");
        int varsta=persoana.getVarsta();
        assertEquals(20,varsta);
    }

    @Test
    public void getVarstaRightBoundary1800() {
        persoana=new Persoana("Ramona", "3000101440035");
        int varsta=persoana.getVarsta();
        assertEquals(222,varsta);
    }
    @Test
    public void getVarstaRightBoundary1900() {
        persoana=new Persoana("Ramona", "3991231440035");
        int varsta=persoana.getVarsta();
        assertEquals(122,varsta);
    }

    @Test
    public void getVarstaRightBoundaryToday() {
        persoana=new Persoana("Ramona", "6040518440035");
        int varsta=persoana.getVarsta();
        assertEquals(17,varsta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaRightErrorCondition() {
        persoana=new Persoana("Ramona", "6220518440035");
        int varsta=persoana.getVarsta();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaRightErrorCondition2() {
        persoana=new Persoana("Ramona", null);
        int varsta=persoana.getVarsta();
    }
//    test si de existance

    @Test(timeout = 100)
    public void getVarstaRightPerformance() {
        persoana=new Persoana("Ramona", "6010529440035");
        int varsta=persoana.getVarsta();
        assertEquals(20,varsta);
    }

    @Test
    public void getVarstaRightOrder() {
        Persoana persoana1=new Persoana("Victor","170809523124");
        persoana=new Persoana("Ramona", "6010529440035");
        assertTrue(persoana1.getVarsta()>persoana.getVarsta());
    }













}