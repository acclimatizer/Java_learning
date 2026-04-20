package a07_oops_basics;

class AdditionOf2Numbers {
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        AdditionOf2Numbers Addition = new AdditionOf2Numbers();
        Addition.add();

    }
}