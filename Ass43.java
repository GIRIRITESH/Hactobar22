class Fruit{
String name;
String color;
Fruit(String name, String color){
this.name=name;
}
}
class Apple extends Fruit {
Apple(String name,String color){
super(name,color);
}
void display(){
System.out.println("Name is "+name+" color is "+color);
}
}
class Strawbwrry extends Fruit{
Strawbwrry(String name,String color){
super(name,color);
}
void display(){
System.out.println("Name is "+name+" color is "+color);
}
}
class Banana extends Fruit{
Banana(String name,String color){
super(name,color);
}
void display(){
System.out.println("Name is "+name+" color is "+color);
}
}
class Orange extends Fruit{
Orange(String name,String color){
super(name,color);
}
void display(){
System.out.println("Name is "+name+" color is "+color);
}
}
class Ass43{
public static void main(String ags [])
{
Fruit f;
Apple f=new Apple("Apple","Red");
f.display();
Strawbwrry f1=new Strawbwrry("Strawbwrry","Deep Red");
f1.display();
Banana f2=new Banana("Banana","Yellow");
f2.display();
Orange f3=new Orange("Orange","Orange");
f3.display();
}
}

