package particePage;

public class String12 {
public static void main(java.lang.String[] args)
{
	    String str= "today is sunday";
	      String arr[]= str.split(" ");
	      for(int i=0;i<=arr.length-1;i++)
	      {
	    	  String orgstring =  arr[i];
	    	    String rev="";
	    	  for(int j=orgstring.length()-1;j>=0;j--)
	    	  {
	    		     rev=rev+orgstring.charAt(j);
	    	  }
	    	  System.out.print(rev+" ");
	      }
	       
	    

	}

}
