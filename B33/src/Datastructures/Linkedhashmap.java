package Datastructures;

public class Linkedhashmap {
 

	public static void main(String[] args) {
		//ordered, unsorted map
		Linkedhashmap<String, Integer> lhmap = new Linkedhashmap<String, Integer>();
		lhmap.put("Nitin", 56000);
		lhmap.put("Pankaj", 76000);
		lhmap.put("Dhruv", 88200);
		lhmap.put("Ankit", 45000);
		lhmap.put("Shashwat", 76000);
		System.out.println(lhmap);
		lhmap.put("Shashwat", 80000);
		System.out.println(lhmap);
lhmap.put("Manoj",null);
		System.out.println(lhmap);
		lhmap.put(null,null);
		System.out.println(lhmap);
		
	}

}