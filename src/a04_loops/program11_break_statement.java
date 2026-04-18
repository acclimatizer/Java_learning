package a04_loops;

class BreakDemo {

    public static void main(String[] args) {

        int capacity = 17;

        for (int i=0;i<=100;i++){

            System.out.println("number is " + i);

            if(i>=capacity) {
                System.out.println("Capacity is reached");
                break;
            }

        }

    }

}