import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please type (1)type and (2)number of people or initial capital and (3)years");
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int type = sc.nextInt();
			
			switch(type){
			
				case 0://population
		//			int people = ; 
		//			int prate=;
		//			int pyears = ;
		//			int generation = ;
		
		//			GeomProgression<Integer> Population = new GeomProgression<Integer>(people,prate);
		//			Population.printProgression(generation+1);
					break;
				case 1://capital
		//			double initial = ; 
		//			double crate=;
		//			int cyears = ;
		//			GeomProgression<Double> Capital = new GeomProgression<Double>(initial, crate);
		//			Capital.printProgression(cyears+1);
					break;
				default:
					System.out.println("InvalidType please enter type for 0 or 1");
					//consume the following 3 useless tokens
					sc.next();
					sc.next();
					sc.next();
					break;
			}
		}
		sc.close();
	}

}
