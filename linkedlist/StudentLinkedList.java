class Student {

    String name;
    int rollNo;
    double cgpa;

    Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
}


public class StudentLinkedList {

    private Student data;
    private StudentLinkedList next;

    StudentLinkedList(Student data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student("Ali", 101, 3.2);
        Student s2 = new Student("Ahmed", 102, 3.5);
        Student s3 = new Student("Sara", 103, 3.8);
        Student s4 = new Student("Hassan", 104, 3.1);

        // Creating linked list
        StudentLinkedList start = null;
        StudentLinkedList p = null;

        Student[] students = {s1, s2, s3, s4};

        // Adding Student objects into linked list
        for (int i = 0; i < students.length; i++) {

            StudentLinkedList newNode =
                    new StudentLinkedList(students[i]);

            if (start == null) {
                start = newNode;
                p = newNode;
            } 
            else {
                p.next = newNode;
                p = newNode;
            }
        }

        // Printing linked list
        for (StudentLinkedList i = start; i != null; i = i.next) {

            System.out.println("Name: " + i.data.name);
            System.out.println("Roll No: " + i.data.rollNo);
            System.out.println("CGPA: " + i.data.cgpa);
            System.out.println();
        }
    }
}