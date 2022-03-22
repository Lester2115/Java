import java.util.Scanner;

public class Zad_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner klawisz = new Scanner(System.in);
	System.out.println("Podaj ile pakietów kupiłeś ");
	double pakiety=klawisz.nextDouble();
	double koszt=99*pakiety;
	double rabat;
	if(pakiety>=10&&pakiety<=19){
	rabat=koszt*0.2;
	koszt-=rabat;
	System.out.println("Twój rabat wynosi 20% i musiz zaplacić "+koszt);
	}
	else if(pakiety>=20&&pakiety<=49){
		rabat=koszt*0.3;
		koszt-=rabat;
		System.out.println("Twój rabat wynosi 30% i musiz zaplacić "+koszt);
	}
	else if(pakiety>=50&&pakiety<=99){
		rabat=koszt*0.4;
		koszt-=rabat;
		System.out.println("Twój rabat wynosi 40% i musiz zaplacić "+koszt);
	}
	else if(pakiety>=100){
		rabat=koszt*0.5;
		koszt-=rabat;
		System.out.println("Twój rabat wynosi 50% i musiz zaplacić "+koszt);
	}
	else {
		System.out.println(" Musiz zaplacić "+koszt);
	}
	
	}

}
