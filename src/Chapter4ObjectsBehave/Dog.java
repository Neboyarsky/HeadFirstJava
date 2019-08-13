package Chapter4ObjectsBehave;

public class Dog {
    private int size;
    private String name;

    /**
     * Depending on the size of this dog, barks differently
     */
    public void bark() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println("Bow!");
        }
    }

    public void bark(int count){
        while (count > 0) {
            System.out.println("Wuff!");
            count--;
        }
    }

    public Dog(int size, String name) {
        if (size < 1) {
            throw new IllegalArgumentException("Dog cannot have size 0 or less!");
        }
        else {
            this.size = size;
        }
        this.name = name;
    }

    public void info() {
        System.out.println("This is " + this.name + ", he is a good dog! He weigts " + this.size + " kilo");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
