class Student
{
private int rollNo;
private String name;
void setRollNo(int rollNo)
{
this.rollNo=rollNo;
}
int getRollNo()
{
return rollNo;
}
void setName(String name)
{
this.name=name;
}
String getName()
{
return name;
}
public static void main (String ags[])
{
Student a= new Student();
a.setName("Anindita Ghosh");
a.setRollNo(1);
System.out.println("Name is "+a.getName());
System.out.println("Roll is "+a.getRollNo());
}
}