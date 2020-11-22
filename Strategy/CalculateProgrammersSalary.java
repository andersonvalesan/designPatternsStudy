public class CalculateProgrammersSalary implements CalculateSalary{

    private float salary;

    public CalculateProgrammersSalary(float salary){
        this.salary = salary;
    }

    public float calculate(){
        return this.salary *= 1.3;
    }
}