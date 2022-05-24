package test.dubluri;

import persoana.IPersoana;

public class PersoanaFake implements IPersoana {
    String sex;
    int varsta;
    boolean isCnp;

    public PersoanaFake() {

    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCnp(boolean cnp) {
        isCnp = cnp;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return isCnp;
    }
}
