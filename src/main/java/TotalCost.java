public class TotalCost {
    public static void main(String[] args) {
        int laptopPrice = 85000;
        int mousePrice = 2500;
        double totalPrice = laptopPrice + mousePrice;
        double discount = 0.15 * totalPrice;
        double finalPrice = totalPrice - discount;
        System.out.println("Total cost after 15% discount: " + finalPrice);
    }
}
