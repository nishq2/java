class  TestByteQ{
public static void main(String args[])
{
    double num[] = {5.5, 10.3, 11, 12.8, 56.9, 2.5};
double result=0;
for (int i = 0; i < 5; ++i) 
result = result + num[i];
System.out.print(result%6);


} 
    
}