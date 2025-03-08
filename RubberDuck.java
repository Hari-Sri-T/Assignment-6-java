public class RubberDuck extends Duck{

    public RubberDuck(){ // Constructor
        flyBehaviour = new NoFly();
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
    }
    @Override
    public void display() { // method overriding
        System.out.println("I am Rubber Duck!!");
    }
}
