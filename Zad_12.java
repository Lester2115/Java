import java.util.Scanner;

public class Zad_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner klawisz = new Scanner(System.in);
    
    double cukier=1.5;
    double maslo = 1;
    double maka = 2.75;
    double iloscCiastek=48;
    
    System.out.println("Podaj ile chcesz zrobic ciastek");
    double ciastka = klawisz.nextDouble();
    double potrzebnyCukier=cukier/iloscCiastek * ciastka;
    double potrzebneMaslo=maslo/iloscCiastek * ciastka;
    double potrzebnaMaka= maka /iloscCiastek * ciastka;
    System.out.println("Potrzebujesz : \n Cukier: " + potrzebnyCukier + " szklanki" + "\n Maslo: " + potrzebneMaslo + " szklanki" + "\n Cukier: " + potrzebnaMaka + " szklanki");
	}

}
