
public class CalculateSIbmi {

    public static void main(String[] args) {
        double Principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double simpleInterest = Principal * rate * time / 100.0;

        double totalAmount = simpleInterest + Principal;
        double Weight = 72.0;
        double Height = 1.8;

        double bmi = Weight / (Height * Height);
        int m1 = 78, m2 = 84, m3 = 69, m4 = 91, m5 = 88;
        int totalmarks = m1 + m2 + m3 + m4 + m5;
        double percentage = totalmarks * 100.0 / 500;
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI:" + bmi);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + percentage);
    }
}
