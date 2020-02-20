package bhavithaepamstnd;
public class constructioncost 
{
	void print_cost(double area,double cost_per_squarefeet)
	{
		double construction_cost=0;
		if(cost_per_squarefeet==1200)
		{
			construction_cost=1200*area;
		}
		else if(cost_per_squarefeet==1500)
		{
			construction_cost=1500*area;
		}
		else if(cost_per_squarefeet==1800)
		{
			construction_cost=1800*area;
		}
		else if(cost_per_squarefeet==2500)
		{
			construction_cost=2500*area;
		}
		System.out.println("The construction cost for given standards is:"+construction_cost);
		
	}
	
}
