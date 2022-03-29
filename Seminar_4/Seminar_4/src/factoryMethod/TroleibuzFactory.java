package factoryMethod;

import factoryMethod.MijlocTransport;
import factoryMethod.Troleibuz;

public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransport createObject(int nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
