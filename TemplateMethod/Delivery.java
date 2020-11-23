public class Delivery extends Order{
    public String doCheckout(){
        return "Create Cart and go to Checkout";
    }

    public String doPayment(){
        return "Pay with credit card";
    }

    public String doDeliver(){
        return "Take the groceries to the client";
    }
}