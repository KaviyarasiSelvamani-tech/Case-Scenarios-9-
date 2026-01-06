class Payment {
void pay(int amount){
System.out.println("Payment done");
}
}

class CreditCardPayment extends Payment {
void pay(int amount){
System.out.println("Paid using Credit Card: "+amount);
}
}

class UPIPayment extends Payment {
void pay(int amount){
System.out.println("Paid using UPI: "+amount);
}

public static void main(String[] args){
Payment p;

p=new CreditCardPayment();
p.pay(500);

p=new UPIPayment();
p.pay(300);
}
}