package a07_oops_basics;

class StudentDetails{
    String name = "Ravi";
    int rollNo = 9876;
    double height = 180;
}
class ObjectAsParameter{

    void objAsPar(StudentDetails stu){
        System.out.println(stu.rollNo);
        System.out.println(stu.name);
        System.out.println(stu.height);
    }

    public static void main(String[] args) {
        StudentDetails st = new StudentDetails();
        ObjectAsParameter obj = new ObjectAsParameter();
        obj.objAsPar(st);
    }

}