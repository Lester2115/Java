import java.util.Scanner;

public class Zad_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		System.out.println("Podaj pakiet (A,B lub C) oraz liczbe minut rozmów");
		String pakiet=klawisz.nextLine();
		int minuty = klawisz.nextInt();
		double koszt,koszt2,koszt3;
		 koszt3=69.99;
		switch(pakiet)
		{
		case "A":
			koszt=39.99;
			if(minuty>450)
			{
				koszt+=(minuty-450) *0.45;
				System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
			   
				if(minuty>900)
				{
					koszt2=(minuty-900)*0.40;
					if(koszt2<koszt && koszt2>0 )
				    {
				    	System.out.println("\n Na pakiecie B zarobiłbyć " + (koszt-koszt2) + " zł");
				    }
				}
				else {
					koszt2=59.99;
					if(koszt2<koszt && koszt2>0 )
				    {
				    	System.out.println("\n Na pakiecie B zarobiłbyć " + (koszt-koszt2) + " zł");
				    }
				}
				
				if(koszt3<koszt && koszt3>0 )
			    {
			    	System.out.println("\n Na pakiecie C zarobiłbyć " + (koszt-koszt3) + " zł");
			    }
			}
			else
			{
				System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
			}
			
			
			break;
		
		case "B":
			koszt=59.99;
			if(minuty>900)
			{
				koszt+=(minuty-900) *0.40;
				System.out.println("Opłata za ten miesiac wynosi " +koszt + " zł");
			    
				if(koszt3<koszt && koszt3>0 )
			    {
			    	System.out.println("\n Na pakiecie C zarobiłbyć " + (koszt-koszt3) + " zł");
			    }
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
