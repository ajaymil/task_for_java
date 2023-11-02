public class aver {
    static int chk_ave(int a,int b,int c){
        int tot=a+b+c;
        int av=tot/3;
        System.out.println("ans = "+av);
        return av;


    }
    public static void main(String[] args) {
        chk_ave(25,65,45);
    }
    
}
