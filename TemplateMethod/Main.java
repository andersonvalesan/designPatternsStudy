public class Main{
    public static void main(String[] args){
        Order order1 = new Delivery();

        order1.doOrder();

        Order order2 = new Takeout();

        order2.doOrder();
    }
}