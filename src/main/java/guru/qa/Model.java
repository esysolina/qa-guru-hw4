package guru.qa;

public class Model {
    static class Dog {
        String name;
        String breed;
        int age;
        int weight;
        String favToy;
        boolean place;

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

        public void goToPlace() {
            place = true;
        }
    }
}
