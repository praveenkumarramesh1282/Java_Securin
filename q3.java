public class q3{
public static void main(String[] args)
{
int[] dieA={1,2,3,4,5,6};
int[] dieB={1,2,3,4,5,6};
int c=dieA.length*dieB.length;
int[] sum=calculatesum(dieA,dieB);
System.out.println("Probability of sum:\n");
for(int i=2;i<=12;i++)
{
System.out.printf("P(Sum =%d)=%d/%d\n",i,sum[i-2],c);
}
}
public static int[] calculatesum(int[] dieA,int[] dieB)
{
int[]distribution=new int[11];
for(int i:dieA)
{
for(int j:dieB)
{
int dsum=i+j;
distribution[dsum-2]++;
}
}
return distribution;
}
}