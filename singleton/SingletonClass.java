package singleton;

class SingletonClass{
	static private SingletonClass instance;
	private String name;
	private SingletonClass(){}

	public static SingletonClass getInstance(){
		if(instance == null)
			instance = new SingletonClass();
		return instance;
	}

	public void setName(String name){
		this.name = name;
	}

	public void display(){
		System.out.println("I am object "+this.name);
	}
}
