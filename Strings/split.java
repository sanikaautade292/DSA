class Demo{
	public static void main(String [] args){
		String s ="hello welcome to the world of coding";
		String [] words = s.split(" ");
		for (String str : words){
			System.out.println(str);
		}
	}
}

/*

Output:

hello
welcome
to
the
world
of
coding

*/