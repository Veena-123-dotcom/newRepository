package parcatice;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
public class Collection
{
	public static void main(String[]rags) {
	 Vector al= new Vector();
                   al.add("priyanka");
                   al.add("qa enginneer");
                   al.add("priyanka");
                   al.add('A');
                   al.add('B');
                   al.add(101);
                   al.add(102);
                   al.add(null);
                   al.add(null);
                   System.out.println(al.size());
                   System.out.println(al.get(2));
                   System.out.println(al.contains(null));
                   System.out.println(al.isEmpty());
                   for(int i=0;i<=al.size()-1;i++)
                   {
                	  System.out.println(al.get(i));
                   }
                   al.add(1,null);
                   System.out.println(al);
                    al.remove(4);
                    System.out.println(al);
                    al.set(4,"RAHUL");
                      for(Object ob:al)
                      {
                    	  System.out.println(ob);
                      }
                      System.out.println("print the data");
                        Iterator it=al.iterator();
                           while(it.hasNext())
                           {
                        	   System.out.println(it.next());
                           }
                           System.out.println("iterator is elements");
                        ListIterator itr=al.listIterator();
                         while(itr.hasNext())
                         {
                        	 System.out.println(itr.next());
                         }
                         System.out.println("list iterator is elements");
                           Enumeration enu=al.elements();
                             while(enu.hasMoreElements())
                             {
                            	System.out.println(enu.nextElement());
                             }
                             al.clear();
                             System.out.println(al.size());
    }
}
