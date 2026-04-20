package a09_constructors;


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

    }
}