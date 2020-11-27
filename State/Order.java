public class Order{
    StateOrderStatus orderStatus;

    public Order(){
        orderStatus = new CreatedStatus();
    }

    public void setStatus(StateOrderStatus orderStatus){
        this.orderStatus = orderStatus;
    }

    public String ready( Order order ){
        return this.orderStatus.ready( order );
    }

    public String finish( Order order ){
        return this.orderStatus.finish( order );
    }

    public StateOrderStatus getStatus(){
        return this.orderStatus;
    }
}