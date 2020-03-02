package apachekafka;

public class triangle {
    public static void main(String args[]) {
    	int i=3;
        int first = 0;
        int second = 1;
        int third=0;
        int fibNumber = 10;
        System.out.print(first + " ");
        System.out.print(second + " ");
        while( i <= fibNumber) {
        	
        	third=first+second;
        	
        	System.out.print(third + " ");
        	
        	first=second;
        	second=third;
        	i++;
        }
    }
}