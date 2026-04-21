package a09_constructors_and_variables;

class StudentDetails{
    int rollNo = 123;
    static int code = 456;

    public static void main(String[] args) {
        StudentDetails stu = new StudentDetails();
        System.out.println(stu.rollNo);
        System.out.println(StudentDetails.code);
    }
}