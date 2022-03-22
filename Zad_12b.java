import java.util.Scanner;

public class Zad_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner klawisz = new Scanner(System.in);
    
    System.out.println("Wybierz w czym ma rozchodzić się dżwięk \n powietrze , woda , stal");
    String nosnik = klawisz.nextLine();
    System.out.println("Podaj odległośc do przebycia");
    double odleglosc = klawisz.nextDouble();
    double czas;
    
	switch(nosnik)
	{
	case "powietrze" :
		czas = odleglosc/343;
	    System.out.println("Dżwięk pokona tą odległość w " + czas + " sekundy ");
	    break;
	
	case "woda" :
		czas = odleglosc/1490;
		System.out.println("Dżwięk pokona tą odległość w " + czas + " sekundy ");
		break;
		
	case "stal" :
		czas = odleglosc/5100;
		System.out.println("Dżwięk pokona tą odległość w " + czas + " sekundy ");
		break;
		
	default :
		System.out.println("Dane są nieprawidłowe");
	}
	
	}

}
