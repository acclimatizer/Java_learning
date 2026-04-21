package a09_constructors_and_variables;

class StaticVarExample3 {
    int x;
    static int y;

    public static void main(String[] args) {
        StaticVarExample3 obj = new StaticVarExample3();
        obj.x++;
        obj.y++;
        StaticVarExample3 obj2 = new StaticVarExample3();
        obj2.x++;
        obj2.y++;
        StaticVarExample3 obj3 = new StaticVarExample3();
        int res = obj3.x++;
        obj3.y++;
        System.out.println(obj3.x);
        System.out.println(obj3.y);
    }
}