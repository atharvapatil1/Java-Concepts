import java.util.Scanner;
class Fahrenheit_Celsius
{
	public static void main(String [] args)
	{
		double celsius , fahrenheit;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		fahrenheit=s.nextDouble();
		celsius=(fahrenheit-32)*(0.5556);
		System.out.println("Temperature in Celsius:"+celsius);
	}
}