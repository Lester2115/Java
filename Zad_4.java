import java.util.Scanner;

public class Zad_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		System.out.println("Podaj wyniki z 3 sprawdzianow");
		double wynik1=klawisz.nextDouble();
		double wynik2=klawisz.nextDouble();
		double wynik3=klawisz.nextDouble();
		double srednia = (wynik1+wynik2+wynik3)/3;
		if(srednia>=90)
		{
			System.out.println("Dostles 5");
		}
		else if(srednia>=80)
		{
			System.out.println("Dostles 4");
		}
		else if(srednia>=70)
		{
			System.out.println("Dostles 3 ");
		}
		else if(srednia>=60)
		{
			System.out.println("Dostles 2 ");
		}
		else
		{
			System.out.println("Dostles 1 ");
		}
	}

}
