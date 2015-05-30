import java.util.Scanner;
public class BMICalculator
{
	public static void main(String[] args)
	{
		double kg,m,BMI;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("what is your weight in kgs? ");
		kg = keyboard.nextDouble();
		
		System.out.print("what is your height in meters? ");
		m = keyboard.nextDouble();
		
		BMI = kg/(m*m);
		
		System.out.println("your BMI is " + BMI);
	}
}
