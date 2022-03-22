import java.util.Scanner;

public class Zad_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    System.out.println("Podaj liczbe karoli i tłuszczy w produkcie ");
    double kalori=klawisz.nextDouble();
    double tluszcze=klawisz.nextDouble();
    double kaloriet=tluszcze *9;
    if(kaloriet>kalori)
    {
    System.out.println("Dane wejściowe są niewłaściwe");
    }	
    else
    {
    	double procent = kaloriet/kalori*100;
    	System.out.println("Procent tluszczu w tym produkcie wynosi "+procent + " %");
    	if(procent<30)
    		System.out.println("\nJest to produkt niskotłuszcowy");
    }

}
}