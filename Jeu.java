import java.util.Random;
import java.util.Scanner;

public class Jeu {


	private static String[] tableauDesChoix= new String[3];

	public static void main(String[] args) {

		int poinplayer1=0;
		int choixRessayer='0';
		int poinplayer2=0;
		tableauDesChoix[0]= "pierre";
		tableauDesChoix[1]= "papier";
		tableauDesChoix[2]= "ciseaux";



	
		do {

			while(poinplayer1 < 3 && poinplayer2 < 3){

				// choix du joeur
				int selection;
				selection = playerChoice();

				// choix du PC


				Random rand = new Random();
				int choice = rand.nextInt(4-1) + 1;

				System.out.println("PC Choix:  "+ choice+"  ,  " +tableauDesChoix[choice-1]);
				System.out.println("Player 1:  "+ selection+"  ,  " +tableauDesChoix[selection-1]);

				System.out.println("Player 1 choix:   "+ tableauDesChoix[selection-1]+ " ,  PC choix:   "+ tableauDesChoix[choice-1]);
				if (selection == choice) {
					System.out.println("Egalite");	
				

				}else if ( selection == 1 && choice ==2 ||selection == 2 && choice ==3 || selection == 3 && choice ==1){
					System.out.println("WIN PC");	
					poinplayer2+=1;

				}
			
				else if ( selection == 1 && choice ==3 || selection == 2 && choice ==1 || selection == 3 && choice ==2 ){
					System.out.println("WIN Player 1");	
					poinplayer1+=1;
				}
				
				System.out.println(poinplayer1 +", "+ poinplayer2);
			}

			if(poinplayer1 == 3) {
				System.out.println("Player 1 WIN" );	
			}else {
				System.out.println("PC WIN" );

			}

			Scanner sc = new Scanner(System.in);
			System.out.println("Voulez-vous réessayer ? (O/N)");
			String choixRessayer1 = sc.nextLine();


			
			if (choixRessayer1.charAt(0) == 'O') {


			} 
			else {
				
				if (choixRessayer1.charAt(0) == 'N') {
					System.out.println("BYE"); 
				}
			}
		}while( choixRessayer == '0');
		

	}





	public static int playerChoice() {

		Scanner input= new Scanner(System.in);
		int choice;		


		do {

			System.out.println("1 pierre ");
			System.out.println("2 papier ");
			System.out.println("3 ciseaux");
			System.out.println(" Faire un choix ");
			choice=input.nextInt();

		} while (choice> 3|| choice <1);
		return choice;
	}









}






