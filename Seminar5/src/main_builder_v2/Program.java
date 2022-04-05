package main_builder_v2;

import builder_V2.Autobuz;
import builder_V2.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setNrLinie(116);

        Autobuz autobuz= autobuzBuilder.build();
        System.out.println(autobuz.toString());
    }
}
