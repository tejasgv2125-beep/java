package day4.Strings;
public class builderExample {
    public void stringInsert() {
        StringBuilder builder = new StringBuilder("JA");
        System.out.println("Old String " + builder);
        builder.insert(1,"AV");
        System.out.println("New string " + builder);
    }

    public void stringAppend() {
    	StringBuilder buffer = new StringBuilder("BOBZY");
        System.out.println("Old String " + buffer);
        buffer.append("THE KING");
        System.out.println("New string " + buffer);
    }


    public void stringReverse() {
    	StringBuilder buffer = new StringBuilder("NOHYTP");
        System.out.println("Old String " + buffer);
        buffer.reverse();
        System.out.println("New string " + buffer);
    }

    public static void main(String[] args) {
        new builderExample().stringInsert();
        new builderExample().stringAppend();
        new builderExample().stringReverse();
    }
}