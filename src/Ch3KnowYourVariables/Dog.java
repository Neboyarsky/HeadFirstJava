package Ch3KnowYourVariables;

public class Dog {
    int size;
    String breed;
    String name;
    void bark() {
        System.out.println(this.name + " like Ruff! Ruff! Woof!");
    }
    void eat() {
        System.out.println(this.name + " like Omnomnom");
    }
    void chaseTail() {
        System.out.println(this.name + " like Funny runs in circles");
    }
}
