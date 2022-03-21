import java.util.Scanner;

public class Zad_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    
    System.out.println("Podaj liczbe sekund");
    int sekundy = klawisz.nextInt();
    System.out.println(sekundy + " sekund to " + sekundy/86400 + " dni "+ sekundy%86400/3600 + " godzin "+ sekundy%86400%3600/60 + " minut "+ sekundy%86400%36000%60 + " sekund");
    }
}
