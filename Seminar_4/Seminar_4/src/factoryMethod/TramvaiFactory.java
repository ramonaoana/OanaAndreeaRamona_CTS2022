package factoryMethod;

import factoryMethod.MijlocTransport;
import factoryMethod.Tramvai;

public class TramvaiFactory implements Factory{
    @Override
    public MijlocTransport createObject(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
