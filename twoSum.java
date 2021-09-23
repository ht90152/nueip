import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   // [2,7,11,15]
	   // 9
	   // [3,2,4]
	   // 6
	   // [3,3]
	   // 6
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		string = string.split("\\[")[1].split("\\]")[0];
		System.out.println(string);
		int[] nums = arr_s2i(string.split(","));
//		print(nums);

		scanner = new Scanner(System.in);
		int target = Integer.parseInt(scanner.next());
		System.out.println(target);
		
		if(limit(nums, target)){
		    int[] ans = twoSum(nums, target);
		    print(ans);
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target){
	    boolean stop = false;
	    String str = "";
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i+1; j < nums.length; j++) {
	            if(nums[i]+nums[j] == target) {
	                str += i+",";
	                str += j+",";
	                stop = true;
	                break;
	            }
	        }
	        if(stop) break;
	    }
	    
	    return arr_s2i(str.split(","));
	}
	
	public static boolean limit(int[] nums, int target){
	    boolean ok = true;
	    if(!(nums.length >= 2 && nums.length <= 103)) ok = false;
	    for (int i = 0; i < nums.length; i++) {
	        if(!(nums[i] >= -109 && nums[i] <= 109)){
	            ok = false;
	            break;
	        }
	    }
	    if(!(target >= -109 && target <= 109)) ok = false;
	    
	    return ok;
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
