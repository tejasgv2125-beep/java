package Day5.exceptions;

public class E3 {
    static void checkAge(int age){
        if (age>=18){
            System.out.println("Elligible-Acces");
        }else{
            throw new RuntimeException("not eligible-Access denied");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
        checkAge(19);
    }
}
