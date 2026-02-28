package day6.arrays;
class Student{
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String n,int id){
        this.name=n;
        this.id=id;
    }
}
public class E7 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0] = new Student();//we can call the objects from the method
        students[0].name="Rahul";
        students[0].USN=113;
        System.out.println(students[0].name+" "+students[0].USN);

        Intern[] intern=new Intern[]{
                new Intern("Tejas G V",113),
                new Intern("Tejas",198),
                new Intern("sheikh",298)
        };
        //The data type is the class itself
        for(Intern i:intern){
            System.out.println(i.name+" "+i.id);
        }


    }

}
