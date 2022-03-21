import java.util.Scanner;

public class Zad_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		System.out.println("Podaj nazwe ulubionego miasta");
		String miasto=klawisz.nextLine();
		int liczbaZnakow=miasto.length();
		String duze=miasto.toUpperCase();
		String male=miasto.toLowerCase();
		char pierwsza=miasto.charAt(0);
		System.out.println("Nazwa miasta :" + miasto + "\n Liczba znakow : "+ liczbaZnakow + "\n Miasto z duzych liter : " + duze + "\n Miasto z malych liter : "+male );
	}

}
