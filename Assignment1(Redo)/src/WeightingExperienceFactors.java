import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingExperienceFactors extends CalcuSoftwareEffortEstimation{
	private double totalEFator,EF,UCP,e1,e2,e3,e4,e5,e6,e7,e8;
	private double totalE1=0,totalE2=0,totalE3=0,totalE4=0,totalE5=0,totalE6=0,totalE7=0,totalE8=0;
	private int count=0;
	double [] weightRating = {1,0.5,1,0.5,0,2,-1,-1};
	Context3 context3 = new Context3(new MultiStrategy());
	
	
	public void CalcuWeightingEF() {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Fourth...");
		do {
			System.out.printf("Please enter project rating for E1 (0-5):");
			e1 = scan.nextInt();
			totalE1 = context3.executeStrategy2(weightRating[0], e1);
				}while (e1<0 || e1>5);	
		do {
			System.out.printf("Please enter project rating for E2 (0-5):");
			e2 = scan.nextInt();
			totalE2 = context3.executeStrategy2(weightRating[1], e2);
				}while (e2<0 || e2>5);	
		do {
			System.out.printf("Please enter project rating for E3 (0-5):");
			e3 = scan.nextInt();
			totalE3 = context3.executeStrategy2(weightRating[2], e3);
				}while (e3<0 || e3>5);	
		do {
			System.out.printf("Please enter project rating for E4 (0-5):");
			e4 = scan.nextInt();
			totalE4 = context3.executeStrategy2(weightRating[3], e4);
				}while (e4<0 || e4>5);	
		do {
			System.out.printf("Please enter project rating for E5 (0-5):");
			e5 = scan.nextInt();
			totalE5 = context3.executeStrategy2(weightRating[4], e5);
				}while (e5<0 || e5>5);	
		do {
			System.out.printf("Please enter project rating for E6 (0-5):");
			e6 = scan.nextInt();
			totalE6 = context3.executeStrategy2(weightRating[5], e6);
				}while (e6<0 || e6>5);	
		do {
			System.out.printf("Please enter project rating for E7 (0-5):");
			e7 = scan.nextInt();
			totalE7 = context3.executeStrategy2(weightRating[6], e7);
				}while (e7<0 || e7>5);	
		do {
			System.out.printf("Please enter project rating for E8 (0-5):");
			e8 = scan.nextInt();
			totalE8 = context3.executeStrategy2(weightRating[7], e8);
				}while (e8<0 || e8>5);	
		}catch(InputMismatchException e) {
    		System.out.println("Invalid input!Please enter number only!");
    	}
	}
	
	public void TotalEFactor() {
		Context4 context4 = new Context4(new AddTotalEF());
		totalEFator = context4.executeStrategy4(totalE1, totalE2, totalE3, totalE4, totalE5, totalE6, totalE7, totalE8);
		System.out.println("\nTotal Exeprience Factors : "+Math.round(totalEFator));		
	}
	
	public double getEFactor() {
		return totalEFator;
	}
	
	public void CalcuExperienceFactor() {
		EF = (-0.03*totalEFator)+1.4; 
		System.out.println("TCF : "+EF);
	}
	public double getEF() {
		return EF;
	}
	
	public void CalcuUseCasePoints(double SzUC) {
		UCP =context3.executeStrategy2(SzUC, EF);
		System.out.printf("UCP : %.3f\n",UCP);
	}
	public double getUCP() {
		return UCP;
	}	
	
	public void calcuCount() {
		if (e1<3) {
			count++;}
		if (e2<3) {
			count++;}
		if (e3<3) {
			count++;}
		if (e4<3) {
			count++;}
		if (e5<3) {
			count++;}
		if (e6<3) {
			count++;}
		if (e7>=3) {
			count++;}
		if (e8>=3) {
			count++;}		
	}
	public int getCount() {
		return count;
	}
	}
