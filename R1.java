class R
    {
        int fact(int n)
        {
            int result;
            if (n==1) 
            
                
            result=1;
            result = n*fact(n - 1);
            return result;
        }
    }
    class R1
    {
        public static void main(String args[])
        {
            R obj = new R() ;
            System.out.print(obj.fact(5));
        }
    }
