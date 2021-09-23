public class Main
{
	public static void main(String[] args) {
		int[] a = {77,5,5,22,13,55,97,4,796,1,0,9};
		int[] b = {0,1,2,3,4,5,6,7,8,9};
		int[] c = intersection(a, b);
		print(c);
		
		c = difference(a, b);
		print(c);
		
		c = union(a, b);
		print(c);
		
	}
	
	public static int[] intersection(int[] a, int[] b){
	    String str = "";
	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < b.length; j++) {
	            if(a[i] == b[j]) {
	                boolean no = true;
        	        for(String s:str.split(",")){
        	            if(s.equals(a[i]+"")){
        	                no = false;
        	                break;
        	            }
        	        }
        	        if(no) str += a[i]+",";
	            }
	        }
	    }
	    
	    return arr_s2i(str.split(","));
	}
	public static int[] difference(int[] a, int[] b){
	    String str = "";
	    if(a.length > b.length){
	        for (int i = 0; i < a.length; i++) {
	            boolean no = true;
	            for (int j = 0; j < b.length; j++) {
	                if(a[i] == b[j]) {
	                    no = false;
	                    break;
	                }
	            }
	            if (no) str += a[i]+",";
	        }
	    }
	    
	    return arr_s2i(str.split(","));
	}
	public static int[] union(int[] a, int[] b){
	   // System.out.println(arr.length);
	    String str = "";
	    for (int i = 0; i < a.length; i++) {
	       // System.out.println(a[i]);
	        boolean no = true;
	        for(String s:str.split(",")){
	            if(s.equals(a[i]+"")){
	                no = false;
	                break;
	            }
	        }
	        if(no) str += a[i]+",";
	    }
	    for (int i = 0; i < b.length; i++) {
	        boolean no = true;
	        for(String s:str.split(",")){
	            if(s.equals(b[i]+"")){
	                no = false;
	                break;
	            }
	        }
	        if(no) str += b[i]+",";
	    }
	    
	    System.out.println(str);
	    return arr_s2i(str.split(","));
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
