package day4.Strings;

public class CharacterFrequency {
    public static void main(String[] args) {
        System.out.println('a'-'a');//65-65
        System.out.println('A'-'a');//65-97
        System.out.println((char)('A'+32));//to convert to small letter we use +32
        System.out.println((char)('a'-32));//to conver to large letter we use -32
        //to calculate the frequency
        String str="sapthagiri";
        int[] freq= new int[26];//All alphabets included
        //Pan-gram
        //A quick brown fox jumps over the lazy dag
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a')+"->"+freq[i]);
            }
        }
    }
}
