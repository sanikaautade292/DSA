import java.util.Scanner;
class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		Name = Name.concat(" Jadhav ");
		System.out.println(Name);
	}
}

/*
Output:

Ram
Ram Jadhav


explanation:

1.String name = "Ram"; — We create a String object containing "Ram".

2.name.concat(" Jadhav"); — The concat() method creates a new String "Ram Jadhav" without changing the original String "Ram".

3.name = name.concat(" Jadhav"); — The new String "Ram Jadhav" is assigned to the variable name. Now, name refers to the new String object.

4.System.out.println(name); — It prints "Ram Jadhav" because the variable name now refers to the new String.

*/