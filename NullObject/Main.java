public class Main{
    public static void main(String[] args) {
        float price = 15;
        Cart cart = new Cart(price);

        Cart cart1 = Store.createCart(cart);

        System.out.println("Cart created with value: " + cart1.getValue());

        Cart cart2 = Store.createCart(null);

        System.out.println("Cart not created: " + cart2.getValue());
    }
}