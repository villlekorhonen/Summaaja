import java.util.Scanner;


public class Summaaja {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int summa = 0;
		while (true) {
			try {
				System.out.print("Syötä seuraava luku (0 lopettaa): ");
				String syote = input.nextLine();
				int luku = Integer.parseInt(syote);
				summa = summa + luku;
				if (luku == 0)
				break;
			} catch (NumberFormatException e ) {
				System.out.println("Virheellinen syöte!");
			}
		}
			System.out.println("Lukujen summa on "+ summa +".");
	
		
		input.close();


		}
	}
