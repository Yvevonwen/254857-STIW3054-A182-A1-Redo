import java.util.Scanner;

public class AdjustingManHours extends CalcuSoftwareEffortEstimation{
	private double coefficients,adjustedManH;

	
	public void CalcuAdjustingMan_hours(double totalManH) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nFifth...");
		System.out.print("Enter Risk Coefficients in %:");
		coefficients = scan.nextDouble();
		adjustedManH = ((1.0+(coefficients/100) )* totalManH);
		System.out.printf("Adjusted man-hours = %.2f (adjusted man-hour)\n",adjustedManH);	
	}
	
	public double getAdjusting() {
		return adjustedManH;
	}

}
