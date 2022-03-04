import java.util.*;

class p_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Value For A :");
        a = sc.nextInt();
        
        System.out.println("Enter Your Value For B :");
        b = sc.nextInt();

        if (a>b) {
            System.out.println(a+ " is Greater Than " +b);
        } else {
            System.out.println(b+ " is Greater Than " +a);
        }
    }
}
