class Num5{
	public static void main(String [] args){
		int n=3;
		fun(3,n);
	}
	static void fun(int i , int n){
		if(i<1){
			return;
		}
		fun(i-1,n);
		System.out.println(i);
	}
}
/*
1
2
3



 printing 1 to n without using the +
*/

