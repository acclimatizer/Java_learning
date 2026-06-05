package strings;

class SplittingUSerData {
    public static void main(String[] args) {

        String data = "Jay,Engineer";

        String[] details = data.split(",");

        for(String d : details) {
            System.out.println(d);
        }
    }
}