import java.util.Scanner;

public class Zad_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    
    
    System.out.println("Podaj wplacono kwote");
    double kwotaPierwotna=klawisz.nextDouble();
    System.out.println("Podaj oprocentowanie");
    double rocznaStopa=klawisz.nextDouble()/100;
    System.out.println("Podaj ilosc odsetek");
    double iloscOdsetek=klawisz.nextDouble();
    System.out.println("Podaj przez ile lat");
    double lata=klawisz.nextDouble();
    double kwotaPoLatach=kwotaPierwotna * Math.pow(1+(rocznaStopa/iloscOdsetek),iloscOdsetek*lata);
	System.out.println("Wplacona kwota po podanym czasie bedzie wynosic : "+kwotaPoLatach);
	}

}
