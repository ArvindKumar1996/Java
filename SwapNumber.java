package demoPack;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=10;
        int y=20;
        //without using third variable
//		        x=x+y;
//		        y=x-y;
//		        x=x-y;
        //using * operator
//        x=x*y;
//        y=x/y;
//        x=x/y;
        //using XOR
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
	}

}
