public class arithops {
    
    public static void main(String[] args) {
    add(2, 5);
    sub(5, 6); 
    mul(5, 2);  
    div(65, 5) ;
    }
      public static int add (int a,int b)
    {
    int c=a+b;
    System.out.println("add= "+c);
return c;
    }
    public static int sub (int a,int b)
    {
    int c=a-b;
    System.out.println("sub= "+c);
return c;
    }
     public static int mul (int a,int b)
    {
    int c=a*b;
    System.out.println("mul= "+c);
return c;
    }
     public static int div (int a,int b)
    {
    int c=a/b;
    System.out.println("div= "+c);
return c;
    }
}
