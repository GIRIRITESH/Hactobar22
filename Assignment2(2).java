class Exception2(2){
public static void main(String ags[]){
try{
int a=25/0;
System.out.println(In First Try block");
try{
int b[]=new int[5];
b[2]=0;
try{
String s="Rian";
System.out.println(s.charAt(7));
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("EXception");
System.out.println(e..getMessage());
}
}
catch(ArithmeticException e)
{
System.out.println("EXception");
System.out.println(e.getMessage());
}
}
}