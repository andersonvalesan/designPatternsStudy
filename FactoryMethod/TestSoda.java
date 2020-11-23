public class TestSoda{
    public static void main(String args[]){
        FactoryMethod factoryMethod = new FactoryMethod();

        Soda soda1 = factoryMethod.createSoda("coke");

        System.out.println(soda1.getType() == "coke");

        Soda soda2 = factoryMethod.createSoda("fanta");

        System.out.println(soda2.getType() == "fanta");

        Soda sodaNull = factoryMethod.createSoda("");

        System.out.println(sodaNull.getType() == null);
    }
}