class Sum{
	public static void main(String [] args){
		int n=5;
		int sum = 0;
		f(sum , n);
	}
	static void f(int sum, int n){
		if(n<1){
			System.out.println(sum);
			return;
		}
		sum = sum + n;
		f(sum,n-1);
	}
}

/*
15
*/