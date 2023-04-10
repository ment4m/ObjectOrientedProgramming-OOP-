package ment.introduction;

public class OOP1 {
    public static void main(String[] args) {
        //store 5 roll nus
        int[] numbers = new int[5];

        //data used to store the name of Student
        String[] name = new String[5];

        //data of 5 students: which contains { roll no, name , marks}
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student student1 = new Student();
        System.out.println(student1.rno);

        Student student2 = new Student(15, "Brook", 79.0f);

        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        student1.rno = 20;
        student1.name = "Abriham";

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student student3 = new Student(student1);
        System.out.println(student3.rno);
        System.out.println(student3.name);
        System.out.println(student3.marks);

        final Student student4 = new Student(20,"Aman", 100.0f);
        student4.name = "Emmanuel";
        // when a non primitive is final you cannot reassign it but,
        // you can change the value
        // student4 = new Studnet(15, "Amanuel", 78.0f)
    }

}
// create a class which hold the roll no, name, marks for every student
class Student {
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 13;
        this.name = "Kunal";
        this.marks = 88.5f;
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}
