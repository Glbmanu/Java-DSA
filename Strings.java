import java.util.Scanner;

public class Strings {
    public static void printletters(String str){

        for (int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static boolean ispalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i)!= str.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        char arr[]={'a','b','c','d'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);

//        String fullname = "Manu Sharma";
//        System.out.println(fullname.length());

        // conactenantion
//        String fname = "manu";
//        String lname ="12345";
//        String fullname = fname + " " + lname;
//      System.out.println(fullname);
//        System.out.println(fullname.charAt(1));
//        printletters(fullname);

        // Check string is palindrome or not -- madam ,noon

 /*      String str = "racecar";
        System.out.println(ispalindrome(str));

        String s1 = "manu";
        String s2 = "manu";
        String s3 = new String("manu");
        if(s1 == s2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if (s1 == s3 ){
            System.out.println("Equal");
        }else {
            System.out.println("not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        */

  /*      // Q3 - given string print the largest string

        String fruits[]={"apple","banana","mango"};

        String largest = fruits[0];
        for(int i = 0; i< fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
   */


               // String Builder

       StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
