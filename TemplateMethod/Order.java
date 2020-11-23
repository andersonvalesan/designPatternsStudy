abstract class Order{
    public final void doOrder(){
        System.out.println(doCheckout());
        System.out.println(doPayment());
        System.out.println(doDeliver());    
    }

    abstract String doCheckout();

    abstract String doPayment();

    abstract String doDeliver();
}