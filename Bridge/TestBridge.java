public class TestBridge{
    public static void main(String args[]){
        Customer customer = new Customer();

        Card card1 = new Debit();
        
        Card card2 = new Credit();

        customer.setCard(card1);

        if(customer.getCardType() == "debit"){
            System.out.println(true);
        }
        
        customer.setCard(card2);

        if(customer.getCardType() == "credit"){
            System.out.println(true);
        }
    }
} 