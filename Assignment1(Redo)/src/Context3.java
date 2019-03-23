
public class Context3 {
	private Strategy3 strategy3;
	
	public Context3(Strategy3 strategy3) {
		this.strategy3 = strategy3;
	}
	public double executeStrategy2(double num1, double num2) {
		return strategy3.operation(num1, num2);
	}
}
