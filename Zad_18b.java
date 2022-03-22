import java.util.Scanner;

public class Zad_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klawisz = new Scanner(System.in);
		
		
		boolean pyt1,pyt2,pyt3;
		System.out.println("Czy któraś z osób jest na diecie wegetariańskiej? \n 1)tak 2)nie");
		int odp=klawisz.nextInt();
		
		if(odp==1)
		{
			pyt1=true;
		}
		else
		{
			pyt1=false;
		}
		
		System.out.println("Czy któraś z osób jest na diecie wegańskiej? \n 1)tak 2)nie");
		odp=klawisz.nextInt();
		
		if(odp==1)
		{
			pyt2=true;
		}
		else
		{
			pyt2=false;
		}
		
		System.out.println("Czy któraś z osób jest na diecie bezglutenowej? \n 1)tak 2)nie");
		odp=klawisz.nextInt();
		
		if(odp==1)
		{
			pyt3=true;
		}
		else
		{
			pyt3=false;
		}
		
		System.out.println("Możesz udać się do następujących restauracji : ");
		
		if(pyt1==false && pyt2==false && pyt3==false)
		{
			System.out.println("Luksusowe Burgery u Jarka");
		}
		if(pyt2==false)
		{
			System.out.println("Pizzeria przy Dworcowejtak");
		}
		if(true)
		{
			System.out.println("Kawiarnia na Rogu");
		}
		if(pyt2==false && pyt3==false)
		{
			System.out.println("Włoskie specjały");
		}
		if(true)
		{
		  System.out.println("Kuchnia U Szefa");
		}
		
		
	}

}
