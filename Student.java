class Student {
String name;
int rollNumber;
int marks;

void setDetails(String n,int r,int m){
name=n;
rollNumber=r;
marks=m;
}

void displayDetails(){
System.out.println("Name: "+name);
System.out.println("Roll No: "+rollNumber);
System.out.println("Marks: "+marks);
}

boolean isPassed(){
if(marks>=40)
return true;
else
return false;
}

public static void main(String[] args){
Student s1=new Student();
Student s2=new Student();

s1.setDetails("Arun",1,75);
s2.setDetails("Bala",2,35);

s1.displayDetails();
System.out.println("Passed: "+s1.isPassed());

System.out.println();

s2.displayDetails();
System.out.println("Passed: "+s2.isPassed());
}
}