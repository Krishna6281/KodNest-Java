
import java.util.*;

class Scanner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("entert b");
        byte b = sc.nextByte();
        System.out.println("Byte : " + b);
        System.out.println("enter c");
        short c = sc.nextShort();
        System.out.println("short : " + c);
        System.out.println("enter d");
        long d = sc.nextLong();
        System.out.println("long : " + d);
        System.out.println("enter e");
        float e = sc.nextFloat();
        System.out.println("float : " + e);
        System.out.println("enter f");
        double f = sc.nextDouble();
        System.out.println("double : " + f);
        System.out.println("enter g");
        boolean g = sc.nextBoolean();
        System.out.println("boolean : " + g);
    }
}
