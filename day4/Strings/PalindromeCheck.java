package day4.Strings;

//public class PalindromeCheck {
//    public static void main(String[] args) {
//        StringBuilder original=new StringBuilder("BOB");
//        StringBuilder s1= new StringBuilder("BOB");
//        s1.reverse();
//        if(original.compareTo(s1) == 0){
//            System.out.println("it is the palindrome");
//        }else{
//            System.out.println("it is not the palindrome");
//        }
//    }
//}
public class PalindromeCheck {
    public static void main(String[] args) {
        String str ="madam";
        boolean isPalindrome=true;
        int left=0;
        int right =str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

}
