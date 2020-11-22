public class ShowSalary{

    private static float defaultSalary = 5000;

    private static CalculateSalary calculateProgrammersSalary;
    private static CalculateSalary calculateTestersSalary;

    public static void main(String[] args) {
        calculateProgrammersSalary = new CalculateProgrammersSalary(defaultSalary);

		System.out.println("Programmers Salary: " + calculateProgrammersSalary.calculate());

        calculateTestersSalary = new CalculateTestersSalary(defaultSalary);        

		System.out.println("Testers Salary: " + calculateTestersSalary.calculate());
	}
}