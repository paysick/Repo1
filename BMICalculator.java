import java.util.Scanner;
public class BMICalculator
{
	public static void main(String[] args)
	{
		int kg,m,BMI;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("what is your weight in kgs? ");
		kg = keyboard.nextInt();
		
		System.out.print("what is your height in meters? ");
		m = keyboard.nextInt();
		
		BMI = kg/(m*m);
		
		System.out.println("your BMI is " + BMI);
	}
}
