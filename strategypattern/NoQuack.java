package strategypattern;

public class NoQuack implements QuackBehavior{
    public void quack(){
        System.out.println("I can't Quack ..... ");
    }
}
