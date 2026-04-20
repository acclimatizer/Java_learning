package a07_oops_basics;

class CharDemo{
    void arrayChar(char[] temp){
        for(char x : temp) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        char[] temperature = {'a','b','c','d','e'};
        CharDemo arr = new CharDemo();
        arr.arrayChar(temperature);
    }
}