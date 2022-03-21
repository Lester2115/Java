import java.util.Scanner;

public class Zad_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		System.out.println("Podaj liczbe od 1 do 10");
		int liczba = klawisz.nextInt();
		switch(liczba)
		{
		case 1:
			System.out.println("W rzymskim to I ");
			break;
		case 2:
			System.out.println("W rzymskim to II");
			break;
		case 3:
			System.out.println("W rzymskim to III");
			break;	
		case 4:
			System.out.println("W rzymskim to IV");
			break;
		case 5:
			System.out.println("W rzymskim to V");
			break;
		case 6:
			System.out.println("W rzymskim to VI");
			break;
		case 7:
			System.out.println("W rzymskim to VII");
			break;
		case 8:
			System.out.println("W rzymskim to VIII");
			break;
		case 9:
			System.out.println("W rzymskim to IX");
			break;
		case 10:
			System.out.println("W rzymskim to X");
			break;
		default:
			System.out.println("Liczba jest z poza zakresu");
		}
	}

}
