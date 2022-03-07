import java.util.*;
class arrlist
{
	public static void main(String []args)
	{
		/*ArrayList<String> slist = new ArrayList<>();
		System.out.println(slist.size());
		
		slist.add("Alisson");
		slist.add("Van Dijk");
		slist.add("Matip");
		slist.add("Alexander-arnold");
		slist.add("Robertson");
		slist.add(2, "Luis Diaz");
		
		System.out.println(slist.size());
		System.out.println(slist.isEmpty());
		
		
		for(int i=0;i<slist.size();i++)
			System.out.println(slist.get(i));
		
		/*for (String s: slist)
			System.out.println(s);
		
		ListIterator<String> itr = slist.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		System.out.println(slist.contains("Van Dijk")); // case-sensitive.
		
	    //System.out.println(slist.remove("Luis Diaz"));
		System.out.println(slist.remove(3)+" is Removed");
		for (String s:slist)
			System.out.println(s);*/
		
		
		ArrayList<Employee> slist = new ArrayList<>();
		System.out.println(slist.size());
		
		slist.add(new Employee(101, "Ajay", 20000, "IBM"));
		slist.add(new Employee(102, "Tarun", 25000, "IBM"));
		slist.add(new Employee(103, "Rohit", 30000, "IBM"));
		
		for(Employee e : slist)
			System.out.println(e);
	}
	
}