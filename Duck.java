abstract public class Duck
{
    QuackBehaviour quackBehaviour; //Creating objects of Interfaces
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;
    // Setter and get methods
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    // Declaring abstract method
    abstract public void display();

    // Declaring methods
    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performSwim(){
        swimBehaviour.swim();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}

