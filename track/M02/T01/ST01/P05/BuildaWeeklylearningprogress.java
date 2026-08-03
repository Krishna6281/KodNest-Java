
public class BuildaWeeklylearningprogress {

    public static void main(String[] args) {
        int Completetopic = 17;
        int Totaltopics = 20;
        int DailyLearninghours = 3;
        int LearningDays = 5;
        int Remainingtopics = Totaltopics - Completetopic;
        int weeklyLearninghours = DailyLearninghours * LearningDays;
        double progressPercentage = (double) Completetopic * 100 / Totaltopics;
        System.out.println("Completed Topics: " + Completetopic);
        System.out.println("Remaining Topics: " + Remainingtopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearninghours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
