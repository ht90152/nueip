public class Main
{
	public static void main(String[] args) {
		String str = "人易科技:上 機 測 驗 - 演算法";
		str = change(str);
		System.out.println(str);
		
		str = trim(str);
		System.out.println(str);
		
		str = sub(str, '：', '-');
		System.out.println(str);
		
	}
	
	public static String change(String str){
	    return str.replace(":", "：");
	}
	
	public static String trim(String str){
	    String strNew = "";
	    int pre = 0;
	    for (int i = 0; i < str.length(); ) {
	       // System.out.println(i+" "+str.charAt(i));
            int codepoint = str.codePointAt(i);
            
            if(str.charAt(i) == ' '){
                if (Character.UnicodeScript.of(pre) == Character.UnicodeScript.HAN &&
                Character.UnicodeScript.of(str.codePointAt(i+Character.charCount(codepoint))) == Character.UnicodeScript.HAN) {
                    // System.out.println("HAN");
                } else{
                    strNew += str.charAt(i);
                }
            } else{
                strNew += str.charAt(i);
            }
            
            pre = codepoint;
            i += Character.charCount(codepoint);
        }
        return strNew;
	}
	
	public static String sub(String str, char c1, char c2){
	    int i1 = str.indexOf(c1)+1;
	    int i2 = str.indexOf(c2);
	   // System.out.println(i1+" "+i2);
	    return str.substring(i1, i2);
	}
}
