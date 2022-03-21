import java.util.Scanner;

public class Zad_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		System.out.println("Podaj dzien,miesiac(jako liczba) i dwie ostatnie cyfry roku");
		int dzien=klawisz.nextInt();
		int miesiac = klawisz.nextInt();
		int rok = klawisz.nextInt();
		
		if(dzien*miesiac==rok)
		{
			System.out.println("Ta data jest magiczna");
		}
		else
			System.out.println("Data nie jest magiczna");
	}

}
