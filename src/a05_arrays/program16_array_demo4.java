package a05_arrays;

class Student {

    public static void main(String[] args) {
        int[] marks = {91,95,100,89,79,99};
        int total = 0;
        boolean result = true;

        System.out.println("student report card");

        for (int i=0; i<marks.length; i++) {
            System.out.println("subject"+(i+1)+"marks :"+marks[i]);
            total = total + marks[i];
            if(marks[i]<35)
                result = false;
        }
        System.out.println("total marks : "+total);

        int avg = total/marks.length;
        System.out.println("average : "+avg);

        if(result){
            if(avg>=75) {
                System.out.println("Grade : Distinction");
            }
            else if(avg>=60) {
                System.out.println("Grade : First Class");
            }
            else if(avg>=75) {
                System.out.println("Grade : Second Class");
            }
            else  {
                System.out.println("Grade : Third Class");
            }
        }
        else{
            System.out.println("Welcome Again");
        }
    }

}