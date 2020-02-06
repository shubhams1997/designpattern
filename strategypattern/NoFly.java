package strategypattern;

public class NoFly implements FlyBehavior{
    public void fly(){
        System.out.println("I cann't fly");
    }
}