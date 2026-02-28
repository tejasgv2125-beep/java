package day6.innerClass.staticInnerClass;

public class University
{
    static class Admission
    {
        static boolean isEligible(int marks)
        {
            return marks>=60;
        }
    }
    public static void main(String[] args) {
        boolean result=University.Admission.isEligible(45);//it should be above 60
        System.out.println(result);
        boolean result2=University.Admission.isEligible(63);
        System.out.println(result2);
    }
}
/*
ℹ️Points to remember:
⭐No University object needed
⭐Logical Grouping of data-> imporves readability
⭐Similar to creating utility-helper clases
 */
