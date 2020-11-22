public class Store{
    public static Cart createCart(Cart cart){

        if(cart == null){
            return new CartNull();
        }        
        
        return cart;
    }
}