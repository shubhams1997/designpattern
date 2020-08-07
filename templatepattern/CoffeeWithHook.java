package templatepattern;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	void brew(){
		System.out.println("Dripping Coffee through filter");
	}

	void addCondiments(){
		System.out.println("Adding Sugar and Milk");
	}

	boolean customerWantsCondiments(){
		String ans = getUserInput();
		if(ans.toLowerCase().startsWith("y"))
			return true;
		return false;
	}

	private String getUserInput(){
		Scanner input = new Scanner(System.in);

		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		String ans = null;
		ans = input.nextLine();
		if(ans == null)
			return "no";
		return ans;
	}
}
