import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Cashier {
	static Register registers[];
	static int RegisterCount=0;
	static final float registerCapacity = 1;
	static final float trainingRegisterCapacity = 0.5F;
	
	public static void main(String[] args) {
		List<Customer> customers = readfile(args[0]);
		int currentCustomer = 0;
		//Scanner s = new Scanner(System.in);
		Collections.sort(customers);
		registers = new Register[RegisterCount];
		for(int i=0;i<RegisterCount;i++)
			registers[i] = new Register();
		int t = 1;

		boolean completed=false;
		while(true)
		{
			boolean completeprocess = true;
			boolean temp;
			//Execute process n-1 registers
			for(int i=0;i<RegisterCount-1;i++)
			{
				
				temp = registers[i].process(registerCapacity);					
				completeprocess = completeprocess && temp;
			}
			//Execute process for nth training register
			temp = registers[RegisterCount-1].process(trainingRegisterCapacity);
			completeprocess = completeprocess && temp;
			while(true) {
			if((!completed) && t==customers.get(currentCustomer).arrivalTime)
			{
				addCustomer(customers.get(currentCustomer));
				currentCustomer++;
				if(currentCustomer==(customers.size()))// Check if all customers added.
				{
					completed = true;
					break;
				}

			}
			else
				break;
			}
			
			if(completeprocess && completed)//If all customers processed, print time and exit.
			{
				System.out.println("Finished at: t="+t+" minutes");
				break;
			}			
			t++;
			
		}
	}

	private static void addCustomer(Customer cus) {
		// TODO Auto-generated method stub
		int minimum = 100000;
		int index = -1;
		if(cus.type==1)
		{
			for(int i = 0;i<registers.length;i++)
			{
				if(registers[i].numberOfCustomers<minimum)
				{
					minimum = registers[i].numberOfCustomers;
					index = i;
				}
			}
			
		}
		else
		{
			for(int i = 0;i<registers.length;i++)
			{
				if(registers[i].lastCustomerItemCount<minimum)
				{
					minimum = registers[i].lastCustomerItemCount;
					index = i;
				}
			}
		}
		cus.position = registers[index].customers.size();
		registers[index].customers.add(cus);
		registers[index].numberOfCustomers++;
		registers[index].lastCustomerItemCount = (Math.round(cus.items));
		
	}
	
	/* Reads file and returns customer list */
	private static List readfile(String filename) {

		BufferedReader br = null;
		String line = "";
		List<Customer> customerlist = new ArrayList<Customer>();

	 int i=0;
		try {
	 
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			RegisterCount = Integer.parseInt(line);
			while ((line = br.readLine()) != null) {
				String temp[] = line.split("\\s+");
				Customer cus = new Customer();
				cus.arrivalTime =Integer.parseInt(temp[1]);
				cus.items=Float.parseFloat(temp[2]);
				if(temp[0].equals("A"))
					cus.type =1 ;
				else
					cus.type=2;
				customerlist.add(cus);
				i++;
					 
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
		return customerlist;	  	
}
}
