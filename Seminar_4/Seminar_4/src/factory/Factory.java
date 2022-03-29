package factory;

public class Factory {

    public MijlocTransport createObject(TipTransport tipTransport,int nrInmatriculare){
        switch(tipTransport)
        {
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
