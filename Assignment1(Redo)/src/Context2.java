
public class Context2 {
	private Strategy2 strategy2;
	
	public Context2(Strategy2 strategy2) {
		this.strategy2 = strategy2;
	}
	public int executeStrategy1(int num1, int num2) {
		return strategy2.Operation(num1, num2);
	}
}
