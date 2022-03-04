import java.util.*;

class p_4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Value For A :");
        a = sc.nextInt();
        
        System.out.println("Enter Your Value For B :");
        b = sc.nextInt();

        System.out.println("Enter Your Value For C :");
        c = sc.nextInt();


        if (a>b) {
            if (a>c) {
                System.out.println(a+ " is greather than " +b+ " and " +c); //A
            } else {
                System.out.println(c+ " is greather than " +a+ " and " +b); //B
            }
        }
        else {
            if (b>c) {
                System.out.println(b+ " is greather than " +a+ " and " +c); //C
            }
            else {
                System.out.println(c+ " is greather than " +a+ " and " +b); //D
            }
        }
    }
}

/* 
a = 50
b = 30 
c = 100

a > b
50 > 30
a > c
b > c
*/