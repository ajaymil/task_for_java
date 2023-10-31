

import java.util.Scanner;
public class vovels {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "enter String=");
        String a=input.nextLine();
        String A="";
        char s=' ';
        char S=' ';
        String vol="";
        char v[]={'a','e','i','o','u'};
        char arr[] = new char[a.length()];
        for (int i=0;i<a.length();i++) {
            s = a.charAt(i);
            for (int j=0;j<v.length;j++){
                if(a.charAt(i)==v[j]) {
                    vol = vol + a.charAt(i);
                    break;
                }
            }

        }
        System.out.println(vol);
        System.out.println("lenght of vovel= "+vol.length()+" vovel in "+a+"is  = "+vol);
       /* System.out.println("");
        System.out.println(Arrays.toString(arr));*/
        System.out.println("\n");
        char n=' ';
        String con="";
        char w[]={'b', 'c', 'd', 'd', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z'};

        for (int i=0;i<a.length();i++) {
            S = a.charAt(i);
            for (int j=0;j<w.length;j++){
                if(a.charAt(i)==w[j]) {
                    con = con + a.charAt(i);
                    break;
                }
            }

        }
        System.out.println(con);
        System.out.println("lenght of con= "+con.length()+" con in "+a+"is  = "+con);
    }
}
