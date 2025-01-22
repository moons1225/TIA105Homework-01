package work6;

public class Calculator {
	private int x ;
	private int y ;
	public int powerXY(int x, int y) throws CalException{
		if(x == 0 && y==0) 
			throw new CalException("0的0次方沒有意義！");
		if(y<0) 
			throw new CalException("次方為負值，回傳結果不為整數");

		return (int)Math.pow(x,y);
		
	}
}
