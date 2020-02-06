package strategypattern;

public class Duck{
    FlyBehavior fb;
    QuackBehavior qb;

    public void fly(){
        fb.fly();
    }

    public void quack(){
        qb.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        this.fb = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        this.qb = qb;
    }
}