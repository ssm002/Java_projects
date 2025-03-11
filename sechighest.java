import java.util.Scanner;
class sechighest
{
public static void main (String args[])
{
int n=5,i,max1,max2,num;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the first number");
num=sc.nextInt();
max1=num;//assume that the first number is the highest
max2=0; //assume second highest is zero initially
System.out.println("Enter values");
for(i=1;i<n;i++)
{
num=sc.nextInt();

if(num>max1)
{
max2=max1; //if the number entered is greater than max1,the value of max1 is assigned to max2
max1=num; //then max1 is assigned the current value of num
}
else if(num>max2)
{
max2=num; //if the entered number is lesser than max1 but greater than max2,we assign it to max2
}

}

System.out.println("max1="+max1);
if(max2==0) //max2=0 means no number was assigned to max2 ie second highest value not found
{ 
System.out.println("Second highest number not found");

}
else{
System.out.println("max2="+max2);
}

}
}