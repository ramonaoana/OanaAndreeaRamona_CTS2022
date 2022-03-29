package Main;

import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton secondSingleton=Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(secondSingleton);
    }
}
