
import java.util.*;

public class Register {

	int numberOfCustomers = 0;
	int lastCustomerItemCount = 0;
	List<Customer> customers = new ArrayList<Customer>();
	boolean process(float workPerMinute)
	{
		if(customers.size()==0)
			return true;//Register is empty.
		
		else
		{
			if(customers.get(0).items==workPerMinute)
			{
				//currentCustomer++;
				customers.remove(0);
				numberOfCustomers--;
				if(numberOfCustomers==0)
				{
					lastCustomerItemCount =0;
					return true;
				}
			}
			else
			{
				customers.get(0).items = customers.get(0).items - workPerMinute;
			}
		}
		return false;
	}	

}