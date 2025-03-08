public class Main {
    public static void main(String[] args) {

        RubberDuck rb = new RubberDuck(); // Creating an object of class RubberDuck
        System.out.println("--------------");
        rb.display();  // Printing method outputs
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("--------------");

        RedheadDuck rh = new RedheadDuck(); // Creating an Object of RedheadDuck
        System.out.println("--------------");
        rh.display(); // Printing method outputs
        rh.performQuack();
        rh.performSwim();
        rh.performFly();
        System.out.println("--------------");


        MallardDuck md = new MallardDuck(); // Creating an Object of MallardDuck
        System.out.println("--------------");
        md.display();
        md.performQuack(); // Printing method outputs
        md.performSwim();
        md.performFly();
        System.out.println("--------------");

        DecoyDuck dd = new DecoyDuck(); // Creating an Object of DecoyDuck
        System.out.println("--------------");
        dd.display();
        dd.performQuack(); // Printing method outputs
        dd.performSwim();
        dd.performFly();

        System.out.println("--------------");


    }
}


