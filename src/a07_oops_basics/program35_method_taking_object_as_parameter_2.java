package a07_oops_basics;

class StudentMarks{
    int mathMarks = 98;
    int physicsMarks = 99;
    int chemistryMarks = 92;
    int biologyMarks = 95;
}
class ObjectAsParameter2{

    void objAsPar(StudentMarks stu){
        int totalMarks = stu.mathMarks+ stu.physicsMarks+ stu.chemistryMarks+ stu.biologyMarks;
        int average = totalMarks/4;
        System.out.println("Total Marks = "+totalMarks);
        System.out.println("Average Marks = "+average);
    }

    public static void main(String[] args) {
        StudentMarks st = new StudentMarks();
        ObjectAsParameter2 obj = new ObjectAsParameter2();
        obj.objAsPar(st);
    }

}