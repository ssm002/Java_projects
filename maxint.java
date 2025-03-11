public class maxint {
    
static int Findmax(int...A )
{
    if(A.length==0)
    return Integer.MIN_VALUE;
    
    int max=A[0];
    for(int i=1;i<A.length;i++)
    {
      if (max<A[i])
      {
        max=A[i];
      }



    }

   return max;
}
public static void main(String[] args) {
    int x=Findmax(1,2,3,4,5);
    System.out.print(x);

}



}
