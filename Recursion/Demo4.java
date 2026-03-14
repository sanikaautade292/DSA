class Demo4{
	public static void main(String [] args){
		int n = 5;
		f(n);
	}
	static void f(int n){
		if(n==0){
			return;
		}
		System.out.println("Start:"+n);
		f(n-1);
		System.out.println("End:"+n);
	}
}

/*

Output:

Start:5
Start:4
Start:3
Start:2
Start:1
End:1
End:2
End:3
End:4
End:5

*/