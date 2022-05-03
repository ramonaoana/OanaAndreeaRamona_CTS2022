package chain_main;

import chain_classes.*;

public class Main {
    public static void main(String[] args) {
        Handler troleibuz=new Troleibuz(3);
        Handler autobuz=new AutobuzHandler(5);
        Handler tramvai=new TramvaiHandler(10);
        Handler metrou=new MetrouHandler(20);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        troleibuz.afisareRecomandare(2);
        troleibuz.afisareRecomandare(4);
        troleibuz.afisareRecomandare(7);
        troleibuz.afisareRecomandare(12);



    }
}
