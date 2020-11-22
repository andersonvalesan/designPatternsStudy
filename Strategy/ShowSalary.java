public class ShowSalary{

    private static final float DEFAULT_SALARY = 5000;

    private static CalculateSalary calculateSalary;
    private static Roles role;

    public static void main(String[] args) {
        role = Roles.programmer;
        Person employee = new Person(role);

        switch(employee.getRole()){
            case programmer:
                calculateSalary = new CalculateProgrammersSalary( DEFAULT_SALARY );
            break;

            case tester:            
                calculateSalary = new CalculateTestersSalary( DEFAULT_SALARY );
            break;
        }
            
		System.out.println("Employee's "+ employee.getRole() +" Salary: " + calculateSalary.calculate());
	}
}