class Nto1{
	public static void main(String [] args){
		int n=3;
		fun(3,n);
	}
	static void fun(int i, int n){
		if(i<1){
			return;
		}
		System.out.println(i);
		fun(i-1,n);
	}
}
/*
3
2
1
*/
