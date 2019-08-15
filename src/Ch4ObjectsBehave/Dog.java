package Ch4ObjectsBehave;

class Dog {
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

    /**
     * Default constructor null name and size
     */
    public Dog(){}

    /**
     * parametrized constructor
     * @param sz dog size - positive integer
     * @param nm dog name - non-empty string
     */
    public Dog(int sz, String nm) {
        if (sz < 1) {
            throw new IllegalArgumentException("Dog cannot have size 0 or less!");
        }
        else {
            size = sz;
        }
        name = nm;
    }

    /**
     * comparator
     * @return true if names and sizes are the same
     */
//    public boolean equals(Dog other) {
//        if (other.equals(null))
//            throw new IllegalArgumentException ("Пёся неинициализирована! Не с чем сравнивать )=");
//        if (other.getName().equals(this.name) && other.getSize() == this.size)
//            return true;
//        else
//            return false;
//    }

    public void info() {
        System.out.println("This is " + name + ", he is a good dog! He weigts " + size + " kilo");
    }

    public int getSize() {
        return this.size;
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

class DogTest {
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
        dogs[1].setName("Skinny");
        dogs[1].setSize(2);

//        dogs[1].setSize(4);
//        dogs[1].setName("Bobbie");
        System.out.println(dogs[1].getName());
        if (dogs[0].equals(dogs[1]))
            System.out.println("Пёсели одинаковые! Гав!");
        else
            System.out.println("Пёсели разные! Гав-гав!");
    }
}