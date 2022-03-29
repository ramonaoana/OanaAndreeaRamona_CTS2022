package factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        MijlocTransport autobuz=factory.createObject(TipTransport.AUTOBUZ,13);
        MijlocTransport troleibuz=factory.createObject(TipTransport.TROLEIBUZ,54);
        MijlocTransport tramvai=factory.createObject(TipTransport.TRAMVAI,22);

        System.out.println(autobuz);
        System.out.println(troleibuz);
        System.out.println(tramvai);
    }
}
