package EmpWageProblemday10;

public class SaveTotalWageForEachCompanyUc9 {
	String company;
	int empRatePerHour;
	int numberOfWorkingDays;
	int maxHoursPerMonth;
	int totalEmpWage;

	public SaveTotalWageForEachCompanyUc9(String company,int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour = empRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void calculatingEmpWage() {
		int empWorkingHour=0;
		int totalWorkingPerHour=0;
		int totalWorkingDay=0;
		//			int totalSalary=0;


		while(totalWorkingDay <= numberOfWorkingDays && totalWorkingPerHour < empRatePerHour) {
			totalWorkingDay++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			switch(empCheck) {
			case 1:
				empWorkingHour = 8;
				break;
			case 2 :
				empWorkingHour = 4;
				break;
			default : 
				empWorkingHour = 0;
				break;
			}

			totalWorkingPerHour+=empWorkingHour;
			System.out.println("Day :"+totalWorkingDay);
			System.out.println("Total Employee working hour  is  : " + empWorkingHour);

		}
		int totalEmployeewage = totalWorkingPerHour * empRatePerHour;
		System.out.println("Total Employee Wage is :"+totalEmployeewage);
		System.out.println("Total working hours are  : " + totalWorkingPerHour);
	}



	@Override
	public String toString() {
		return "Total Wage For Company: " + company + " is : " +   totalEmpWage ;

	}

	public static void main(String[] args) {
		SaveTotalWageForEachCompanyUc9 company1 = new SaveTotalWageForEachCompanyUc9("TCS",30,4,20);
		SaveTotalWageForEachCompanyUc9 company2 = new SaveTotalWageForEachCompanyUc9("Wipro",14,8,20);
		company1.calculatingEmpWage();
		System.out.println(company1);
		company2.calculatingEmpWage();
		System.out.println(company2);


	}

}



