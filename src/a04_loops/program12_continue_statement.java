package a04_loops;

class ContinueDemo {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++){
            if(i==7|i==13)
                continue;
            System.out.println(i);
        }
    }
}