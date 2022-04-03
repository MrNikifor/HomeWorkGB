public class Plait {
       private int food;

    public Plait(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("In a plaite " + food + " food");
    }
    public void decreaseFood(int appetite){
        if(food == 0 || appetite >= food){
            System.out.println("Cat can't eat ");
        }else {
            this.food -= appetite;
        }
    }
    public void addFood(int food){
        this.food += food;
    }
    public boolean isFoodEnough(int countFood){
        return this.food >= countFood;
    }
}
