
package Lab07.Question3;
public class StudentMarkReport {
    private String[] marks;
    
    public StudentMarkReport(String[] marks){
        this.marks = marks;
    }
    
    public int getMarkAt(int index){
        String text = marks[index];
        int text_mark = Integer.parseInt(text);
        return text_mark;
    }
}
