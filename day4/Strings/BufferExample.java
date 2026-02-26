package day4.Strings;


public class BufferExample {
    public void stringInsert() {
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Old String " + buffer);
        buffer.insert(1,"AV");
        System.out.println("New string " + buffer);
    }

    public void stringAppend() {
        StringBuffer buffer = new StringBuffer("BOBZY");
        System.out.println("Old String " + buffer);
        buffer.append("THE KING");
        System.out.println("New string " + buffer);
    }


    public void stringReverse() {
        StringBuffer buffer = new StringBuffer("NOHYTP");
        System.out.println("Old String " + buffer);
        buffer.reverse();
        System.out.println("New string " + buffer);
    }

    public static void main(String[] args) {
        new BufferExample().stringInsert();
        new BufferExample().stringAppend();
        new BufferExample().stringReverse();
    }
}