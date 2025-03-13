class hcf
{
public static void main(String args[])
{
  //AAAAAAAA
int a=8,hcf=0;
int b=10;
int x,y,z;
for(int i=1;i<=b;i++)
{

if(a%i==0 && b%i==0)
{
hcf=i;
}
}

System.out.println("The hcf is..."+hcf);
}
}
