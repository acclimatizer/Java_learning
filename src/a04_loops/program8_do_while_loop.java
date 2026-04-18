
package a04_loops;

class DoWhileDemo {

    public static void main(String[] args) {
        int n=9, i=1;

        do{
            System.out.println(n + "*" + i + "=" + (n*i));
            i++;
        } while(i<=10);
    }

}