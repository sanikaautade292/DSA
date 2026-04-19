class SelectionSort {
	public static void main(String[] args) {
        	int arr[] = { 13, 45, 27, 57, 29, 7};
        	int n = arr.length;

       
        	for (int i = 0; i < n - 1; i++) {
           		 int minIndex = i;
			 for (int j = i + 1; j < n; j++) {
                		if (arr[j] < arr[minIndex]) {
                   			 minIndex = j;
               			 }
           		 }

            		int temp = arr[i];
            		arr[i] = arr[minIndex];
           	        arr[minIndex] = temp;
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