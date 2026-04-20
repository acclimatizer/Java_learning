package a09_constructors;

class Student{
    int rollNo;
    Student(){
        rollNo = 321;
    }
    void display(){
        System.out.println(rollNo);
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.display();
    }
}