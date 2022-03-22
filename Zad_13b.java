import java.util.Scanner;

public class Zad_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner klawisz = new Scanner(System.in);
	
	System.out.println("Podaj pakiet (A,B lub C) oraz liczbe minut rozmów");
	String pakiet=klawisz.nextLine();
	int minuty = klawisz.nextInt();
	double koszt;
	switch(pakiet)
	{
	case "A":
		koszt=39.99;
		if(minuty>450)
		{
			koszt+=(minuty-450) *0.45;
			System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
		}
		else
			System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
	    break;
	
	case "B":
		koszt=59.99;
		if(minuty>450)
		{
			koszt+=(minuty-900) *0.40;
			System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
		}
		else
			System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
	    break;
     case "C":
	   koszt=69.99;
	   System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
       break;
	  default:
		  System.out.println("Podano złe dane");
	}
	}

}
