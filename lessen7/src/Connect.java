public class Connect {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Rigik", 20),
                      new Cat("Pushok", 15),
                      new Cat("Snegok", 10),
                      new Cat("Pizdyuk", 30),
        };
        Plait plait = new Plait(50);
        for (Cat cat : cats) {
            cat.eat(plait);
            System.out.println("Cat " + cat.getName() + " satiety status " + cat.isFull());
        }
    }
}
