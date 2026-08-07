
import java.util.*;

class Userinput1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("Age : " + age);
        System.out.println("enter height");
        float height = sc.nextFloat();
        System.out.println("Name : " + height);

        sc.nextLine();
        System.out.println("entr full name");
        String fname = sc.nextLine();
        System.out.println("Full name: " + fname);

    }
}
