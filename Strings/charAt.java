import java.util.Scanner;
class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();

		for(int i=0 ; i<Name.length() ; i++){		
			
			System.out.println(Name.charAt(i));
		}
	}
}

/*
Output:
hello world
h
e
l
l
o

w
o
r
l
d

*/