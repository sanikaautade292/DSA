class BubbleSort {
	public static void main(String[] args) {
        	int arr[] = { 13, 45, 27, 57, 29, 7};
        	int n = arr.length;
	
		for(int i=0 ; i<n-1 ; i++){
			for(int j=0 ; j<n-i-1 ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array:");
       		for (int k = 0; k < n; k++) {
           	 	System.out.print(arr[k] + " ");
        	}

	}
}

/*

Output:

Sorted array:
7 13 27 29 45 57

*/