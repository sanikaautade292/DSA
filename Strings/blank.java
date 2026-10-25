class Demo{
	public static void main(String [] args){
		String str = "   ";
		System.out.println(str.isBlank());
		String str1 = "";
		System.out.println(str1.isBlank());
		String str2 = " hello";
		System.out.println(str2.isBlank());
	}
}


/*

Output:

true
true
false

*/
