// sum of all numbers from 1 to n 


class Sum2{
	public static void main(String [] args){
		int n = 3;
		int sum = f(n);
		System.out.println(sum);
	}
	static int f(int n){
		if(n == 0){
			return 0;
		}
		int val = f(n-1);
		return val + n;
		
	}
}

/*

6

*/