// 6. Write a program to define a class called Book with title,author and edition fields. 
// Define suitable constructors for the Book class. Create a list of 6 Book objects and 
// write them to a file. From this file display the books of the author “Harry” on the 
// screen.
import java.util.Scanner;
class Book{
    Scanner in=new Scanner(System.in);
    String title;
    String author;
    int ef;
    void getdata(){
        System.out.println("enter title");
        title=in.next();
        System.out.println("enter author");
        author=in.next();
        System.out.println("enter edition field");
        ef=in.nextInt();
    }
    void harry(){
        if(author=="Harry")
        System.out.println(title);
    }
}
class Lab5{
    public static void main(String[] args) {
        int i=0;
        Book b[]=new Book[6];
        for(i=0;i<6;i++)
        b[i].getdata();
        System.out.println("books with author harry is : ");
        for(i=0;i<6;i++)
        b[i].harry();
    }
}