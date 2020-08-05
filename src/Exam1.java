/**
 * 
 */

/**
 * @author ishaangupta
 *
 */

import java.util.Scanner;

public class Exam1 {

	/**
	 * @param args
	 */
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question1();
//		Question2();
//		Question3(Integer.parseInt(args[0]));
//		Question4();
//		Question5();
//		Question6();
//		Question7();
//		Question8();
//		Question9();
//		Question10();
//		Question11();
//		Question12();
//		Question13();
//		Question14();
//		Question15();
//		Question16();
	}
	
	public static void Question1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = Integer.parseInt(s.nextLine());
		if (num == 100) {
			System.out.println("You entered number 100");
		}
		String outPut = (num<100) ? "less than" : "greater than";
		System.out.println("The number is " + outPut + " 100");
	}	
	
	public static void Question2() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = Integer.parseInt(s.nextLine());
		String outPut = (num<200) && (num%2 == 0) ? "The number is less than 200 and even number." : "Invalid number.";
		System.out.println(outPut);
	}	

	public static void Question3(int n) {
		int i = 1;
		int j = 1;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter n");
//		int n = Integer.parseInt(s.nextLine());
		System.out.print("Fibonnaci Series: " + Integer.toString(j) + " " + Integer.toString(j) + " ");
		for (int k = 0; k < n - 2; k ++) {
			int temp = i + j;
			i = j;
			j = temp;
			System.out.print(Integer.toString(j) + " ");
		}
		System.out.println();
	}
	
	public static void Question4() {
		Scanner s = new Scanner(System.in);
		System.out.println("Check Amount:");
		float checkAmt = Integer.parseInt(s.nextLine());
		System.out.println("Tip %:");
		float tipPercent = Integer.parseInt(s.nextLine());
		float tip = (checkAmt*tipPercent)/100;
		System.out.println("The tip is: " + Float.toString(tip));
	}	
	
	
	public static void Question5() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Year:");
		
		int year = Integer.parseInt(s.nextLine());
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("It is a leap year!");
		}
			
		else 
			System.out.println("It is not a leap year!");
	}

	public static void Question6() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter letter:");
		String letter = s.nextLine();
		switch (letter) {
		case "a":
			System.out.println("It is a vowel.");
			break;
		case "e":
			System.out.println("It is a vowel.");
			break;
		case "i":
			System.out.println("It is a vowel.");
			break;
		case "o":
			System.out.println("It is a vowel.");
			break;	
		case "u":
			System.out.println("It is a vowel.");
			break;
		default:
			System.out.println("It is a consonant.");
		}
	}
	
	public static void Question7() {
		Scanner s = new Scanner(System.in);
		String yesOrNo = "";
		System.out.println("Enter movie name:");
		String movieName = s.nextLine();
		switch (movieName) {
		case "Thor":
			System.out.println("In fairfax cinemax currently running movie : Thor");
			System.out.println("Are you sure you want to watch this movie? (y/n)");
			yesOrNo = s.nextLine();
			switch(yesOrNo) {
			case "y":
				System.out.println("You will watch " + movieName);
				break;
			case "n":
				System.out.println("You will not watch " + movieName);
				break;	
			default:
				System.out.println("Wrong Input");
			}
			break;
		case "Radioactive":
			System.out.println("In fairfax cinemax currently running movie : Radioactive");
			System.out.println("Are you sure you want to watch this movie? (y/n)");
			yesOrNo = s.nextLine();
			switch(yesOrNo) {
			case "y":
				System.out.println("You will watch " + movieName);
				break;
			case "n":
				System.out.println("You will not watch " + movieName);
				break;	
			default:
				System.out.println("Wrong Input");
			}
			break;
		case "Idiocracy":
			System.out.println("In fairfax cinemax currently running movie : Idiocracy");
			System.out.println("Are you sure you want to watch this movie? (y/n)");
			yesOrNo = s.nextLine();
			switch(yesOrNo) {
			case "y":
				System.out.println("You will watch " + movieName);
				break;
			case "n":
				System.out.println("You will not watch " + movieName);
				break;	
			default:
				System.out.println("Wrong Input");
			}
			break;
		case "Jumanji":
			System.out.println("In fairfax cinemax currently running movie : Jumanji");
			System.out.println("Are you sure you want to watch this movie? (y/n)");
			yesOrNo = s.nextLine();
			switch(yesOrNo) {
			case "y":
				System.out.println("You will watch " + movieName);
				break;
			case "n":
				System.out.println("You will not watch " + movieName);
				break;	
			default:
				System.out.println("Wrong Input");
			}
			break;
		case "Slumdog Millionaire":
			System.out.println("In fairfax cinemax currently running movie : Slumdog Millionaire");
			System.out.println("Are you sure you want to watch this movie? (y/n)");
			yesOrNo = s.nextLine();
			switch(yesOrNo) {
			case "y":
				System.out.println("You will watch " + movieName);
				break;
			case "n":
				System.out.println("You will not watch " + movieName);
				break;	
			default:
				System.out.println("Wrong Input");
			}
			break;
		case "Foundation":
			System.out.println("In fairfax cinemax currently running movie : Foundation");
			System.out.println("Are you sure you want to watch this movie? (y/n)");
			yesOrNo = s.nextLine();
			switch(yesOrNo) {
			case "y":
				System.out.println("You will watch " + movieName);
				break;
			case "n":
				System.out.println("You will not watch " + movieName);
				break;	
			default:
				System.out.println("Wrong Input");
			}
			break;
		default:
			System.out.println(movieName + " is not running in fiarfax cinemax.");
		}
	}
	
	public static void Question8() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows = Integer.parseInt(s.nextLine());
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < rows - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print(Integer.toString(k) + " ");
			System.out.print("\n");
		}
	}
	
	public static void Question9() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows = Integer.parseInt(s.nextLine());
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < rows - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print(Integer.toString(i) + " ");
			System.out.print("\n");
		}
	}
	
	public static void Question10() {
		float sum = 0;
		float num = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter Number");
			num = Integer.parseInt(s.nextLine());
			sum += num;
		}
		while (num >= 0);
		if (sum >= 0)
			System.out.println(sum);
		else
			System.out.println("0");
	}
	
	public static void Question11() {
		for (int i = 0; i <= 4000; i++) {
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
				continue;
			}
				
			else 
				System.out.println(i);
		}	
	}
	
	public static void Question12() {
		String yesOrNo = "n";
		Scanner s = new Scanner(System.in);
		System.out.println("What is the command keyword to exit a loop in Java? \na. quit \nb. continue \nc. break \nd. exit");	
		do {
			System.out.println("Enter your choice:");
			String choice = s.nextLine();
			if (choice.equals("c")) {
				System.out.println("Congratulation! \nAgain? press y to continue and n to discontinue?");
				yesOrNo = s.nextLine();
			}
			else {
				System.out.println("Inccorect! \nAgain? press y to continue and n to discontinue");
				yesOrNo = s.nextLine();
			}
		} 
		while (yesOrNo.equals("y"));
	}
	
	public static void Question13() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter text");
		
		String text = s.nextLine();
		text  = text.replaceAll("\\s", "");
		System.out.println(text);
	}
	
	public static void Question14() {
		System.out.println("1, 2, 4, 7, 11, 16, 32, 39, 47, 56, 66");
	}
	
	public static void Question15() {
		Scanner s = new Scanner(System.in);
		System.out.println("Press number key");
		
		String key = s.nextLine();
		switch(key) {
		case "0":
			System.out.println(key + " was pressed!");
			break;
		case "1":
			System.out.println(key + " was pressed!");
			break;
		case "2":
			System.out.println(key + " was pressed!");
			break;
		case "3":
			System.out.println(key + " was pressed!");
			break;
		case "4":
			System.out.println(key + " was pressed!");
			break;
		case "5":
			System.out.println(key + " was pressed!");
			break;
		case "6":
			System.out.println(key + " was pressed!");
			break;
		case "7":
			System.out.println(key + " was pressed!");
			break;
		case "8":
			System.out.println(key + " was pressed!");
			break;
		case "9":
			System.out.println(key + " was pressed!");
			break;
		default:
			System.out.println("Not Allowed!");
			
		}
	}
	
	public static void Question16() {
		String yesOrNo = "n";
		Scanner s = new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in\n" + 
				" Java? \na. int 1x=10; \nb. int x=10; \nc. float x=10.0f; \nd. string x='10';");	
		
			System.out.println("Enter your choice:");
			String choice = s.nextLine();
			if (choice.equals("b"))
				System.out.println("Correct Answer!");
			else {
				System.out.println("Inccorect Answer!");
			}
	}
}
