
public class Customer implements Comparable<Customer>{
	Integer arrivalTime;
	int position;
	Float items;
	Integer type;	
	public int compareTo(Customer o) {
		int compare = arrivalTime.compareTo(o.arrivalTime);
		if(compare !=0)
			return compare;
		else
		{
			compare = items.compareTo(o.items);
			if(compare !=0)
				return compare;
			else
				return type.compareTo(o.type);
		}

    }
}
