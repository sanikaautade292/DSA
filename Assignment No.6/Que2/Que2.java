class Que2{
	public static void main(String [] args){
		fun(2);
	}
	static void fun(int n){
		if(n==0){
			return;
		}
		System.out.print("X ");
		fun(n-1);
		System.out.print("Y ");
		fun(n-1);
	}
}
	