package dwinston;

public class Main {

    public static void main(String[] args) {
	    int n = 1000;
	    int x = 3;
	    int y = 5;
	    int sum = 0;

	    for (int i = 0; i < n; i++) {
	        if (i%x==0 || i%y==0) {
	            sum += i;
            }
        }
        System.out.println("The sum of all the multiples of " + x + " or " + y + " below " + n + " is: " + sum);
    }
}
