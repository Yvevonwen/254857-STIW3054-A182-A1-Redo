
public class CalcuManHours extends CalcuSoftwareEffortEstimation{
	private double ER;
	private double totalManH=0;
	Context3 context3 = new Context3(new MultiStrategy());
	
	public void CalculationManHours(int count) {
		if(count<=2) {
			ER=20.0;			
		}
		 if (count>=3 || count<=4) {
			ER=28.0;
		}
		else {
			System.out.println("The project team so that the numbers fall at least below 5");}	
	} 
	
	public void totalManHours(double UCP) {
	    totalManH = context3.executeStrategy2(ER, UCP);
	 	System.out.printf("Total man-hours(ER) = %.3f Man-Hours",totalManH);
	}
	public double getManHours() {
		return totalManH;
	}
		
}
