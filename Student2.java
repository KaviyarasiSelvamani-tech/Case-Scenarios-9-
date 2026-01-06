class Student2 {
public String name;
private int marks;
protected String grade;
int rollNumber;

public void setMarks(int m){
if(m>=0 && m<=100){
marks=m;
calculateGrade();
}
}

private void calculateGrade(){
if(marks>=80)
grade="A";
else if(marks>=50)
grade="B";
else
grade="C";
}

public String getGrade(){
return grade;
}

protected void displayBasicInfo(){
System.out.println(name+" "+rollNumber);
}

public static void main(String[] args){
Student s=new Student();
s.name="Ravi";
s.rollNumber=10;
s.setMarks(85);

s.displayBasicInfo();
System.out.println("Grade: "+s.getGrade());
}
}