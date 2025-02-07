interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

interface SwimBehavior {
    void swim();
}
class RubberDuck implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("RubberDuck is swimming.");
    }
    
    public void squeak() {
        System.out.println("RubberDuck squeaks!");
    }
}

class WoodenDuck implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("WoodenDuck is swimming.");
    }
    
    public void mute() {
        System.out.println("WoodenDuck is mute.");
    }
}

class RedHeadDuck implements FlyBehavior, QuackBehavior, SwimBehavior {
    @Override
    public void fly() {
        System.out.println("RedHeadDuck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHeadDuck quacks!");
    }

    @Override
    public void swim() {
        System.out.println("RedHeadDuck is swimming.");
    }
}

class LakeDuck implements FlyBehavior, QuackBehavior, SwimBehavior {
    @Override
    public void fly() {
        System.out.println("LakeDuck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("LakeDuck quacks!");
    }

    @Override
    public void swim() {
        System.out.println("LakeDuck is swimming.");
    }
}
public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.squeak();
        rubberDuck.swim();

        woodenDuck.mute();
        woodenDuck.swim();

        
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();

        
        lakeDuck.fly();
        lakeDuck.quack();
        lakeDuck.swim();
    }
}
