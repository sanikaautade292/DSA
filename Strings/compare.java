import java.util.Scanner;
class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		String Name1 = sc.next();
		String Name2 = sc.next();
		System.out.println(Name1.compareTo(Name2));
	}
}

/*
Output:
Sanika
Sanika
0

Sanika                 S= 83 , s=115
sanika                 83-115 = -32 
-32

sanika                s=115, S= 83 
Sanika		      115 -83 =32
32



*/