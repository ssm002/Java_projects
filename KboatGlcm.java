import java.util.Scanner;
public class KboatGlcm
{
public void Glcm(int a, int b) {
int x = a, y = b;
while (y != 0) {
int t = y;
y = x % y;
x = t;
}
int lcm = (a * b) / x;

System.out.println("LCM = " + lcm);
}
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter first number: ");
int x = in.nextInt();
System.out.print("Enter second number: ");
int y = in.nextInt();
KboatGlcm obj = new KboatGlcm();
obj.Glcm(x, y);
}
}