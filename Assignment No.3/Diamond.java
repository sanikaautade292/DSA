class Diamond{
	public static void main(String [] args){
		int n = 4;
		int count = 1;
		for(int i=1 ; i<=n; i++){
			for(int k=1; k<=n; k++){
				System.out.print(count);
				count++;
			}
			for(int j=1; j<=n-i ; j++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
			
