// A  post  office  charges  parcel  senders  according  to  the  weight  of  the  parcel.  
// For each parcel having weight 2 Kg or less, the charge is Rs 32.50 and for each extra Kg, 
// there is an additional charge of Rs 10.50.Create a class with necessary fields for  storing  customer  name,  
// parcel  id  and  parcel  weight. Use  constructor  & methods for storing & processing the parcel details. 
// Create an array of objects to process the charges of ‘n’ parcels.

import java.util.Scanner;
class Box
{
    Scanner sc= new Scanner(System.in);
    
    String n;
    double cost;
    float w;
    int id;
    public
    Box(String name,double c, float weight, int val)
    {
        this.name=name;
        this.cost=cost;
        this.weight=weight;
        this.id=v;
    }
    void getdata()
    {
        System.out.println("Enter name");
        n=sc.nextLine();
        System.out.println("Enter parcel ID");
        val=sc.nextInt();
        System.out.println("Enter total weight");
        w=sc.nextFloat();
    }

    void compute()
    {

        if(w<=2.0)
        {
            cost = 32.50;
        }

        else
        {
            cost= 32.50+((w-2.0)*10.50);
           
        }
    }

    void display()
    {
        System.out.println("Name:"+n+"\nCost:"+c+"\nID:"+id+"Weight:"+w);
    }
}

class Parcel
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total number of parcels");
        n=sc.nextInt();
        Box b[]= new Box[n];
        for(i=0; i<n; i++)
        {
            b[i].getdata();
            b[i].compute();
            b[i] = new Box(name, c, weight, val);
        }

        for(i=0; i<n; i++)
        {
            b[i].display();
        }



        sc.close();
    }
}