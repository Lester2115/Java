import java.util.Scanner;

public class Zad_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    
    System.out.println("Podaj dlugosc rzedu");
    double dlugoscRzedu=klawisz.nextDouble();
    System.out.println("Podaj miejsce zajmowane przez okratowanie");
    double okratowanie=klawisz.nextDouble();
    System.out.println("Podaj odleglosc miedzy sadzonkami ");
    double odlegloscMiedzySadzonkami=klawisz.nextDouble();
    
    double liczbaSadzonek=(dlugoscRzedu-(2*okratowanie))/odlegloscMiedzySadzonkami;
    
    System.out.println("Wlasciciel winnicy moze posadzic " +liczbaSadzonek + " sadzonek");
	}

}
