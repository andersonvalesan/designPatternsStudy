public class CreatedStatus implements StateOrderStatus{
    public String ready( Order order ){
        return "Already in this status";
    }

    public String finish( Order order ){
        order.setStatus(new ClosedStatus());

        return "Ok, order finished!";
    }

    public String toString(){
        return "Created";
    }
}