public class Main
{
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(calc(arr));
		
		Object obj = to2arr(arr);
		
	}
	
	public static int calc(int[] arr){
	   // System.out.println(arr.length);
	    int ans = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if(arr[i]%2 == 1) ans += arr[i];
	        else ans -= arr[i];
	    }
	    return ans;
	}
	
	public static Object to2arr(int[] arr){
	    String s1 = "";
	    String s2 = "";
	    for (int i = 0; i < arr.length; i++) {
	        if(arr[i]%2 == 1) s1 += arr[i]+",";
	        else s2 += arr[i]+",";
	    }
	    
	    int[] odd = arr_s2i(s1.split(","));
	    int[] even = arr_s2i(s2.split(","));
	    print(odd);
	    print(even);
	    return new Object[]{odd, even};
	}
	
	public static int[] arr_s2i(String[] string){
	    int[] arr = new int[string.length];
	    for (int i = 0; i < string.length; i++)
        {
            // System.out.println(string[i]);
            arr[i] = Integer.parseInt(string[i]);
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
