package dsa.bitManipulation;
//for opposite sign if we do xor idf it is less than 0 opposite sign else same

public class OppositeSign {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if ((a ^ b) < 0) {
            System.out.println(("Opposite Signs"));

        } else {
            System.out.println("same sign");
        }
    }
}