class AreaShape{
void area(int a,int b){
System.out.println("Area of rectrangle is = " + (a*b));
}
void area(int a){
System.out.println("Area of square is = " + (a*a));
}
void area(int a,int b,int c){
double s=(a+b+c)/2;
double triArea;
triArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of triangle is = " + triArea);
}
}
public class AreaOverload {
public static void main (String[] args){
AreaShape obj =new AreaShape();
obj.area(10);
obj.area(5,6);
obj.area(4,5,6);
}
}
