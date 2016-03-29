package Assign4;

public class Exp {
	static int x = 5;
	static int y = 10;
	static int z,a,b,c;

	public static void main(String[] args) {
		System.out.println("Value of X : "+x);
		System.out.println("Value of Y : "+y);
		z = x+y*2;
		System.out.println("Value of X+Y*2 = "+z);
		a = x-y+2;
		System.out.println("Value of X-Y+2 = "+a);
		b = (x+y)*2;
		System.out.println("Value of (X+Y)*2 = "+b);
		c= y%x;
		System.out.println("Value of y%x = "+c);
	}

}
