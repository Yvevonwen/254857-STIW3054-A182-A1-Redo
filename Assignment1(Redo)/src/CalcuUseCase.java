import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcuUseCase extends CalcuSoftwareEffortEstimation implements Strategy1,Strategy2{
	private int quantitySimple, quantityAverage, quantityComplex,totalUUCP, totalUseCase;
	private int weightFSimple =5;
    private int weightFAverage = 10;
    private int weightFComplex = 15;
    
    public int doOperation(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
    public int Operation(int num1, int num2) {
		return num1+num2;
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
	    public void userInputTable2() {
	    	try {
	    	Scanner scan = new Scanner(System.in);
	    	 System.out.println("Second...");
	    	 System.out.println("Please enter the quantity for each USE CASE type: " );
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
	  public void totalUseCase() {
		   Context1 context = new Context1(new CalcuUseCase());
		   totalUseCase =  context.executeStrategy(CalculateSimple(), CalculateAverage(), CalculateComplex());
	       System.out.println("\nTotal Use Case    : " +totalUseCase);
	     	    }

	   public void UnadjustedUseCasePoint(int UUCP) {
	    	Context2 context2 = new Context2(new CalcuUseCase());
	        totalUUCP = context2.executeStrategy1(UUCP, totalUseCase);				 
	        System.out.println("Unadjusted UseCase Points(UUCP) : " + totalUUCP);
	    }
	   public int getUUCP() {
	        return totalUUCP;
	    }
	}


