package garbage.collector;

public class Garbage {
	public void finalize()
	{
		System.out.println("garbage collection");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbage g1=new Garbage();
		Garbage g2=new Garbage();
		g1=null;
		//g2=null;
		System.gc();

	}

}
