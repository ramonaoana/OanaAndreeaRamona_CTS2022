package decorator.classes;

public class Decorator extends DecoratorAbstract{
   String mesaj;

    public Decorator(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaVerso(String mesaj) {
        System.out.println("Mesajul printat pe verso este: "+mesaj);

    }
}
