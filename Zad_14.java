
public class Zad_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double akcje=1000;
    double cenaZakupuAkcji=32.87;
    double cenaZakupu=akcje*cenaZakupuAkcji;
    double cenaSprzedazyAkcji=33.92;
    double cenaSprzedazy=akcje*cenaSprzedazyAkcji;
    double pierwszaProwizja=cenaZakupu*0.02;
    double drugaProwizja=cenaSprzedazy*0.02;
    double wydatek=cenaZakupu+pierwszaProwizja+drugaProwizja;
    double zysk= cenaSprzedazy;
    double worth = zysk-wydatek;
    
    System.out.println("Kwota za zakup akcje: "+ cenaZakupu + "\n Prowizja przy zakupie: "+pierwszaProwizja + "\n Kwota za sprzedaz akcji: "+ cenaSprzedazy + "\n Prowizja przy sprzedazy "+ drugaProwizja + "\n Pieniadze na koncu: "+worth);
    
	}

}
