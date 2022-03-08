package sources.animals;

public class Main {
    public static void main(String[] args) {
        ZOO zoo=new ZOO("zoo", new IngrijitorZOO("Dan"));
        Girafa animalG1=new Girafa("girafa 1");
        Zebra animalZ1=new Zebra("zebra 1");
        Girafa animalG2=new Girafa("girafa 2");
        Zebra animalZ2=new Zebra("zebra 2");

        zoo.adaugaAnimal(animalG1);
        zoo.adaugaAnimal(animalG2);
        zoo.adaugaAnimal(animalZ1);
        zoo.adaugaAnimal(animalZ2);

        zoo.hranesteAnimale();


    }
}
