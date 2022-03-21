import java.util.Scanner;

public class Zad_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		System.out.println("Podaj mase obiektu");
		double masa=klawisz.nextDouble();
		double ciezar=masa*9.8;
		if(ciezar>1000)
		{
			System.out.println("Obiekt jest za ciezki");
		}
		else if(ciezar<10)
		{
			System.out.println("Obiekt jest za lekki");
		}
		else
		{
			System.out.println("Waga tego obiektu wynosi "+ ciezar + " niutonow");
		}
	}

}
