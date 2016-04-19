import java.util.Scanner;


public class Calc {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number :");
		int firstNum = input.nextInt();
		
		Scanner doWhat = new Scanner(System.in);
		System.out.println("Enter x, /, + or - :");
		String doThis = doWhat.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your second number :");
		int secondNum = input2.nextInt();
		
		
		switch(doThis) {
		
		case "x":
			int answer = firstNum * secondNum;
		    System.out.println("The answer is " + answer);
		    break;
		    
		case "/":
			answer = firstNum / secondNum;
			System.out.println("The answer is " + answer);
			break;
			
		case "-":
			answer = firstNum - secondNum;
			System.out.println("The answer is " + answer);
			break;
			
		case "+":
			answer = firstNum + secondNum;
			System.out.println("The answer is " + answer);
			break;
		}
		
		
		
		
		
		
		
	}

}
