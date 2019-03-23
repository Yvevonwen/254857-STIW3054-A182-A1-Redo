import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcuActor extends CalcuSoftwareEffortEstimation implements Strategy1{
	private int quantitySimple, quantityAverage, quantityComplex,totalActorPoints;
	private int weightFSimple = 1;
    private int weightFAverage = 2;
    private int weightFComplex = 3;
    
    public int doOperation(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
    private int CalculateSimple() {
        return quantitySimple * weightFSimple;
    }

    private int CalculateAverage() {
        return quantityAverage * weightFAverage;
    }

    private int CalculateComplex() {
        return quantityComplex * weightFComplex;
    }
    
    public void userInputTable1() {
    	try {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("First...");
         System.out.println("Please enter the quantity for each ACTOR type: ");
         System.out.print("1. Simple : ");
         quantitySimple = scan.nextInt();
         System.out.print("2. Average : ");
         quantityAverage = scan.nextInt();
         System.out.print("3. Complex : ");
         quantityComplex = scan.nextInt(); 
    	}catch(InputMismatchException e) {
    		System.out.println("Invalid input!Please enter number only!");
    	}
    }
    
    public void totalActorPoints() {
    	Context1 context = new Context1(new CalcuActor());
    	totalActorPoints = context.executeStrategy(CalculateSimple(), CalculateAverage(), CalculateComplex());
        System.out.println("Total Actor Points :"+ totalActorPoints);
    }
    
    public int getTotalActorPoints() {
        return totalActorPoints;
    }

}
