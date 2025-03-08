public class MallardDuck extends Duck
{
    public MallardDuck(){
        quackBehaviour = new Quack(); // Constructor
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new Fly();
    }

    @Override // method overriding
    public void display() {
        System.out.println("I am Mallard Duck..");
    }
}
