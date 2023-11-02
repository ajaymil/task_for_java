import java.util.Scanner;

public class copyarr {
   public static void find_small(){
        Scanner ob=new Scanner(System.in);
System.out.print("enter num1= ");
int n1=ob.nextInt();
 System.out.print("enter num2= ");
int n2=ob.nextInt();
 System.out.print("enter num3= ");
int n3=ob.nextInt();
if(n1<n2 &&n1<n3){
    System.out.println(n1+" is smaller than all ");
}
else if(n2<n1 &&n2<n3){
    System.out.println(n2+"is smaller than all ");
}
else if(n3<n1 &&n3<n2){
    System.out.println(n3+" is smaller than all ");
}
else {
    System.out.println("all are equal");
}


    }

    public static void main(String[] args) {
find_small();
        
    }
    
}
