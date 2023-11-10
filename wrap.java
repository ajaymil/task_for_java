import java.util.Arrays;
import java.util.Scanner;

public class wrap {
    public static void get_string () {
        Scanner o=new Scanner(System.in);
        System.out.print("enter the string  ");
        String ae=o.nextLine();
        System.out.println(ae);
        char St=' ';
        char at[]=new char[ae.length()];
        int i;
        for( i=0;i<ae.length();i++)
        {
            St=ae.charAt(i);
           // System.out.println(St);

              at[i]=St;

              


            
          
 
        }
              System.out.println(Arrays.toString(at));
             /*for(int j=1;j<=at.length-1;j++){
              System.out.println(at[0]+","+at[j]);
              
             
             }
            
             for(int j=0;j<=at.length-1;j++){
                if(at[j]!=at[j])
              System.out.println(at[1]+","+at[j]);
             
             }*/
             int cont=1;
             for(int x=0;x<at.length;x++){
                
                for(int y=x;y<at.length;y++)
                {
                    if(at[x]==at[y]){
                        continue;
                    }
                   cont=cont+x; 
                    System.out.println("["+at[x]+""+at[y]+"]");

                }
                


             }
 System.out.println(cont);

              
    }
    public static void main(String[] args) {
        get_string();
      
    }
    
}
