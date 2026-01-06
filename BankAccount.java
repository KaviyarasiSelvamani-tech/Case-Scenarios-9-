class BankAccount {
int accountNumber;
double balance;

BankAccount(){
accountNumber=0;
balance=0;
}

BankAccount(int accNo,double initialBalance){
accountNumber=accNo;
balance=initialBalance;
}

void deposit(double amount){
balance=balance+amount;
}

void withdraw(double amount){
if(amount<=balance)
balance=balance-amount;
}

void displayAccount(){
System.out.println(accountNumber+" "+balance);
}

public static void main(String[] args){
BankAccount b1=new BankAccount();
BankAccount b2=new BankAccount(201,500);

b1.displayAccount();
b2.deposit(200);
b2.displayAccount();
}
}
