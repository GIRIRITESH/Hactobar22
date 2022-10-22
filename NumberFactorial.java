class NumberFactorial {
public static void main(String[] args) {
int num = 5;
int fact = num;
for(int i =(num - 1) ; i > 1; i--)
{
fact = fact * i;
}
System.out.println("Factorial of a number is " + fact);
}
}
