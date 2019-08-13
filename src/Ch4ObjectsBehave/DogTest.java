package Chapter4ObjectsBehave;

public class DogTest {
    public static void main(String[] args) {
        /**
         * Meet Chubby
         */
        Dog chubby = new Dog(5, "Chubby");
        chubby.info();
        chubby.bark();
        System.out.println("good boy!");
        chubby.bark(5);
    }
}
