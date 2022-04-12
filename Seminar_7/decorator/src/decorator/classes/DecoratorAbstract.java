package decorator.classes;

public abstract class DecoratorAbstract implements Printer{
    Printer printer;

    public DecoratorAbstract(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printeaza() {
        printer.printeaza();

    }

    public abstract void printeazaVerso(String mesaj);
}
