public class TestState{
    public static void main(String[] args){
        Order order = new Order();

        if(order.ready( order ) == "Already in this status"){
            System.out.println(true);
        }

        System.out.println(order.getStatus());

        if(order.finish( order ) == "Ok, order finished!"){
            System.out.println(true);
        }

        System.out.println(order.getStatus());
        
        if(order.finish( order ) == "Order already finished!"){
            System.out.println(true);
        }
        
        System.out.println(order.getStatus());
    }
} 