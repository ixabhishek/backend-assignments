 class Student {
    private int id;
    private String name;
    private int marks;

    
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public boolean isPassed() {
        return marks >= 40;
    }
    
}
public class Main{
    public static void main(String[] args) {
        Student student = new Student(1, "Alice", 85);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Marks: " + student.getMarks());
        System.out.println("pass" + (student.isPassed() ? "Yes" : "No"));
    }   
}

