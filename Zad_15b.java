import java.util.Scanner;

public class Zad_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner klawisz = new Scanner(System.in);
	double oplata =10;
    
	System.out.println("Podaj ilośc czeków z tego miesiąca");
	int czeki=klawisz.nextInt();
	
	if(czeki<20)
	{
		oplata+=czeki*0.10;
		System.out.println("Opłata pobrana przez bank w tym miesiącu wynosi " + oplata + " zł");
	}
	else if(czeki<40)
	{
		oplata+=czeki*0.08;
		System.out.println("Opłata pobrana przez bank w tym miesiącu wynosi " + oplata + " zł");
	
	}
	
	else if(czeki<60)
	{
		oplata+=czeki*0.06;
		System.out.println("Opłata pobrana przez bank w tym miesiącu wynosi " + oplata + " zł");
	
	}
	else
	{
		oplata+=czeki*0.04;
		System.out.println("Opłata pobrana przez bank w tym miesiącu wynosi " + oplata + " zł");
	
	}
	
	}

}
