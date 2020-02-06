package strategypattern;

// import strategypattern.*;

class WoodDuck extends Duck{
    public WoodDuck(){
        fb = new RocketFly();
        qb = new NormalQuack();
    }
}

class Implement_duck{
    public static void main(String[] args){
        Duck wood = new WoodDuck();
        wood.fly();
        wood.quack();

        wood.setFlyBehavior(new NoFly());
        wood.setQuackBehavior(new NoQuack());

        wood.fly();
        wood.quack();
    }
}
