class day1{
    public static void main(String[] args){
        String name="Krishna";
        double height = 1.5;
        double weight = 45.5;
        int age=22;
        int dailyactivityhours=5;
        int waterIntake=5;
        int SleepHours=9;

        System.out.println("HEALTH AND FITNESS REPORT");
        System.out.println("Name: " + name);

        double BMI=(weight/height*height);
        
        String cat="";
        if(BMI<18.5){
            cat="Underweight";
        }
        else if(BMI>18.5 && BMI<25){
            cat="Normal";
        }
        else if(BMI>25 && BMI<30){
            cat="Overweight";
        }
        else{
            cat="Obese";
        }

        System.out.println("BMI: " +BMI);
        System.out.println("BMI Category: " + cat);

        String dailyactivityhoursstatus="";
        if(dailyactivityhours>=1){
            dailyactivityhoursstatus="Good";
        }
        else{
            dailyactivityhoursstatus="Not Good";
        }
        System.out.println("Activity Status: " + dailyactivityhoursstatus);

        String waterstatus="";
        if(waterIntake>=2){
            waterstatus="Good";
        }
        else{
            waterstatus="Not Good"; 
        }
        System.out.println("Water Intake Status: " + waterstatus);

        String sleepstatus="";
        if(SleepHours>=7 && SleepHours<=9){
            sleepstatus="Healthy";
        }
        else{
            sleepstatus="Unhealthy";
        }

        System.out.println("Sleep Status: " + sleepstatus);

        if (dailyactivityhoursstatus.equals("Good") && waterstatus.equals("Good") && sleepstatus.equals("Healthy")){
            System.out.println("Overall Fitness Status: HEALTHY");
            System.out.println("Message: Continue maintaing the same routine.");
        }
        else{
            System.out.println("Overall Fitness Status: UNHEALTHY");
            System.out.println("Message: Needs Improvement");
        }

    }
}