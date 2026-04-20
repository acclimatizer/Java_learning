package a07_oops_basics;


class ArrayReturnDemo3 {
    String[] arrRetDem3(String[] a) {
        return a;
    }

    public static void main(String[] args) {
        String[] b = {"aaa","bbb","ccc","ddd"};
        ArrayReturnDemo3 arr = new ArrayReturnDemo3();
        String[] res = arr.arrRetDem3(b);
        for(String x: res){
            System.out.println(x);
        }
    }
}