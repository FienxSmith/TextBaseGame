package Model;

import View.ViewConsole;

public class Model {

	ViewConsole view = new ViewConsole();

	public void print(String[] str)
	{
		String newStr = "Printed from Model: ";
		for(int i = 1; i < str.length; i++)
		{
			newStr += str[i] + " ";
		}
		view.print(newStr);
	}

	public void add(String first, String second) {
		 first = " Testing 1, 2. 3, ";
		 second = "is this thing on?";
		try{
			int one = Integer.parseInt(first);
			int two = Integer.parseInt(second);
			view.print(one + "+" + two+ "=" + (one+two));

			// Note you can throw from a deeper class and catch it here and print
			// ie. why exceptions are your best friend
		}catch (NumberFormatException e){
			view.print(first + " or " + second + " is not an integer");
		}

	}

}
