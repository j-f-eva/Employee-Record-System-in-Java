package employeerecordsystemfx;

public class NewHourlyEmployee extends EmployeeRecordSystem{
	double hourlyRate,hourWorked;

	public NewHourlyEmployee(String name, String id, String designation, double hourlyRate, double hourWorked) {
		super(name, id, designation);
		this.hourlyRate = hourlyRate;
		this.hourWorked = hourWorked;
	}

    

	double getSalary(int hWorked)
	{
		 return hWorked * hourlyRate ;
		 
	}
	
	@Override
	void increaseSalary(double amt) {
            try{
		
			hourlyRate += amt;
		}
		
                catch(Exception e){
           System.out.println(e);
       }
	}
	@Override
	double getSalary()
	{
		return hourWorked * hourlyRate ;
	}
        @Override
        String display()
	{
                
		String s="Name--"+getName()+" | Registration--"+getId()+" | Designation--"+getDesignation()+" | Salary--"+this.getSalary();
		return s;
	}
}
