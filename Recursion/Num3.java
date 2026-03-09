class Num3{
	public static void main(String [] args){
    	 	int n=3;
		fun(1,n);
	}
	static void fun(int i, int n){
		if(i>n){
			return;
		}
		System.out.println("Sanika");
		fun(i+1,n);
	}
}
/*
Sanika
Sanika
Sanika
*/