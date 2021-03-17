
package employeerecordsystemfx;


abstract class EmployeeRecordSystem {
   
private String name,id,designation;
	public EmployeeRecordSystem(String name, String id, String designation) 
	{
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		
	}
	abstract double getSalary() ;

	abstract void increaseSalary(double amt);
	
	
		String getId()
		{
			return id;
		}
			
	abstract String display();
        
				//getter-setter method..

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public void setId(String id) {
		this.id = id;
	}
	public void getId(String id) {
		this.id = id;
	}
}
