
package Lab07.Question3;
public class StudentMarkReportTest {
     public static void main (String[] args){
         String[] marks = {"78", "82", "absent", "90"};
         StudentMarkReport report = new StudentMarkReport(marks);
         
        try{
            int get_mark1 = report.getMarkAt(6);
            System.out.println("Mark: " + get_mark1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Selected mark position does not exist.");
        }
        finally{
            System.out.println("Array access checking completed.");
        }
        System.out.println();
        try{
            int get_mark2 = report.getMarkAt(2);
            System.out.println("Mark: " + get_mark2);
        }
        catch (NumberFormatException e){
            System.out.println("Error: Selected mark is not a valid number.");
        }
        finally{
            System.out.println("Number conversion checking completed.");
        }
        System.out.println("Report checking completed");
     }
}
//Excepetion occurs because index no 6 does not in the given string array
//Excepetion occurs because "absent" is not a integer number it is a string text