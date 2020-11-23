public class FactoryMethod{
    public Soda createSoda(String type) {
        if (type == "coke") {
            return new Coke();
        } else if( type == "fanta" ) {
            return new Fanta();
        }

        return new SodaNull();
    }
}