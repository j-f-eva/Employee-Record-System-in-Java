
package employeerecordsystemfx;

public class NewSalariedEmployee extends EmployeeRecordSystem{
    public double monthlySalary;
    public NewSalariedEmployee(String name,String id,String designation,double monthlySalary){
        super(name,id,designation);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void increaseSalary(double amt) {

       
        
        try{ 
        
            monthlySalary+=amt;
        
       }catch(Exception e){
           System.out.println(e);
       }
        
    }

    @Override
    double getSalary() {
        return monthlySalary;
    }

    
    @Override
    String display(){
       String s="Name--"+getName()+" | Registration--"+getId()+" | Designation--"+getDesignation()+" | Salary--"+this.getSalary();
        return s;
    }
}