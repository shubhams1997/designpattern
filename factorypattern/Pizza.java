package factorypattern;

public abstract class Pizza {
    /**
     * Pizza is a abstract Class hols all the necessary information about a pizza whether its a NY pizza
     * or a Chicago Style pizza.
     * holds information like name, dough, sauce type, cheese, veggies included in pizza etc.
     */
    String name;
    String dough;
    String sauce;
    String cheese;
    String veggies[];
    
    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the Pizza into diagnal Slices");
    }

    void box(){
        System.out.print("Place pizza in Official Pizza Store box");
    }

    void setName(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name+" pizza with "+this.dough+ ", "+this.sauce+", "+this.cheese;
    }
}