package leetcode.problems.easy;

public class PlusOneArray {

	public static void main(String[] args) {
		int[] arr = {8,9,9,9};
		int []  arr_res = plusOne(arr);
		for(int i=arr_res.length-1;i>=0;i--) {
			System.out.println(arr_res[i]);
		}
		
	}

	 public static int[] plusOne(int[] digits) {
	        if(digits[digits.length-1]==9){
	           
	            int carry = 1;
	            for(int i=digits.length-1;i>=0;i--){
	                if(digits[i]+carry==10){
	                	digits[i] = 0;
	                    carry = 1;
	                }  else{
	                	digits[i] = digits[i]+carry;
	                    carry = 0;
	                }              
	            }
			if (carry > 0) {
            	 int[] digits_new = new int[digits.length+1];
            	 for(int i=0;i<digits.length;i++) {
            		 digits_new[i+1] =digits[i];
            	 }
                 digits_new[0]=carry;
                 return digits_new;
             }
	        return digits;
	        }else{
	            digits[digits.length-1] = digits[digits.length-1]+1;
	        return digits;
	        }
	    }

}
