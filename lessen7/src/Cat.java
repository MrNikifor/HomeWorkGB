
public class Cat {
    private String name;
    private  int appetite;
    private boolean full;

    public boolean isFull() {
        return full;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    public String getName() {
        return name;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void eat(Plait p){
        if(checkQuantityFood(p)) {
            System.out.println("Cat " + name + " start eat " + appetite);
            p.decreaseFood(appetite);
            full = true;
        }

    }
    public boolean checkQuantityFood(Plait p) {
        if(p.isFoodEnough(appetite)){
            return true;
        }else {
            return false;
        }
    }
}
