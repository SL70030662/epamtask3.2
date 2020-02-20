package bhavithaepamstnd;
import java.util.*;
public class mainclass {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double area=sc.nextDouble();
		double cost_per_squarefeet=sc.nextDouble();	
		constructioncost c=new constructioncost();
		c.print_cost(area,cost_per_squarefeet);
		
	}

	

}
