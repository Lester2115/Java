import java.util.Scanner;

public class Zad_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		System.out.println("Podaj wzrost w metrach");
		double wzrost=klawisz.nextDouble();
		System.out.println("Podaj wage w kilogramach");
		double waga=klawisz.nextDouble();
		
		double BMI = waga/(wzrost*wzrost);
		if(BMI<18.5)
		{
			System.out.println("Masz niedowage");
		}
		else if(BMI>25)
		{
			System.out.println("Masz nadwage");
		}
		else
		{
			System.out.println("Masz odpowiednia wage");
		}
		
	}

}
