import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
	int num =  no;
	int divi = 1;
	int digi = 0;
	while(num > 0){
		digi ++;
		num = num / 10;
	}
	num = no;
	for(int i=1 ; i<digi ; i++){
		divi = divi * 10;
	}
	int lastdigi = num % divi;
	int square = lastdigi * lastdigi;
	
	if ( no == square){
		System.out.println(" yes ");
	}
	else{
		System.out.println(" no ");
	}

    }
}


/*
Enter Number:
625
 yes


here the square of last digit are equal to the original number

*/