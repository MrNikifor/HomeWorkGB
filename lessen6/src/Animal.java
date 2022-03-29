public abstract class Animal {
    private static int quantity;
    protected String name;

    public String getName() {
        return name;
    }
    public Animal(String name) {
        this.name = name;
        quantity++;
    }
    public static int getQuantity() {
        System.out.println("Quantity animals = " + quantity);
        return quantity;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    }

