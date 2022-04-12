package decorator.classes;

public class PrinterBilet implements Printer{


    @Override
    public void printeaza() {
        System.out.println("Am printat un bilet");

    }
}
