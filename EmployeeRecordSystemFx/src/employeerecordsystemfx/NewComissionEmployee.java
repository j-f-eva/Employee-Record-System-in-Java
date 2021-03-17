package employeerecordsystemfx;

public class NewComissionEmployee extends EmployeeRecordSystem {
	double commission ,sale;

	public NewComissionEmployee(String name, String id, String designation, double commission, double sale) {
		super(name, id, designation);
		this.commission = commission;
		this.sale = sale;
	}

    
	double getSalary(double _sale)
	{
		return commission * _sale ;
	}
	@Override
	void increaseSalary(double amt)
	{
		try{
                    
			commission += amt;
		
                }
                catch(Exception e){
           System.out.println(e);
       }
	}
	@Override
	double getSalary()
	{
		return commission * sale;
	}
	
	@Override
        String display(){
        String s="Name--"+getName()+" | Registration--"+getId()+" | Designation--"+getDesignation()+" | Salary--"+this.getSalary();
        return s;
    }
	
}
