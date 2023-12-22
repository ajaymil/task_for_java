import java.util.Scanner;
class user_ip{
    public String enter_String(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter String :");
          String str1 = sc.nextLine();
 return str1;
    }

  public char enter_char(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the letter:");
       char ch2 = sc.next().charAt(0);
 return ch2;
  }
    
}
class fun {
    public void st_fun(){
        user_ip user=new user_ip();
       String str1=user.enter_String();
       char ch2=user.enter_char();
      /* System.out.println(str1);
       System.out.println(ch2);
       */
      int c = 0;
         for(int i=0;i<str1.length();i++)
         {
              if(str1.charAt(i)==ch2)
            {
                System.out.println(i);
                c++;
                 for( int j=0;j>=i;j++)
                 {
                  
                  
                    //System.out.println(j);
                    break;


                 }
                                
            }
           /* else
            {
                System.out.println("letter not found ");
                break;

            }*/
           
            // System.out.println("no.of .letter +ch2"+"is "+c );
           //  continue;
         }

         System.out.println("no.of .letter " +ch2+ " is "+c );
        
        

    }
}
/*class mention{
    public void men(){
user_ip user=new user_ip();
       String str1=user.enter_String();
       char ch2=user.enter_char();

         System.out.println(str1);
         System.out.println("\n");
         int j=0;
           for(int i=0;i<str1.length();i++){
         //   System.out.println(str1.charAt(i));
             while(j<str1.length()){
                if(str1.charAt(j)==ch2){
                j++;
                System.out.println("mention letter");
                continue;
                            
                }
          System.out.print(str1.charAt(j)+" ");

j++;
                    
             }
             
           
            // System.out.println("no.of .letter +ch2"+"is "+c );
           //  continue;
         }




    }
}*/
public class pstr2 {
    public static void main(String[] args) {
        fun nn=new fun();
        nn.st_fun();
       /*  mention ns=new mention();
        ns.men();*/

    }
    
}
