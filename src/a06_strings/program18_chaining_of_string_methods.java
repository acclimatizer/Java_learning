package a06_strings;

class ChainStrMethods {

    public static void main(String[] args) {
        String str = new String("core");
        System.out.println(str.concat("java").substring(4).concat("program").substring(4,8).replace('z','n').toUpperCase().charAt(2));
    }

}