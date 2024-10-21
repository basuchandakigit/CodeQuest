package Navie;

public class Fibo {

	
	public int fibos(int j)
	{
		return fibos(j-1)+fibos(j-2);
	}

	@Override
	public String toString() {
		return "Fibo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
