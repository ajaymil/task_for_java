import java.util.Scanner;

class Iput{
    public  void get_inp(){
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter String :");
        String str1=sc.nextLine();
        System.out.print("enter the letter:");
       char ch2=sc.next().charAt(0);
          //String ch2=sc.nextLine();
         int c=0;
         for(int i=0;i<str1.length();i++){
              if(str1.charAt(i)==ch2)
                {
                System.out.println(i);
                c++;
                 for( int j=0;j>=i;j++){
                  
                  
                    //System.out.println(j);
                    break;


                                }
                                
            }
           
            // System.out.println("no.of .letter +ch2"+"is "+c );
           //  continue;
         }
         System.out.println("no.of .letter " +ch2+ " is "+c );
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

         System.out.println("\n");
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
System.out.println(str1.charAt(j));

j++;

             }
             
           
            // System.out.println("no.of .letter +ch2"+"is "+c );
           //  continue;
         }
//////////////////////////////////////////////////////////////


         
             
          
         }


    }


    

public class Pstr {
    public static void main(String[] args) {
        Iput gi=new Iput();
        gi.get_inp();
       
    }
    
    
}
