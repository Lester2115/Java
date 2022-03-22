import java.util.Scanner;

public class Zad_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    
    System.out.print("Podaj wage(w kilogramach) paczki i odleglość dostarczenia");
    double waga=klawisz.nextDouble();
    int odleglosc=klawisz.nextInt();
    int stawka=(odleglosc/500)+1;
    double koszt;
    if(waga<=1)
    {
    	koszt = 1.10*stawka;
    	System.out.println("Koszt twojej paczki wynosi "+koszt);
    }
    if(waga>1&& waga<=3)
    {
    	koszt = 2.20*stawka;
    	System.out.println("Koszt twojej paczki wynosi "+koszt);
    }
    if(waga>3&&waga<=5)
    {
    	koszt = 3.70*stawka;
    	System.out.println("Koszt twojej paczki wynosi "+koszt);
    }
    if(waga>5)
    {
    	koszt = 3.80*stawka;
    	System.out.println("Koszt twojej paczki wynosi "+koszt);
    }
	}

}
