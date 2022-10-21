class Animal{
void eating(){
System.out.println("Eating... ");
}
}
class Dog extends Animal{
void barking(){
System.out.println("Barking... ");
}
public static void main(String ags[]){
Dog d=new Dog();
d.eating();
d.barking();
}
}