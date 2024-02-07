public class EmployeeUC5
{
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_Work_Day = 2;
	public static void main(String alex[])
	{
		// Variables Initialization
		int day;
		int EmpHrs = 0;
		int EmpWage = 0;
		int TotalEmpWage = 0;
		// Computation
		for(day = 0; day < Num_Work_Day; day++)
		{
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
			TotalEmpWage = TotalEmpWage + EmpWage;
			System.out.println("Employee Wage : "+EmpWage);
		}
		System.out.println("Total Employee Wage : "+TotalEmpWage);
	}
	
}

