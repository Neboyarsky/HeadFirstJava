package Ch4ObjectsBehave;

public class Dog {
    private int size;
    private String name;

    /**
     * Depending on the size of this dog, barks differently
     */
    public void bark() {
        for (int i = 0; i < this.getSize() - 1; i++) {
            System.out.print("Bow! ");
        }
        System.out.println("Bow!");
    }

    public void bark(int count){
        while (count > 1) {
            System.out.print("Wuff! ");
            count--;
        }
        System.out.println("Wuff!");
    }

    public Dog(){}

    public Dog(int sz, String nm) {
        if (sz < 1) {
            throw new IllegalArgumentException("Dog cannot have size 0 or less!");
        }
        else {
            size = sz;
        }
        name = nm;
    }

    public void info() {
        System.out.println("This is " + name + ", he is a good dog! He weigts " + size + " kilo");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int sz) {
        size = sz;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        if (nm != null) {
            name = nm;
        }
    }
}

public class DogTest {
    public static void main(String[] args) {
        /**
         * Meet Chubby
         */
        Dog chubby;
        chubby = new Dog(8, "Chubby");
        chubby.info();
        chubby.bark();
        System.out.println("good boy!");
        chubby.bark(5);

        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog(2, "Skinny");
        dogs[1] = new Dog();

        dogs[1].setSize(4);
        dogs[1].setName("Bobbie");
    }
}