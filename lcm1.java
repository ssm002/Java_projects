class lcm1
{
public static void main(String args[])
{
int a=2,lcm=0;
int b=8;
for(int i=8; ;i++)
{

if(i%a==0 && i%b==0)
{
lcm=i;
break;
}
}

System.out.println(lcm);
}
}
