
public class Zad_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double cenaAkcji = 21.77;
    double ilosc = 600;
    double kwotaZaAkcje=ilosc*cenaAkcji;
    double prowizja=kwotaZaAkcje*0.02;
	double kwotaZProwizjo=kwotaZaAkcje+prowizja;
	System.out.println("Kwota z akcji : "+kwotaZaAkcje + "\n Wysokosc prowizji : "+prowizja+ "\n Zaplacona kwota : "+ kwotaZProwizjo);
	
	}

}
