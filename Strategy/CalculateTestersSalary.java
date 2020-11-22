public class CalculateTestersSalary implements CalculateSalary{

    private float salary;

    public CalculateTestersSalary(float salary){
        this.salary = salary;
    }

    public float calculate(){
        return this.salary *= 1.1;
    }
}