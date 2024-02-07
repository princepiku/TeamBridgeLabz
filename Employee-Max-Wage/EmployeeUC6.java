public class EmployeeUC6
{
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_Work_Day = 2;
	public static final int Max_Hrs_Month = 10;
	public static void main(String alex[])
	{
		// Variables Initialization
		int EmpHrs = 0;
		int TotalEmpHrs = 0;
		int TotalEmpWorkDay = 0;
		// Computation
		while(TotalEmpHrs <= Max_Hrs_Month && TotalEmpWorkDay < Num_Work_Day)
		{

			TotalEmpWorkDay++;
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
			TotalEmpHrs = TotalEmpHrs + EmpHrs;
			System.out.println("Day# : "+TotalEmpWorkDay+" Employee Hours : "+EmpHrs);
		}
		int TotalEmpWage = TotalEmpHrs * Emp_Rate_Per_Hour;
		System.out.println("Total Employee Wage : "+TotalEmpWage);
	}
	
}

