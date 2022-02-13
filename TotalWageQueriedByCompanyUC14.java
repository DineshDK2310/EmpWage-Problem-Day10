package EmpWageProblemday10;

public class TotalWageQueriedByCompanyUC14 {
	String company;
	int empWageHr;
	int noOfdays;
	int workingHrsPerMonth;
	int totalEmployeeWage;

	public void CompanyEmpWage(String company, int empWageHr, int noOfdays, int workingHrsPerMonth) {
		this.company = company;
		this.empWageHr = empWageHr;
		this.noOfdays = noOfdays;
		this.workingHrsPerMonth = workingHrsPerMonth;
	}

	public void setTotalEmpWage(int totalEmployeeWage) {
		this.totalEmployeeWage = totalEmployeeWage;
	}

	@Override
	public String toString() {
		return "Total Wage For Company: " + company + " is : " +   totalEmployeeWage ;

	}
}
