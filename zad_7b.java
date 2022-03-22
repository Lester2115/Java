import java.util.Scanner;

public class zad_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner klawisz = new Scanner(System.in);
		System.out.println("Podaj trzy imiona do pososrtowania");
		String imie1=klawisz.nextLine();
		String imie2=klawisz.nextLine();
		String imie3=klawisz.nextLine();
		if(imie1.charAt(0)<imie2.charAt(0)&&imie1.charAt(0)<imie3.charAt(0))
		{
			if(imie2.charAt(0)<imie3.charAt(0))
			{
				System.out.println(imie1 +"\n"+imie2+"\n"+imie3);
			}
			else
			{
				System.out.println(imie1 +"\n"+imie3+"\n"+imie2);
			}
			
		}
		else if(imie2.charAt(0)<imie1.charAt(0)&&imie2.charAt(0)<imie1.charAt(0))
		{
			if(imie1.charAt(0)<imie3.charAt(0))
			{
				System.out.println(imie2 +"\n"+imie1+"\n"+imie3);
			}
			
			else
			{
				System.out.println(imie2 +"\n"+imie3+"\n"+imie1);
			
			}
		}
		else if(imie3.charAt(0)<imie1.charAt(0)&&imie3.charAt(0)<imie2.charAt(0))
		{
			if(imie2.charAt(0)<imie1.charAt(0))
			{
				System.out.println(imie3 +"\n"+imie2+"\n"+imie1);
			}
			else
			{
				System.out.println(imie3 +"\n"+imie1+"\n"+imie2);
			}
		}
		
	}

}
