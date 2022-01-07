package guru.qa;

public class Main {
    public static void main(String[] args) {
        Model.Dog fido = new Model.Dog();
        fido.name = "Fido";
        fido.breed = "Beagle";
        fido.age = 3;
        fido.weight = 13;
        fido.stepOnScale();
        fido.eatLess();
        fido.stepOnScale();
        fido.favToy = "ball";
        fido.bringToy();
        fido.bark();
        System.out.println(fido.place);

        Model.Dog max = new Model.Dog();
        max.name = "Maximus";
        max.breed = "Golden Retriever";
        max.age = 7;
        max.weight = 32;
        max.favToy = "rabbit";
        max.bark();
        max.stepOnScale();
        max.bringToy();
        max.goToPlace();
        System.out.println(max.place);
    }
}
