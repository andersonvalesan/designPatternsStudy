public class Takeout extends Order{
    public String doCheckout(){
        return "Create Cart and go to Checkout";
    }

    public String doPayment(){
        return "Pay with POS";
    }

    public String doDeliver(){
        return "Get your groceries in the market";
    }
}