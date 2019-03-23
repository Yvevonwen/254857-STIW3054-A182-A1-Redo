
public class Context6 {
	private Strategy6 strategy6;
	
	public Context6(Strategy6 strategy6) {
		this.strategy6 = strategy6;
	}
	public double do_operation(double num1,double num2) {
		return strategy6.do_operation(num1, num2);
	}
}
