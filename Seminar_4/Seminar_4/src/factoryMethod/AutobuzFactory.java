package factoryMethod;

import factoryMethod.Autobuz;
import factoryMethod.MijlocTransport;

public class AutobuzFactory  implements Factory{
    @Override
    public MijlocTransport createObject(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
