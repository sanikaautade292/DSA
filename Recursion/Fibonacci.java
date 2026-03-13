class Fibonacci{
	public static void main(String [] args){
		int n=6;
		int fibo = f(n);
		System.out.println(fibo);
	}
	static int f(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int last = f(n-1);
		int seclast = f(n-2);
		return last + seclast;
	}
}


/*

Output:

8

*/

