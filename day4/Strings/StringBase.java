package day4.Strings;
public class StringBase {
    public static void main(String[] args) {
        char[]letters={'B','A','B','U'};
        String name = new String(letters);
        System.out.println(name);
        String jumbled="Babu1IsFrom1ISE1BSection";
        String[] words= jumbled.split("1");
        System.out.println(words[3]);
        for(Object o :words){
            System.out.println(o+" ");
        }
    }
}