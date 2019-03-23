
public class Context5 {
	private Strategy5 strategy5;

	public Context5(Strategy5 strategy5) {
	this.strategy5 = strategy5;
}
	public double executeStrategy5(double num1,double num2,double num3) {
		return strategy5.do_Operation(num1, num2, num3);
	}
}
