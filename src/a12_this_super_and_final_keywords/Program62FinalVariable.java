package a12_this_super_and_final_keywords;

class Rectangle{
    void area(final int length, int breadth){
        System.out.println("area: "+(length*breadth));
        breadth = 6;
        System.out.println("area: " +(length*breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area(3,4);
    }
}