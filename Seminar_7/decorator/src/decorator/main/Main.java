package decorator.main;

import decorator.classes.Decorator;
import decorator.classes.DecoratorAbstract;
import decorator.classes.Printer;
import decorator.classes.PrinterBilet;

public class Main {
    public static void main(String[] args) {
        Printer printer=new PrinterBilet();
//        printer.printeaza();
        DecoratorAbstract decoratorAbstract=new Decorator(printer,"Paste Fericit!");
        decoratorAbstract.printeaza();
        decoratorAbstract.printeazaVerso("Paste Fericit!");
    }
}
