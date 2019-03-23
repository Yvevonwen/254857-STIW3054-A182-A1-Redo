
public class Context4 {
private Strategy4 strategy4;
	
	public Context4(Strategy4 strategy4) {
		this.strategy4 = strategy4;
	}
	public double executeStrategy4(double num1,double num2,double num3,double num4,double num5,double num6,double num7,double num8) {
		return strategy4.DoOperation(num1, num2, num3, num4, num5, num6, num7, num8);
	}
}
