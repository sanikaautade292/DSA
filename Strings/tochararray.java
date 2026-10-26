class Demo{
	public static void main(String [] args){
		String s = " hello ";
		char [] ch = s.toCharArray();
		
		for( char ch1: ch){
			System.out.println(ch1);
		}
	}
}

/*

Output:

h
e
l
l
o

*/
