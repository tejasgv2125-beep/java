package day6.innerClass.localInnerClass;
import java.time.LocalDate;
public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calculate(){
                if(marks>=75)return "Distinction";
                else if(marks>=60)return "First class";
                else return "Pass";
            }
        }
        GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        LocalDate date = LocalDate.now().plusDays(5);//to print todays date we need this method
        LocalDate date1= LocalDate.now();
        //⭐(interview question) if we use .plusDays we can extend the date
        //⭐(interview question)if we use .minusDays we can reduce the date
        System.out.println("The exam is:"+date1);
        System.out.println("The exam is:"+date);
    }
    public static void main(String[] args) {
        Exam exam=new Exam();
        exam.evaluate(80);
        exam.evaluate(69);
        exam.displayExamDate();
    }
}
/*
ℹ️Points to remember
⭐Grade logic is scoped to the evaluate method
⭐It avoids polluting the class with helper method
⭐It helps in designing the codebase in a cleaner way
 */

