package main_builder;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {

        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setAreOpriri(false);
        autobuzBuilder.setDeschideUsi(false);

        Autobuz autobuz=autobuzBuilder.build();

        System.out.println(autobuz);

    }
}
