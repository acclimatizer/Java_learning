package a07_oops_basics;

class Student {

    int rollNo;
    double marks;
    String name;

    void display() {
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("Name:"+name);
    }

    public static void main(String[] args) {
        System.out.println("Student Information");
        Student st = new Student();
        st.display();
    }
}