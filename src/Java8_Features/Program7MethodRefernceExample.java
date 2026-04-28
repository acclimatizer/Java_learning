package Java8_Features;// Title: Method Reference Example

class MethodReferenceExample {

    public static void printMsg() {
        System.out.println("Hello from Method Reference");
    }

    public static void main(String[] args) {

        Runnable r = MethodReferenceExample::printMsg;
        r.run();
    }
}