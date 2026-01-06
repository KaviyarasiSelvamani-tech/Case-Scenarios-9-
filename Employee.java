class Employee {
static String companyName="ABC Company";
static int employeeCount=0;

int employeeId;
String employeeName;

Employee(String name){
employeeName=name;
employeeCount++;
employeeId=employeeCount;
}

static int getEmployeeCount(){
return employeeCount;
}

void displayEmployee(){
System.out.println(employeeId+" "+employeeName+" "+companyName);
}

public static void main(String[] args){
Employee e1=new Employee("Anu");
Employee e2=new Employee("Kumar");

e1.displayEmployee();
e2.displayEmployee();

System.out.println("Total Employees: "+getEmployeeCount());
}
}