package guru.qa;

public class Model {
    static class Dog {
        String name;
        String breed;
        int age;
        int weight;
        String favToy;

        public void bark() {
            System.out.println("Woof!");
        }

        public void stepOnScale() {
            System.out.println(weight);
        }

        public void eatLess() {
            weight = weight - 2;
        }

        public void bringToy() {
            System.out.println(favToy);
        }
    }

    public static void main(String[] args) {
        Dog fido = new Dog();
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

        Dog max = new Dog();
        max.name = "Maximus";
        max.breed = "Golden Retriever";
        max.age = 7;
        max.weight = 32;
        max.favToy = "rabbit";
        max.bark();
        max.stepOnScale();
        max.bringToy();
    }
}
