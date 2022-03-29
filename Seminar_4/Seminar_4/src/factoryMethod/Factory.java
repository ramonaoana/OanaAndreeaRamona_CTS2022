package factoryMethod;

import factoryMethod.MijlocTransport;

public interface Factory {
    MijlocTransport createObject(int nrInmatriculare);
}
