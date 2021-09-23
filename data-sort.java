public class Main
{
	public static void main(String[] args) {
		int[] arr = {77,5,5,22,13,55,97,4,796,1,0,9};
		print(sort(arr));
		
	}
	
	public static int[] sort(int[] arr){
	   // System.out.println(arr.length);
	    int tmp;
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i+1; j < arr.length; j++) {
	            if(arr[i] > arr[j]){
	                tmp = arr[j];
	                arr[j] = arr[i];
	                arr[i] = tmp;
	            }
	        }
	    }
	    return arr;
	}
	
	public static void print(int[] arr){
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	}
	
}
