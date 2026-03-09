class Demo{
	public static void main(String [] args ){
		fun();
	}
	 static void fun(){
		System.out.println("1 ");
		fun();
	}
}


 
// it gives the stack overflow error

