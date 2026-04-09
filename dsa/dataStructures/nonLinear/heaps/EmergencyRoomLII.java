package dsa.dataStructures.nonLinear.heaps;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

//ℹ️⭐⭐⭐ℹ️Comparator:to compare the Multiple value
class patient{
    String name;
    int severity;//1=high,3=medium,5=low
    LocalDateTime arrivalTime;
//💠to create the constructor easily in
    public patient(String name, int severity, LocalDateTime arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }
    @Override
    public String toString(){
        return name +"(severity="+severity+",arrivalTime="+arrivalTime+")";
    }
}
public class EmergencyRoomLII {
    public static void main(String[] args) {
        //Custom Comparator:first by severity,then by arrival time
        Queue<patient> queue = new PriorityQueue<>(
                (p1,p2) -> {
                    if(p1.severity!= p2.severity){
                        return Integer.compare(p1.severity, p2.severity);
                    }else{
                        return p1.arrivalTime.compareTo(p2.arrivalTime);
                    }
                }
        );
        //Simulating arrivals with actual time stamp
        queue.offer(new patient("Allen",3,LocalDateTime.of(2020,4,9,10,0,0)));
        queue.offer(new patient("Joe",1,LocalDateTime.of(2020,4,9,10,5,0)));
        queue.offer(new patient("Britney",1,LocalDateTime.of(2020,4,9,10,2,0)));
        //Let's print the patient who's treated first
        patient treated=queue.poll();
        System.out.println("Patient that gets operated first:"+treated);
        //Remaining patients
        System.out.println("Patients in queue"+queue);
    }

}
