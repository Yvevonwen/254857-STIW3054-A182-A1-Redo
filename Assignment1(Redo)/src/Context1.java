
public class Context1 {
	private Strategy1 strategy1;
	
	
	public Context1(Strategy1 strategy1) {
		this.strategy1=strategy1;
		
	}
	
	public int executeStrategy(int num1, int num2, int num3) {
		return strategy1.doOperation(num1, num2, num3);
	}
	
	
	
	
}
