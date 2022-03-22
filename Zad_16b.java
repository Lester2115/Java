import java.util.Scanner;

public class Zad_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		System.out.println("Podaj ile książek kupiłeś w tym miesiącu ");
		
		int book = klawisz.nextInt();
		int points;
		switch(book)
		{
		case 0:
			points=0;
			System.out.println("W tym miesiącu zdobyłeś " + points + " punktów !");
			break;
		case 1:
			points=5;
			System.out.println("W tym miesiącu zdobyłeś " + points + " punktów !");
			break;
		case 2:
			points=15;
			System.out.println("W tym miesiącu zdobyłeś " + points + " punktów !");
			break;
		case 3:
			points=30;
			System.out.println("W tym miesiącu zdobyłeś " + points + " punktów !");
			break;
		default:
			points=60;
			System.out.println("W tym miesiącu zdobyłeś " + points + " punktów !");
		
		}
		
		
	}

}
