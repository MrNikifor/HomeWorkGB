public class Dog extends Animal {
    private static int quantity;
    public Dog(String name) {
        super(name);
        quantity++;
    }
    public static int getQuantity() {
        System.out.println("Quantity Dog = " + quantity);
        return quantity;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500){
            System.out.println("Dog " + getName() + " run " + distance);
        }else {
            System.out.println("Dog " + getName() + " can't run " + distance);
        }

    }
    @Override
    public void swim(int distance) {
        if(distance <= 10){
            System.out.println("Dog " + getName() + " swim " + distance);
        }else {
            System.out.println("Dog " + getName() + " can't swim " + distance);
        }

    }
}
