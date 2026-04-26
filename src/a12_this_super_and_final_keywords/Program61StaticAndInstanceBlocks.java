package a12_this_super_and_final_keywords;

class StaticAndInstanceBlocksExamples{
    static{
        System.out.println("static block one");
    }
    {
        System.out.println("Instance block one");
    }
    StaticAndInstanceBlocksExamples(){
        System.out.println("sample zero constructor");
    }
    StaticAndInstanceBlocksExamples(int x){
        System.out.println("Sample Para Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Sample main method");
        StaticAndInstanceBlocksExamples s1 = new StaticAndInstanceBlocksExamples();
        StaticAndInstanceBlocksExamples s2 = new StaticAndInstanceBlocksExamples(6);
    }
    {
        System.out.println("instance block 2");
    }
    static {
        System.out.println("static block 2");
    }

}