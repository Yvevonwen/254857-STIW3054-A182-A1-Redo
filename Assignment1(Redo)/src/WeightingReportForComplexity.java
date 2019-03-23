import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingReportForComplexity extends CalcuSoftwareEffortEstimation{
		private int quantitySimple, quantityAverage, quantityComplex;
		private int simple = 12;
		private int average = 20;
		private int complex = 40;
		private double totalReport;
		Context3 context3 = new Context3(new MultiStrategy());
		
		private double CalcuSimple() {
			return context3.executeStrategy2(simple, quantitySimple);
		}
		
		private double CalcuAverage() {
			return context3.executeStrategy2(average, quantityAverage);
		}
		
		private double CalcuComplex() {
			return context3.executeStrategy2(complex, quantityComplex);
		}
		
		public void Table5() {
			try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Sixth...");
			System.out.println("Table 5 Weighting Reports for Complexity");
			System.out.println("------------------------");
			System.out.println("|  Report Type | Quality");
			System.out.printf("|     Simple   |   ");
			quantitySimple = scan.nextInt();
			System.out.printf("|    Average   |   ");
			quantityAverage = scan.nextInt();
			System.out.printf("|    Complex   |   ");
			quantityComplex = scan.nextInt();	
			}catch(InputMismatchException e) {
	    		System.out.println("Invalid input!Please enter number only!");
	    	}
		}
		
		public void TotalReport() {
			 Context5 context5 = new Context5(new Add2());
			 totalReport= context5.executeStrategy5(CalcuSimple(), CalcuAverage(), CalcuComplex());
			 System.out.println("Total Report Man-hour Estimate : "+Math.round(totalReport));
		}
		
		public double getTotalReport() {
			return totalReport;
		}
		public void CalcuTotalAdjustingManHoursProject(double adjustedManH) {
			Context6 context6 = new Context6(new Add3());
			double totalMan = context6.do_operation(adjustedManH, totalReport);
			System.out.printf("The Total man-hours for the project = %.2f total man-hours",totalMan);
			
		}
}
