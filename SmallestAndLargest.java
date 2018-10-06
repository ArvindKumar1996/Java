package demoPack;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int numbers[]= {10,-10,-88,23,11,90,121};
            int smallest=numbers[0];
            int largest=numbers[0];
            for(int i=0; i<=numbers.length-1;i++) {
            	if(numbers[i]>largest) {
            		largest=numbers[i];
            	}
            	else if(numbers[i]<smallest) {
            		smallest=numbers[i];
            	}
            }
            System.out.println("Smallest : "+smallest);
            System.out.println("Largest : "+largest);
	}

}
