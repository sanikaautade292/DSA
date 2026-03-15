class Demo8{
	public static void main(String [] args){
		int n = 5;
		f(n);
	}
	static void f(int n){
		if(n==0){
			System.out.println("500");
			return;
		}
		if(n==1){
			System.out.println("500");
			return;
		}
		System.out.println("100");
		f(n-2);
		System.out.println("200");
		f(n-2);
		System.out.println("300");
	}
}


/*

Output:

100
100
500
200
500
300
200
100
500
200
500
300
300

*/
