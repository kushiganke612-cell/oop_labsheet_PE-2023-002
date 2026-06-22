
package Lab07.Question2;
public class ProductBillTest {
    public static void main (String[] args){
        ProductBill bill = new ProductBill("1500.00", "two");
        try{
            double receipt = bill.calculateTotal();
            System.out.println("Calculate product bill: " + receipt);
        }
        catch (NumberFormatException e){
            System.out.println("Error: Price and quantity must be valid numbers.");
        }
        finally{
            System.out.println("Product bill calculation completed.");
        }
        System.out.println("Program continues..");
    }
}
//Exception occurs because "two" cannot be converted into a valid number