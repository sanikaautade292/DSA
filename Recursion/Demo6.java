class Demo6{
	public static void main(String [] args){
		int n = 5;
		f(n);
	}
	static void f(int n){
		if(n==0){
			System.out.println(n);
			return;
		}
		f(n-1);
		System.out.println("A:"+n);
		System.out.println("B:"+n);
	}
}

/*

Output:

0
A:1
B:1
A:2
B:2
A:3
B:3
A:4
B:4
A:5
B:5

*/