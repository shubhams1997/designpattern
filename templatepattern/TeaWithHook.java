package templatepattern;

import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook{

	void brew(){
		System.out.println("Steeping the tea");
	}

	void addCondiments(){
		System.out.println("Adding Lemon");
	}

	boolean customerWantsCondiments(){
		String ans = getUserInput();
		if(ans.toLowerCase().startsWith("y"))
			return true;
		return false;
	}

	private String getUserInput(){
		Scanner input = new Scanner(System.in);

		System.out.println("Would you like lemon with your tea (y/n)? ");
		String ans = null;
		ans = input.nextLine();
		if(ans == null)
			return "no";
		return ans;
	}
}
