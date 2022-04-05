package prototype;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        MijlocTransport autobuz=new Autobuz("Marian");
        MijlocTransport autobuzCopie=autobuz.copiaza();

        System.out.println(autobuz.toString());
        System.out.println(autobuzCopie.toString());


    }
}
