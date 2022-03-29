package factoryMethod;

public class MainFactory {
    public static void main(String[] args) {
        MijlocTransport autobuz=new AutobuzFactory().createObject(34);
        MijlocTransport tramvai=new TramvaiFactory().createObject(74);
        MijlocTransport troleibuz=new TroleibuzFactory().createObject(245);

        System.out.println(troleibuz);
        System.out.println(tramvai);
        System.out.println(autobuz);
    }

}
