public class CategoryEnum {
    public static void main(String[] args) {

        //Chosen Category to Output
        Category chosenCategory = Category.KID;

        //Cases to Output
        switch (chosenCategory) {
            case MEN:
                System.out.println("Price: " + Category.MEN.getPrice());
                break;
            case WOMEN:
                System.out.println("Price: " + Category.WOMEN.getPrice());
                break;
            case KID:
                System.out.println("Price: " + Category.KID.getPrice());
                break;
            case GRANDMA:
                System.out.println("Price: " + Category.GRANDMA.getPrice());
                break;
            case GRANPA:
                System.out.println("Price: " + Category.GRANPA.getPrice());
                break;
            default:
                System.out.println("Invalid Category");
        }
    }

    //Table of Values for Each Category / Fixed Prices
    public enum Category {
        MEN(13.57),
        WOMEN(20.45),
        KID(45.6),
        GRANDMA(56.67),
        GRANPA(3.56);

        private final double price;

        Category(double price) {
            this.price = price;
        }

        //Returns the price of the Chosen Category
        public double getPrice() {
            return price;
        }
    }
}