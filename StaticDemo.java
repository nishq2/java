
    class A{
            int k;
          A(int a) {
          k=a;
                   }
           A meth1(int k)
           {
             k+=10;
            return this;
           }
          int disp(){return k;}
          
           public static void main(String args[]){
           A a=new A(3);
           A b=new A(5);
           a=b.meth1(b.k);
            System.out.print(a.disp());
            System.out.print(b.disp());
           }
           }
          

    

