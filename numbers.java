class numbers{
public static void main(String args[]){
System.out.println("Enter 10 numbers:");
int p=0,n=0,z=0;
int a[]=new int[20];
for(int i=0;i<10;i++)
{a[i]=Integer.parseInt(args[i]);
if(a[i]>0)
{p++;}
else if(a[i]<0)
{n++;}
else
{z++;}
}
System.out.println("Number of positive are "+p);
System.out.println("Number of negative are "+n);
System.out.println("Number of zeroes are "+z);

}
}

