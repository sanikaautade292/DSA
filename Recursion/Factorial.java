// Factorial From 1 to N


class Factorial{
	public static void main(String [] args){
		int n = 6;
		int fact = f(n);
		System.out.println(fact);
	}
	static int f(int n){
		if(n == 1){
			return 1;
		}
		int val = f(n-1);
		return val * n;
	}
}


/*

720

*/