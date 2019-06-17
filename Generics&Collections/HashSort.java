
import java.util.*;


public class HashSort {


	public static HashMap<String, Integer> sortHash(HashMap<String, Integer> hm)
	{

		List<Map.Entry<String, Integer>> list= new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >()
		{
		  public int compare(Map.Entry<String, Integer>o1, Map.Entry<String, Integer>o2)
		  {
			  return (o1.getValue()).compareTo(o2.getValue());
		  }
		});
		Collections.reverse(list);
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
		for (Map.Entry<String, Integer> aa : list) { 
		   temp.put(aa.getKey(), aa.getValue()); 
		        } 
		return temp; 
	}
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		HashMap<String, Integer> hmap= new HashMap<>();
		System.out.println("Enter the number of strings :");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		//int n= Integer.parseInt(s.nextLine());
		System.out.println("enter the strings: ");
		for(int i=0;i<n;i++)
		{
			String str= s.next();
			int count= hmap.getOrDefault(str, 0);
			hmap.put(str, count+1);	
		}
		
		
		HashMap<String, Integer> map= sortHash(hmap);
		for(Map.Entry<String,Integer> entry: map.entrySet())
		{
			list.add((String)entry.getKey());
		
		}
		
		for(String str: list)
			System.out.println(str);
	}

}
