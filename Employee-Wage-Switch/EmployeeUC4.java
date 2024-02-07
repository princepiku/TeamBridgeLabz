public class EmployeeUC4
{
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static void main(String alex[])
	{
		// Variables Initialization
		int EmpHrs = 0;
		int EmpWage = 0;
		// Computation
		int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch(EmpCheck)
		{
			case Part_Time:
				EmpHrs = 4;
				break;
			case Full_Time:
				EmpHrs = 8;
				break;
			default:
				EmpHrs = 0;
		}
		EmpWage = EmpHrs * Emp_Rate_Per_Hour;
		System.out.println("Employee Wage : "+EmpWage);
	}

}

