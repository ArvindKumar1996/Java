package demoPack;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="Arvind";
        String b="Kumar";
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
	}

}
