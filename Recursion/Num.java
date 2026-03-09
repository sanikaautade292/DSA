class Num{
	public static void main(String [] args){
		fun();
	}
	static int count = 0;
	static void fun(){
		if(count == 3){
			return;
		}
		System.out.println(count);
		count ++;
		fun();
	}
}

/*
0
1
2
*/