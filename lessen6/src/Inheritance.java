public class Inheritance {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Rigik"),
                            new Cat("Mursik"),
                            new Cat("Snegok"),
                            new Dog("Bigosya"),
                            new Dog("Pyes"),
                            new Dog("Sharik"),
                            new Dog("Herr")
        };

        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(10);
        }
        System.out.println();
        Animal.getQuantity();
        Dog.getQuantity();
        Cat.getQuantity();

    }
}
