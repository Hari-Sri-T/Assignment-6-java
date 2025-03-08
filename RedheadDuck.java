public class RedheadDuck extends Duck{

    public RedheadDuck(){ // Constructor
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() { // method overriding
        System.out.println("I am a Redhead Duck !!!");

    }
}
