package a07_oops_basics;


class ArrayReturnDemo1 {
    int[] arrRetDem1() {
        int[] a = {1,2,3,4,5,6};
        return a;
    }

    public static void main(String[] args) {
        ArrayReturnDemo1 arr = new ArrayReturnDemo1();
        int[] res = arr.arrRetDem1();
        for(int x: res){
            System.out.println(x);
        }
    }
}