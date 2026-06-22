
package Lab07.Question1;
public class StudentAverageTest {
    public static void main (String[] args){
        StudentAverageCalculator calculate = new StudentAverageCalculator(1500,0);
        try{
            int average = calculate.calculateAverage();
            System.out.println("Average Marks: " + average);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Number of students cannot be zero!");
        }
        finally{
            System.out.println("Average calculation completed! ");
        }
        System.out.println("Program continues..");
    }
}
//Exception occurs because division by zero is not defined value it is infinite value.