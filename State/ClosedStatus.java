public class ClosedStatus implements StateOrderStatus{
    public String ready( Order order ){
        order.setStatus(new CreatedStatus());

        return "Order returned status";
    }

    public String finish( Order order ){
        return "Order already finished!";
    }

    public String toString(){
        return "Closed";
    }
}