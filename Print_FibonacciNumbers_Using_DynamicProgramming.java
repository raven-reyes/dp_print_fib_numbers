
public class Print_FibonacciNumbers_Using_DynamicProgramming {
	
	public static int Print_FibonacciNumbers_Using_DP(int n) {
		// declare an array to store fibonacci numbers . add extra spaces to handle cases
		int fib [] = new int [n+ 2];
		// the 0th and 1st fibonacci numbers are 0 and 1 
		fib[0]= 0;
		fib[1] = 1;
		// iterate through the array starting from i = 2 and i is less or equals to n
		for(int i = 2; i <=n; i++) {
			// add the previous two fibonacci numbers in the series  and store it until i = n
			fib[i] = fib[i-1] + fib[i-2];
		}
		// when i is equals to n , return the fibonacci number of n
		return fib[n];
	}

	public static void main(String[] args) {
		int n = 9;
		// print the first n numbers 
				System.out.println("the first 9 fib numbers are " );
		for(int i = 0; i < n;i++) {
			System.out.print(Print_FibonacciNumbers_Using_DP(i) + " ");
		}

	}

}
