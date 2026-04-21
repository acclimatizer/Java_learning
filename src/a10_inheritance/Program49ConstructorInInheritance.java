package a10_inheritance;

class Cone2 {
    Cone2(){
        System.out.println("cone constructor");
    }
}

class ConeTwo extends Cone2{
    ConeTwo() {
        System.out.println("coneTwo constructor");
    }
}

class ConeThree extends ConeTwo{
    ConeThree() {
        System.out.println("coneThree constructor");
    }
}

class InheritanceExample2{
    public static void main(String[] args) {
        ConeThree c = new ConeThree();
    }
}