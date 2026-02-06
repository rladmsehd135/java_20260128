package day8;

public class GoodCalc implements Calculator{

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int abs(int x) {
		// TODO Auto-generated method stub
		return Math.abs(x);
	}

	@Override
	public int max(int x, int y) {
		// TODO Auto-generated method stub
		return Math.max(x, y);
	}
	
	
	
}
