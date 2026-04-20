package a07_oops_basics;


class ArrayReturnDemo2 {
    String[] arrRetDem2() {
        String[] a = {"aaa","bbb","ccc","ddd"};
        return a;
    }

    public static void main(String[] args) {
        ArrayReturnDemo2 arr = new ArrayReturnDemo2();
        String[] res = arr.arrRetDem2();
        for(String x: res){
            System.out.println(x);
        }
    }
}
