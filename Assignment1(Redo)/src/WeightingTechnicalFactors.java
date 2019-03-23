import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingTechnicalFactors extends CalcuSoftwareEffortEstimation{
	private double totalTFactor,TCF,SzUC,T;
	private double subT=0;
	double [] weightRating = {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
	Context3 context3 = new Context3(new MultiStrategy());
		
	public void CalcuWeightingTF() {	
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Third...");
		for (int i=0;i<13;i++) {	        
    		do {
    			System.out.printf("Please enter project rating for T%d (0-5):",i+1);
    			T = scan.nextInt();
    			subT = subT + context3.executeStrategy2(weightRating[i], T);
			}while (T<0 || T>5);   		
        }
		}catch(InputMismatchException e) {
    		System.out.println("Invalid input!Please enter number only!");
    	}
	}
	public void TotalTFactor() {
		totalTFactor = subT;
		System.out.println("\nTotal Technical Factor : "+Math.round(totalTFactor));		
	}
	public double getTFactor() {
		return totalTFactor;
	}
	
	public void TechnicalComplexityFactor() {
		TCF = (0.01*totalTFactor)+0.6;
		System.out.println("TCF : "+TCF+"  TCF");
	}
	public double getTCF() {
		return TCF;
	}
	public void SizeOfTheSoftware(int UUCP) {
		SzUC =context3.executeStrategy2(UUCP, TCF);
		System.out.println("SzUC : "+SzUC);
	}
	public double getSzUC() {
		return SzUC;
	}	
	}



