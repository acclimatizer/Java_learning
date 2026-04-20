package a07_oops_basics;

class Customer {
    int custId = 54321;
    int bill = 341;
    int discount = 20;
}

class ReturningObject{
    public static void main(String[] args) {

        ReturningObject obj = new ReturningObject();
        Customer c1 = obj.returnObject();
        System.out.println(c1.custId);
        System.out.println(c1.bill);

    }
    Customer returnObject(){
        Customer cust = new Customer();
        return cust;
    }
}