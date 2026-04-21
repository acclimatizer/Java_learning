package a09_constructors_and_variables;


class InstanceLocalExample{
    int a = 333;
    int b = 222;

    void localVarMethod(){
        int a = 1;
        int b = 7;

        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        InstanceLocalExample obj = new InstanceLocalExample();
        obj.localVarMethod();
    }
}