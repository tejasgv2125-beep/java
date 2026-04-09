package dsa.dataStructures.nonLinear.heaps;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new LinkedList<>();
        //1->High Priority
        //5->Lowest priority
        //3->Medium Priority
        severity.add(5);
        severity.add(3);
        severity.add(1);
        System.out.println("The patient that gets operated first is Patient"+severity.poll());
        System.out.println("Ptient in queue"+severity);
    }
}
