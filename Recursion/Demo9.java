class Demo9{
	public static void main(String [] args){
		int n=4;
		f(n);
	}
	static void f(int n){
		if(n==0){
			return;
		}
		f(n-1);
		System.out.println("100");
		f(n-1);
	}
}

/*

Output:

100
100
100
100
100
100
100
100
100
100
100
100
100
100
100

*/