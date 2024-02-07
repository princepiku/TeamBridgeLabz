public class EmployeeUC3
{
	public static void main(String alex[])
	{
		// Constants Initialization
		int Part_Time = 1;
		int Full_Time = 2;
		int Emp_Rate_Per_Hour = 20;
		// Variables Initialization
		int EmpHrs = 0;
		int EmpWage = 0;
		// Computation 
		double EmpCheck =  Math.floor(Math.random() * 10) % 2;
		if(EmpCheck == Part_Time)
		{
			EmpHrs = 4;
		}
		else if(EmpCheck == Full_Time)
		{
			EmpHrs = 8;
		}
		else
			EmpHrs = 0;
		EmpWage = EmpHrs * Emp_Rate_Per_Hour;
		System.out.println("Employee Wage :"+EmpWage);
	}
}

