import java.util.Scanner;
class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String secName = sc.next();
		String fullName = firstName +" "+ secName;
		System.out.println(fullName);
	}
}

/*
Output:

Ram
Jadhav
Ram Jadhav


*/