import java.util.Scanner;

public class mid {
    static void mil(){
        Scanner sos=new Scanner(System.in);
        System.out.print("enter the  any word = ");
        String word=sos.nextLine();
        int pos;
        int l;
        if(word.length()%2==0){
           pos=word.length()/2-1;
           l=1;
            System.out.println("middle letter in string = "+word.substring(pos,pos+2) );
      
        }
        else{
             pos=word.length()/2;
           l=1;
                    System.out.println("middle letter in string = "+word.charAt(pos) );
      System.out.println("position of letter in string = "+(pos+1) );
        }
        
    }
    public static void main(String[] args) {
        mil();
    }
    
}
