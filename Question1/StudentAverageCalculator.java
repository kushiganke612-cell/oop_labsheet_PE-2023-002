
package Lab07.Question1;
public class StudentAverageCalculator {
    private int totalMarks;
    private int numberofStudents;
    
    public StudentAverageCalculator(int Marks, int Number){
        this.totalMarks = Marks;
        this.numberofStudents = Number;
    }
    
    public int calculateAverage(){
        return totalMarks/numberofStudents;
    }
}
