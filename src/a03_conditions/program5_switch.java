package a03_conditions;

class SwitchDemo {

    public static void main (String[] args) {

        int ch = 2;

        switch(ch) {

            case 1: System.out.println("First Choice");
                    break;

            case 2: System.out.println("Second Choice");
                    break;

            case 3: System.out.println("Third Choice");
                    break;

            case 4: System.out.println("Fourth Choice");
                    break;

            default:System.out.println("Wrong Choice");
        }
    }
}