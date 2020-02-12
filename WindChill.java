/**
 * 
 * @author - William Nicholas
 * 
 */

import java.util.Scanner;

public class WindChill
{
	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		float temperature;
		float windSpeed;
		double windChill;
		String programmerName;
		
		System.out.println("Wind Chill Calculator\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit (between -45 and 40): ");
		temperature = input.nextFloat();
		System.out.print("Enter the wind speed in mph (between 5 and 60): ");
		windSpeed = input.nextFloat();
		
		windChill = 35.74 + (0.6125*temperature) - (35.75*(Math.pow((windSpeed), 0.16))) + ((0.4275*temperature)*(Math.pow((windSpeed), 0.16)));
		
		System.out.println("\nThe Wind Chill temperature is " + windChill + " in Fahrenheit.");
		
		if (temperature <= 40 && temperature >= -45)
		{
			if (windSpeed <= 60 && windSpeed >= 5)
			{
				System.out.println("\nTest Succeeded!");
			}
			else
			{
				System.out.println("\nTest Failed!");
			}
		}
		else
		{
			System.out.println("\nTest Failed!");
		}
		
		if (temperature > 40)
		{
			if (windSpeed > 60)
			{
				System.out.println("The temperature is too hot, and the wind speed is too fast.");
			}
			else if (windSpeed < 5)
			{
				System.out.println("The temperature is too hot, and the wind speed is too slow.");
			}
			else
			{
				System.out.println("The temperature is too hot.");
			}
		}
		else if (temperature < -45)
		{
			if (windSpeed > 60)
			{
				System.out.println("The temperature is too cold, and the wind speed is too fast.");
			}
			else if (windSpeed < 5)
			{
				System.out.println("The temperature is too cold, and the wind speed is too slow.");
			}
			else
			{
				System.out.println("The temperature is too cold.");
			}
		}
		else
		{
			if (windSpeed > 60)
			{
				System.out.println("The wind speed is too fast.");
			}
			else if (windSpeed < 5)
			{
				System.out.println("The wind speed is too slow.");
			}
		}
		
		System.out.print("\nEnter your name: ");
		programmerName = input.next();
		
		System.out.print("\nThank you for testing out the program, " + programmerName + ".");		
	}
}
