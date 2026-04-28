package Java8_Features;// Title: Default Method Example

interface Demo {
    default void show() {
        System.out.println("Default Method");
    }
}
class DefaultMethodExample implements Demo {
    public static void main(String[] args) {

        DefaultMethodExample obj = new DefaultMethodExample();
        obj.show();
    }
}