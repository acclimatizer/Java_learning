package a13_typecasting;

class StudentType{

}

class EmployeeType extends StudentType{
    void msg(){
        System.out.println("hello friends");
    }
}
class TypeCastingEx{
    public static void main(String[] args) {
        StudentType s = new EmployeeType();
        EmployeeType e = (EmployeeType) s;
        e.msg();
    }
}