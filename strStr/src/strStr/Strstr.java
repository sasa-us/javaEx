package strStr;
//For a given source string and a target string, 
//you should output the first index(from 0) of target string in source string.
//If target does not exist in source, just return -1.

public class Strstr {

	public static int strStr(String source, String target) {
		if(source == null || target == null) {
            return -1;
        }
        for(int i=0;i< (source.length() - target.length()); i++) {
            int k = i;
            boolean isSame = true;
        		for(int j=0; j<target.length(); j++, k++) {
                if(source.charAt(k) != target.charAt(j)) {
                  isSame = false;  
                	  return -1;
                }
        		}//end for j
            
        		if(isSame == true)
        		{
        			return i;
            }
        }//end for i
        
		return -1;
	}
	
	public static void main(String[] args) {
		String source = "targtarget";
		String target = "target";
		int result = strStr(source, target);
		System.out.println("result is" + result);
	}
}
