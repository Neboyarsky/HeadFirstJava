package Chapter3KnowYourVariables;

public class ArrDogs {
    public static void main(String[] args) {
        Dog[] pets;
        pets = new Dog[7];
        /**for (int i = 0; i < pets.length; i++) {
            pets[i] = new Dog();
        }*/
        Dog fido = new Dog();
        fido.name = "Fido";
        fido.eat();
        fido.bark();
        fido.chaseTail();
        pets[0] = new Dog();
        pets[0].name = "Fluffy";
        pets[0].bark();
        pets[0].eat();
        pets[0].chaseTail();
    }
}
