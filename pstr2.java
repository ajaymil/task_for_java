import java.util.Scanner;



class fun {
    public void st_fun(String str1,char ch2) {
        
        int c = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch2) {
                System.out.println(i);
                c++;
            }
        }

        System.out.println("Number of letter " + ch2 + " is " + c);
    }
}

class mention {
    public void men(String str1,char ch2) {
        int j=0;
           for(int i=0;i<str1.length();i++){
         //   System.out.println(str1.charAt(i));
             while(j<str1.length()){
                if(str1.charAt(j)==ch2){
                j++;
                System.out.println("mention letter");
                continue;
                            
                }
          System.out.println(str1.charAt(j));

j++;
                    
             }
             
           
            // System.out.println("no.of .letter +ch2"+"is "+c );
           //  continue;
         }

    }
}
class non{
  public void nonmension(String str1,char ch2)
  {
   int cot=0;
  for (int s = 0; s < str1.length(); s++){
       if (str1.charAt(s) == ch2) {
         continue;
               
            }
            
            
            
    
    
 for( int b=0;b<=s;b++){
                     if(str1.charAt(s) == ch2)   
                       {                              //System.out.println(j);
                    break;
                                }
                               
                               

                            }
                                cot++;
        }
     
        System.out.println(cot);
  }
}

public class pstr2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
         String str1= sc.nextLine();
         System.out.print("Enter the letter: ");
        char ch2=sc.next().charAt(0); 

         fun nn = new fun();
        nn.st_fun(str1,ch2);

        mention ns = new mention();
        ns.men(str1,ch2);
        non w=new non();
        w.nonmension(str1, ch2);
    }
}
