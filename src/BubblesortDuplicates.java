public class BubblesortDuplicates {

	static void bubbleSort(int arr[], int n)
    {
		int length = arr.length;
		
		//Bubble sort
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
	
	public static int removeDuplicates(int arr[], int n){  
		
		//New temporary array
        int[] temp = new int[n];
        
        //Removing duplicates
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        //Changing original array using temporary array
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static void main(String[] args) {
		// Given array
		int arr[] = {50, 11, 33, 21, 40, 50, 40, 40, 21}; 	 
		
		//Printing original array elements
		System.out.println("Original array:");
		System.out.print("[");
        for (int i=0; i<arr.length; i++) {
        	if (i != arr.length-1) {
        		System.out.print(arr[i]+", "); 	
        	}
        	else {
        		System.out.println(arr[i]+"]");
        	}
        }
  
		
		// Calling bubbleSort method
        bubbleSort(arr, arr.length);
      
        int length = arr.length;  
        
        //Using removeDuplicates method
        length = removeDuplicates(arr, length); 
        
        //printing new array elements
        System.out.println("Sorted and de-duplicated array:");
        System.out.print("[");
        for (int i=0; i<length; i++) {
        	if (i != length-1) {
        		System.out.print(arr[i]+", "); 	
        	}
        	else {
        		System.out.println(arr[i]+"]");
        	}
        }
         }
	}



