public class EmployeeUC1
{
	public static void main(String alex[])
	{
		// Constants Initialization
		int Full_Time = 1;
		// Computation
		double EmpCheck = Math.floor(Math.random() * 10) % 2;
		if(EmpCheck == Full_Time)
		{
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
	}
}

