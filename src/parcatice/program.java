package parcatice;

public class program 
{
	 public static void main(String[]args)
	 {
		       String s1=" ab abc cb";
		        String arr[]=  s1.split("") ;
		        for(int i=arr.length-1;i>=0;i--)
		        {
		        	  String orgst=  arr[i];
		        	   String rev="";
		        	for(int j=orgst.length()-1;j>=0;j--)
		        	{
		        		  rev =  rev  + orgst.charAt(j);
		        	}
		        	System.out.print(rev);
		        }
	 }

}
