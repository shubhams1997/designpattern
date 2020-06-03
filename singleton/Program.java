package singleton;

class Program{

	public static void main(String[] args){
		SingletonClass obj = SingletonClass.getInstance();

		obj.setName("Initial Object");
		obj.display();

		SingletonClass obj2 = SingletonClass.getInstance();
		obj2.display();
	}

}