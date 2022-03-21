import java.util.Scanner;

public class Zad_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    
    System.out.println("Podaj cene posilku");
    double cena = klawisz.nextDouble();
    double podatek = 0.0675;
    double napiwek = 0.2;
    double pPodatek = cena*podatek;
    double napiwekOtrzymany=(cena+pPodatek) *0.2;
    double lacznie = cena + pPodatek + napiwekOtrzymany;
    System.out.println("Cena produktu : "+cena + "\n Podatek: " + pPodatek + "\n Napiwek : "+ napiwekOtrzymany + "\n Lacznie : " + lacznie);;
	}

}
