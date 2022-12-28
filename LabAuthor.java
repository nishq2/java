// Write a program to define a class called Book with title,author and edition fields. 
// Define suitable constructors for the Book class. Create a list of 6 Book objects and 
// write them to a file. From this file display the books of the author “Harry” on the 
// screen.

import java.util.Scanner;
class Book
{
    Scanner sc= new Scanner(System.in);
    String t;
    String author;
    int ef;
    void getdata()
    {
        System.out.println("Enter book title:");
        t=sc.next();
        System.out.println("Enter author name:");
        author=sc.next();
        System.out.println("Enter edition fields:");
        ef=sc.nextInt();


    }

    void harry()
    {

        if(author=="harry")
        System.out.println(t);
    }
}
    class LabAuthor
    {
        public static void main(String args[])
        {

        
        int i;
        Book b[]= new Book[6];
        for(i=0;i<6;i++)
        {
        b[i].getdata();
        b[i]=new Book()
        System.out.println("The books with author Harry is:");
        for(i=0;i<6;i++)
        b[i].harry();
        
    }
        
    }