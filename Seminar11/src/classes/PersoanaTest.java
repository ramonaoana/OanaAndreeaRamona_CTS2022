package classes;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PersoanaTest {
    private Persoana persoana;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getSexRight() {
        persoana=new Persoana("Ramona","6010529440035");
        String sex=persoana.getSex();
        assertEquals("F",sex);
    }

    @Test
    public void getVarstaBoundary(){
        persoana=new Persoana("Ramona","60001019440035");
        String sex=persoana.getSex();
        assertEquals("F",sex);
    }

//    nu se poate aplica inverse

    @Test(expected=IllegalArgumentException.class)
    public void getVarstaErrorCondition(){
        persoana=new Persoana("Ramona","0010529440035");
        String sex=persoana.getSex();
    }

    @Test(timeout = 10)
    public void getSexPerformance() {
        persoana=new Persoana("Ramona","6010529440035");
        String sex=persoana.getSex();
        assertEquals("F",sex);
    }

//    CORRECT

    @Test
    public void getSexConformance() {
        persoana=new Persoana("Ramona","6010529440035");
        String sex=persoana.getSex();
        assertEquals(1,sex.length());
    }

    @Test
    public void getSexRangeBetween1800and1899() {
        persoana=new Persoana("Ramona","3010529440035");
        String sex=persoana.getSex();
        assertEquals("M",sex);
    }
//    nu avem referinta
//
//    @Test
//    public void getSexRangeReference() {
//        persoana=new Persoana("Ramona","3010529440035");
//        String sex=persoana.getSex();
//        assertEquals("M",sex);
//    }

    @Test(expected=NullPointerException.class)
    public void getSexRangeExistance() {
        persoana=new Persoana("Ramona",null);
        String sex=persoana.getSex();
        assertEquals("M",sex);
    }

//    pt cardinality am facut teste pentru 0, 1...

}