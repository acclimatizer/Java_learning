package a09_constructors_and_variables;


class Student2{
    String classroom;

    Student2(String grade,String section){
       classroom = grade+section;
    }
    void display2(){
        System.out.println(classroom);
    }

    public static void main(String[] args) {
        Student2 stu2 = new Student2("8","2");
        stu2.display2();

        Student2 stu3 = new Student2("9","1");
        stu3.display2();

        Student2 stu4 = new Student2("10","3");
        stu4.display2();


    }
}