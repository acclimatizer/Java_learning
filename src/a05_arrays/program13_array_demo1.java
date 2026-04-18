package a05_arrays;

class ArrayDemo {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        for(int i = 0; i<arr.length; i++) {

            System.out.println(arr[i]);

        }
        for(int x:arr){
            System.out.println(x);
        }
    }

}