import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
	 Map<Character, Integer> m=new HashMap<>();
	 String s;
	 Scanner sc= new Scanner(System.in);
	 s=sc.nextLine();
	 for(int i=0;i<s.length();i++) {
		 if(Character.isAlphabetic(s.charAt(i))) {
			 char a= Character.toUpperCase(s.charAt(i));
			 if(m.containsKey(a))
				 m.put(a, m.get(a) + 1); 
				 
			 else
				 m.put(a,1); 
		 }
			 
	 }
	
	 
	 for (Map.Entry entry : m.entrySet()) { 
      
        	System.out.print( (char)entry.getKey()+" " );
        	int a=(int) entry.getValue();
        	while(a!=0)
        		{System.out.print('#');
        		 a--;
        		}
        	System.out.println('\n');
        	     } 
	 

	}

}
