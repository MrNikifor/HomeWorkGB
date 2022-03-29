public class Cat extends Animal {
    private static int quantity;
    public Cat(String name) {
        super(name);
        quantity++;
    }
    public static int getQuantity() {
        System.out.println("Quantity Cat = " + quantity);
        return quantity;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200){
            System.out.println("Cat " + getName() + " run " + distance);
        }else {
            System.out.println("Cat " + getName() + " can't run " + distance);
        }

    }
    @Override
    public void swim(int distance) {
        System.out.println(" cat can't swim");
    }
}
