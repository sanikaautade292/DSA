class Demo5{
	public static void main(String [] args){
		int n=5;
		f(n);
	}
	static void f(int n){
		if(n==0){
			return;
		}
		System.out.println("A:"+n);
		System.out.println("B:"+n);
		f(n-1);
	}
}

/*

Output:

A:5
B:5
A:4
B:4
A:3
B:3
A:2
B:2
A:1
B:1

*/